package edu.nju.expressMgmtSys.dataservice.factory;

import edu.nju.expressMgmtSys.dataservice.CommodityDataService;
import edu.nju.expressMgmtSys.dataservice.CustomerDataService;
import edu.nju.expressMgmtSys.dataservice.OrderDataService;

public interface DataServiceFactory {

    CommodityDataService getCommodityDataService();

    CustomerDataService getCustomerDataService();

    OrderDataService getOrderDataService();
}
