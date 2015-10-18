package edu.nju.expressMgmtSys.model.po;

import edu.nju.expressMgmtSys.model.ExpressType;

public class OrderPO {

    private String barcode;

    private int senderId;
    private int receiverId;
    private int commodityId;

    private ExpressType type;

    private double packagingFee;
    private double totalPrice;

    public OrderPO(String barcode,
                   int senderId, int receiverId, int commodityId,
                   ExpressType type, double packagingFee, double totalPrice) {
        this.barcode = barcode;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.commodityId = commodityId;
        this.type = type;
        this.packagingFee = packagingFee;
        this.totalPrice = totalPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public ExpressType getType() {
        return type;
    }

    public double getPackagingFee() {
        return packagingFee;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
