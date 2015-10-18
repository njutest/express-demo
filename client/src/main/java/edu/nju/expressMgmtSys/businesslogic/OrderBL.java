package edu.nju.expressMgmtSys.businesslogic;

import java.rmi.Remote;
import java.util.List;

import edu.nju.expressMgmtSys.vo.OrderReadVO;
import edu.nju.expressMgmtSys.vo.OrderWriteVO;

public interface OrderBL extends Remote{

    void addExpressOrder(OrderWriteVO orderVO);

    List<OrderReadVO> getExpressOrders();
}
