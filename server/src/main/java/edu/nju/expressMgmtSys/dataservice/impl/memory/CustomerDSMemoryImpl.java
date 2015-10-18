package edu.nju.expressMgmtSys.dataservice.impl.memory;

import edu.nju.expressMgmtSys.dataservice.CustomerDataService;
import edu.nju.expressMgmtSys.model.po.CommodityPO;
import edu.nju.expressMgmtSys.model.po.CustomerPO;

import java.util.HashMap;
import java.util.Map;

public class CustomerDSMemoryImpl implements CustomerDataService{
    private Map<Integer, CustomerPO> customerPOs;

    public CustomerDSMemoryImpl() {
        customerPOs = new HashMap<>();
    }

    @Override
    public int addCustomer(CustomerPO customerPO) {
        int newId = customerPOs.size();
        customerPO.setId(newId);
        customerPOs.put(newId, customerPO);
        return newId;
    }

    @Override
    public CustomerPO getCustomer(int id) {
        return customerPOs.get(id);
    }
}
