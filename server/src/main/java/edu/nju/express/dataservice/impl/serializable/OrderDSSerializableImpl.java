package edu.nju.express.dataservice.impl.serializable;

import edu.nju.express.dataservice.OrderDataService;
import edu.nju.express.po.OrderPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDSSerializableImpl implements OrderDataService{

    @Override
    public void addOrder(OrderPO orderPO) {
        try {
            List<OrderPO> orderPOs = getOrders();
            orderPOs.add(orderPO);

            File file = SerializableFileHelper.getOrderFile();
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(file));
            os.writeObject(orderPOs);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<OrderPO> getOrders() {
        try {
            File file = new File(
                    SerializableFileHelper.DIRECTORY_PATH,
                    SerializableFileHelper.ORDER_FILE_NAME);
            if (!file.exists()) {
                return new ArrayList<>();
            }

            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream(file));
            List<OrderPO> orderPOs = (List<OrderPO>) is.readObject();
            is.close();
            return orderPOs;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

}
