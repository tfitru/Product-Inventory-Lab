package services;

import java.util.ArrayList;
import java.util.List;

public class RunningShoes {
    private static int nextId = 1; // (1)

    models.RunningShoes run = new models.RunningShoes();

    private List<models.RunningShoes> inventory = new ArrayList<>();

    public models.RunningShoes create( String name, String brand, Double size, Integer qty, Float price) {
        models.RunningShoes createdRunningShoes = new models.RunningShoes(nextId++, name, brand, size, qty, price);
        inventory.add(createdRunningShoes);

        return createdRunningShoes;
    }

    // read

    public models.RunningShoes findRunningShoes(int id){
        return inventory.get(id);
    }

    public models.RunningShoes[] findAll() {
        models.RunningShoes[] x = new models.RunningShoes[inventory.size()];
        x = inventory.toArray(x);
        return x;
    }


    public boolean delete(int id) {
        if(inventory.contains(inventory.get(id))){
            return true;
        } else
            return false;
    }




}
