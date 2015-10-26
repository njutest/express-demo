package edu.nju.express.dataservice.factory;

import edu.nju.express.dataservice.CommodityDataService;
import edu.nju.express.dataservice.CustomerDataService;
import edu.nju.express.dataservice.OrderDataService;

public interface DataServiceFactory {

    CommodityDataService getCommodityDataService();

    CustomerDataService getCustomerDataService();

    OrderDataService getOrderDataService();
}
