package ysai.bravo;

/**
 * Created by IE on 6/17/2016.
 */
public class ITEM {
    private int itemid;
    private String itemdescription;
    private String itemtype;
    private float price;
    private String UOM;

    public ITEM(int itemid, String itemdescription, float price, String itemtype, String UOM) {
        this.itemid = itemid;
        this.itemdescription = itemdescription;
        this.price = price;
        this.itemtype = itemtype;
        this.UOM = UOM;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}