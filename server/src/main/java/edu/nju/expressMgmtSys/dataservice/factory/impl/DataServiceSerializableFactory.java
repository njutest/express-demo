package edu.nju.expressMgmtSys.dataservice.factory.impl;

import edu.nju.expressMgmtSys.dataservice.CommodityDataService;
import edu.nju.expressMgmtSys.dataservice.CustomerDataService;
import edu.nju.expressMgmtSys.dataservice.OrderDataService;
import edu.nju.expressMgmtSys.dataservice.factory.DataServiceFactory;
import edu.nju.expressMgmtSys.dataservice.impl.serializable.CommodityDSSerializableImpl;
import edu.nju.expressMgmtSys.dataservice.impl.serializable.CustomerDSSerializableImpl;
import edu.nju.expressMgmtSys.dataservice.impl.serializable.OrderDSSerializableImpl;

public class DataServiceSerializableFactory implements DataServiceFactory{
    @Override
    public CommodityDataService getCommodityDataService() {
        return new CommodityDSSerializableImpl();
    }

    @Override
    public CustomerDataService getCustomerDataService() {
        return new CustomerDSSerializableImpl();
    }

    @Override
    public OrderDataService getOrderDataService() {
        return new OrderDSSerializableImpl();
    }
}
