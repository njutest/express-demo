package edu.nju.express.dataservice.impl.serializable;

import edu.nju.express.dataservice.CommodityDataService;
import edu.nju.express.po.CommodityPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommodityDSSerializableImpl implements CommodityDataService{

    @Override
    public int addCommodity(CommodityPO commodityPO) {
        try {
            List<CommodityPO> commodityPOs = getCommodities();
            int id = commodityPOs.size();
            commodityPO.setId(id);
            commodityPOs.add(commodityPO);

            File file = SerializableFileHelper.getCommodityFile();
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(file));
            os.writeObject(commodityPOs);
            os.flush();
            os.close();
            return id;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public CommodityPO getCommodity(int id) {
        try {
            List<CommodityPO> commodityPOs = getCommodities();
            for (CommodityPO commodityPO : commodityPOs) {
                if (id == commodityPO.getId()) {
                    return commodityPO;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<CommodityPO> getCommodities() throws IOException, ClassNotFoundException {
        File file = new File(SerializableFileHelper.DIRECTORY_PATH,
                SerializableFileHelper.COMMODITY_FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream(file));
        List<CommodityPO> commodityPOs = (List<CommodityPO>) is.readObject();
        is.close();
        return commodityPOs;
    }
}
