package dev.pablogj0397.nissan.vehicle.domain;

public class Vehicle {
    private String id;
    private String model;
    private String colour;
    private String year;
    private String basePrice;


    public Vehicle(String id, String model, String colour, String year, String basePrice) {
        this.id = id;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }
    @Override
    public String toString(){
        return String.format("Vehicle {ID:%s, Model: %s, Colour: %s, Year: %s, Base Price: %s", id,model,colour,year,basePrice);
    }
}
