package edu.nju.expressMgmtSys.dataservice;

import edu.nju.expressMgmtSys.po.CustomerPO;

public interface CustomerDataService {

    /**
     * @return id
     */
    int addCustomer(CustomerPO customerPO);

    CustomerPO getCustomer(int id);

}
