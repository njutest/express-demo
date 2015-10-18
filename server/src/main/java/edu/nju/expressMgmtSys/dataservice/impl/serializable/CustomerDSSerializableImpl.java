package edu.nju.expressMgmtSys.dataservice.impl.serializable;

import edu.nju.expressMgmtSys.dataservice.CustomerDataService;
import edu.nju.expressMgmtSys.po.CustomerPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDSSerializableImpl implements CustomerDataService{
    public static final String CUSTOMER_FILE_PATH = "serializable-data/customers";

    @Override
    public int addCustomer(CustomerPO customerPO) {
        try {
            List<CustomerPO> customerPOs = getCustomers();
            int id = customerPOs.size();
            customerPO.setId(id);
            customerPOs.add(customerPO);

            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(CUSTOMER_FILE_PATH));
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
        File file = new File(CUSTOMER_FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream(CUSTOMER_FILE_PATH));
        List<CustomerPO> customerPOs = (List<CustomerPO>) is.readObject();
        is.close();
        return customerPOs;
    }
}
