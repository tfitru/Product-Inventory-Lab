package models;

public class RunningShoes {
    private int id;
    private String name;
    private String brand;
    private int size;
    private int qty;
    private float price;



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

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
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


}


