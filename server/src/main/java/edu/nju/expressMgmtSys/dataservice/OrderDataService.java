package edu.nju.expressMgmtSys.dataservice;

import java.util.List;

import edu.nju.expressMgmtSys.model.ExpressOrder;
import edu.nju.expressMgmtSys.model.po.OrderPO;

public interface OrderDataService {

    void addOrder(OrderPO orderPO);

    List<OrderPO> getOrders();
}
