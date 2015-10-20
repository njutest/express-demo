package edu.nju.express.dataservice.impl.memory;

import edu.nju.express.dataservice.CommodityDataService;
import edu.nju.express.po.CommodityPO;

import java.util.HashMap;
import java.util.Map;

public class CommodityDSMemoryImpl implements CommodityDataService{
    private Map<Integer, CommodityPO> commodityPOs;

    public CommodityDSMemoryImpl() {
        commodityPOs = new HashMap<>();
    }

    @Override
    public int addCommodity(CommodityPO commodityPO) {
        int newId = commodityPOs.size();
        commodityPO.setId(newId);
        commodityPOs.put(newId, commodityPO);
        return newId;
    }

    @Override
    public CommodityPO getCommodity(int id) {
        return commodityPOs.get(id);
    }

}
