package edu.nju.express.dataservice.impl.serializable;

import edu.nju.express.dataservice.OrderDataService;
import edu.nju.express.po.OrderPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDSSerializableImpl implements OrderDataService{
    public static final String ORDER_FILE_PATH = "serializable-data/orders";

    @Override
    public void addOrder(OrderPO orderPO) {
        try {
            List<OrderPO> orderPOs = getOrders();
            orderPOs.add(orderPO);

            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(ORDER_FILE_PATH));
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
            File file = new File(ORDER_FILE_PATH);
            if (!file.exists()) {
                return new ArrayList<>();
            }

            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream(ORDER_FILE_PATH));
            List<OrderPO> orderPOs = (List<OrderPO>) is.readObject();
            is.close();
            return orderPOs;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

}
