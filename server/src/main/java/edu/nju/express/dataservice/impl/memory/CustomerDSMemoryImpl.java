package edu.nju.express.dataservice.impl.memory;

import edu.nju.express.dataservice.CustomerDataService;
import edu.nju.express.po.CustomerPO;

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
