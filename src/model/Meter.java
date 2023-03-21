package model;

public class Meter {

    private String id;
    private Double currentMonth;
    private Double lastMonth;

    public Meter(String id, Double currentMonth, Double lastMonth) {
        this.id = id;
        this.currentMonth = currentMonth;
        this.lastMonth = lastMonth;
    }
}
