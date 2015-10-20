package edu.nju.expressMgmtSys.businesslogic.stub;

import edu.nju.expressMgmtSys.businesslogic.OrderBL;
import edu.nju.expressMgmtSys.common.ExpressType;
import edu.nju.expressMgmtSys.vo.OrderReadVO;
import edu.nju.expressMgmtSys.vo.OrderWriteVO;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceStub implements OrderBL {

    @Override
    public void addExpressOrder(OrderWriteVO order) {
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
