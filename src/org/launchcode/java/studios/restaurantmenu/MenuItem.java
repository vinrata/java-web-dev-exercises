package org.launchcode.java.studios.restaurantmenu;
import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.Date;

public class MenuItem {
    private String description;
    private String category;
    private double price = 0.0;
    private Date date = new Date();
    private Date dateAdded = date;
    private boolean isNew = true;



    public MenuItem(String d, String c, double p,boolean i){
            this.description = d;
            this.category = c;
            this.price = p;
            this.isNew = i;

    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

}


