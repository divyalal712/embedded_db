package no.embeddeddb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddToCart {
    @Id
    private long id;
    private String productName;
    private int price;
    private String colour;
    private String soldBy;
    private boolean returnable;
    private String count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = colour;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public boolean isReturnable() {
        return returnable;
    }

    public void setReturnable(boolean returnable) {
        this.returnable = returnable;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
