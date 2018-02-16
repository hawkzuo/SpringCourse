package edu.tamu.amos.spring.springbootproject.launch;

/**
 * Created by Amos on 2018/2/8.
 */
public class LineItem {
    private long ID;
    private double unitPrice;
    private String description;
    private double count;

    public LineItem (long id, double unitPrice, String description, double count) {
        this.ID = id;
        this.unitPrice = unitPrice;
        this.description = description;
        this.count = count;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getCount() {
        return count;
    }
}
