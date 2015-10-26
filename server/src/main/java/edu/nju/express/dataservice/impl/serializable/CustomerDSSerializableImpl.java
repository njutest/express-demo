package edu.nju.express.dataservice.impl.serializable;

import edu.nju.express.dataservice.CustomerDataService;
import edu.nju.express.po.CustomerPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDSSerializableImpl implements CustomerDataService{

    @Override
    public int addCustomer(CustomerPO customerPO) {
        try {
            List<CustomerPO> customerPOs = getCustomers();
            int id = customerPOs.size();
            customerPO.setId(id);
            customerPOs.add(customerPO);

            File file = SerializableFileHelper.getCustomerFile();
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(file));
            os.writeObject(customerPOs);
            os.flush();
            os.close();
            return id;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public CustomerPO getCustomer(int id) {
        try {
            List<CustomerPO> customerPOs = getCustomers();
            for (CustomerPO customerPO : customerPOs) {
                if (id == customerPO.getId()) {
                    return customerPO;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<CustomerPO> getCustomers() throws IOException, ClassNotFoundException {
        File file = new File(SerializableFileHelper.DIRECTORY_PATH,
                SerializableFileHelper.CUSTOMER_FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream(file));
        List<CustomerPO> customerPOs = (List<CustomerPO>) is.readObject();
        is.close();
        return customerPOs;
    }
}
