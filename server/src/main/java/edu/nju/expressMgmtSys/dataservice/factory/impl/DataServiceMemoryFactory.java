package edu.nju.expressMgmtSys.dataservice.factory.impl;

import edu.nju.expressMgmtSys.dataservice.CommodityDataService;
import edu.nju.expressMgmtSys.dataservice.CustomerDataService;
import edu.nju.expressMgmtSys.dataservice.OrderDataService;
import edu.nju.expressMgmtSys.dataservice.factory.DataServiceFactory;
import edu.nju.expressMgmtSys.dataservice.impl.memory.CommodityDSMemoryImpl;
import edu.nju.expressMgmtSys.dataservice.impl.memory.CustomerDSMemoryImpl;
import edu.nju.expressMgmtSys.dataservice.impl.memory.OrderDSMemoryImpl;

public class DataServiceMemoryFactory implements DataServiceFactory{

    @Override
    public CommodityDataService getCommodityDataService() {
        return new CommodityDSMemoryImpl();
    }

    @Override
    public CustomerDataService getCustomerDataService() {
        return new CustomerDSMemoryImpl();
    }

    @Override
    public OrderDataService getOrderDataService() {
        return new OrderDSMemoryImpl();
    }
}
