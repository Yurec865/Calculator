package com.company;

public class OperationHistory {
    private String description;
    private int date;
    private Double[] doubles = new Double[100];

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Double[] getDoubles() {
        return doubles;
    }

    public void setDoubles(Double[] doubles) {
        this.doubles = doubles;
    }

    public String toString(){
        return getDescription()+" "+getDate();
    }
}
