package edu.nju.express.dataservice.impl.serializable;

import java.io.File;
import java.io.IOException;

public class SerializableFileHelper {
    public static final String DIRECTORY_PATH = "serializable-data";
    public static final String COMMODITY_FILE_NAME = "commodities";
    public static final String CUSTOMER_FILE_NAME = "customers";
    public static final String ORDER_FILE_NAME = "orders";

    public static File getCommodityFile() throws IOException{
        File file = new File(getDirectory(), COMMODITY_FILE_NAME);
        createFile(file);
        return file;
    }

    public static File getCustomerFile() throws IOException{
        File file = new File(getDirectory(), CUSTOMER_FILE_NAME);
        createFile(file);
        return file;
    }
    public static File getOrderFile() throws IOException{
        File file = new File(getDirectory(), ORDER_FILE_NAME);
        createFile(file);
        return file;
    }

    private static File getDirectory() {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            boolean isSuccess = directory.mkdir();
            if (!isSuccess) {
                throw new RuntimeException("Directory " +
                        DIRECTORY_PATH + "can not be created");
            }
        }
        return directory;
    }

    private static void createFile(File file) throws IOException{
        if (!file.exists()) {
            boolean isSuccess = file.createNewFile();
            if (!isSuccess) {
                throw new RuntimeException("File " +
                        file.getAbsolutePath() + "can not be created");
            }
        }
    }
}
