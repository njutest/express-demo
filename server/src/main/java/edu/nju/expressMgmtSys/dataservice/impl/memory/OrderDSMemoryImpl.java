package edu.nju.expressMgmtSys.dataservice.impl.memory;

import java.util.ArrayList;
import java.util.List;

import edu.nju.expressMgmtSys.dataservice.OrderDataService;
import edu.nju.expressMgmtSys.model.ExpressOrder;
import edu.nju.expressMgmtSys.model.po.OrderPO;

public class OrderDSMemoryImpl implements OrderDataService {
    private List<OrderPO> orders;

    public OrderDSMemoryImpl() {
        orders = new ArrayList<>();
    }

    @Override
    public void addOrder(OrderPO orderPO) {
        orders.add(orderPO);
    }

    @Override
    public List<OrderPO> getOrders() {
        return orders;
    }
}
