package models;

public class RunningShoes {
    private int id;
    private String name;
    private String brand;
    private double size;
    private int qty;
    private float price;




    public RunningShoes(Integer id, String name, String brand, Double size, Integer qty, Float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public RunningShoes() {

    }

    public void setName(String name){
        this.name=name;
    }


    public String getName() {
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSize() {
        return this.size;
    }

    public void setQty(Integer qty){
        this.qty = qty;
    }

    public Integer getQty(){
        return this.qty;
    }


    public void setPrice(Float price){
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public Integer getId() {
        return this.id;
    }




}


