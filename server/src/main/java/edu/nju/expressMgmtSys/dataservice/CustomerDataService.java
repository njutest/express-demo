package edu.nju.expressMgmtSys.dataservice;

import edu.nju.expressMgmtSys.model.po.CustomerPO;

public interface CustomerDataService {

    /**
     * @param customerPO
     * @return id
     */
    int addCustomer(CustomerPO customerPO);

    CustomerPO getCustomer(int id);

}
