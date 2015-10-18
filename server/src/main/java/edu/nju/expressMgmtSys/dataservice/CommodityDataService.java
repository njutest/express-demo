package edu.nju.expressMgmtSys.dataservice;

import edu.nju.expressMgmtSys.po.CommodityPO;

public interface CommodityDataService {

    /**
     * @return commodity id;
     */
    int addCommodity(CommodityPO commodityPO);

    CommodityPO getCommodity(int id);

}
