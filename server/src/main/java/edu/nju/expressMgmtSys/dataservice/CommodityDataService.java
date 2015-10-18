package edu.nju.expressMgmtSys.dataservice;

import edu.nju.expressMgmtSys.model.po.CommodityPO;
import edu.nju.expressMgmtSys.model.po.CustomerPO;

public interface CommodityDataService {

    /**
     * @param commodityPO
     * @return commodity id;
     */
    int addCommodity(CommodityPO commodityPO);

    CommodityPO getCommodity(int id);

}
