package student.hackthon.team15.entity;

import java.util.Date;

public class ExpensesEntity {
    private int id;
    private int categoryName;
    private double value;
    private String date;
    private Boolean isBill;
    private Boolean isPaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getBill() {
        return isBill;
    }

    public void setBill(Boolean bill) {
        isBill = bill;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
