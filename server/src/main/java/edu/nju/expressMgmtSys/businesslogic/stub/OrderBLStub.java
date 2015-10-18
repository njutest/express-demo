package edu.nju.expressMgmtSys.businesslogic.stub;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import edu.nju.expressMgmtSys.model.Commodity;
import edu.nju.expressMgmtSys.model.Customer;
import edu.nju.expressMgmtSys.model.ExpressOrder;
import edu.nju.expressMgmtSys.model.ExpressType;
import edu.nju.expressMgmtSys.businesslogic.OrderBL;
import edu.nju.expressMgmtSys.vo.OrderReadVO;
import edu.nju.expressMgmtSys.vo.OrderWriteVO;

public class OrderBLStub extends UnicastRemoteObject implements OrderBL {


    public OrderBLStub() throws RemoteException {
        super();
    }

    @Override
    public void addExpressOrder(OrderWriteVO orderVO) throws RemoteException {
        System.out.println("An Order has been added.");
    }

    @Override
    public List<OrderReadVO> getExpressOrders() {
        OrderReadVO orderReadVO = new OrderReadVO("0000000000", "Jay", "Zhou", "TNT",
                ExpressType.STANDARD,
                5, 10);

        List<OrderReadVO> expressOrders = new ArrayList<>();
        expressOrders.add(orderReadVO);
        return expressOrders;
    }
}
