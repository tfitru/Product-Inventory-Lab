package models;

public class DVDs {
    private int id;
    private String name;
    private int qty;
    private float price;

    public DVDs(Integer id, String name, Integer qty, Float price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public DVDs() {

    }

    public Integer getId() {
        return this.id;
    }


    public void setName(String name){
        this.name=name;
    }


    public String getName() {
        return this.name;
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
