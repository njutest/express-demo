package edu.nju.express.dataservice.factory;

import edu.nju.express.dataservice.CommodityDataService;
import edu.nju.express.dataservice.CustomerDataService;
import edu.nju.express.dataservice.OrderDataService;

public abstract class DataServiceFactory {

    public abstract CommodityDataService getCommodityDataService();

    public abstract CustomerDataService getCustomerDataService();

    public abstract OrderDataService getOrderDataService();
    
}
