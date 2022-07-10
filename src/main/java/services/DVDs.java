package services;

import models.RunningShoes;

import java.util.ArrayList;
import java.util.List;

public class DVDs {
    private static int nextId = 1; // (1)

    models.DVDs run = new models.DVDs();

    private List<models.DVDs> inventory = new ArrayList<>();

    public models.DVDs create( String name, Integer qty, Float price) {
        models.DVDs createdDVDs = new models.DVDs(nextId++, name, qty, price);
        inventory.add(createdDVDs);

        return createdDVDs;
    }

    // read

    public models.DVDs findRunningShoes(int id){
        return inventory.get(id);
    }

    public models.DVDs[] findAll() {
        models.DVDs[] x = new models.DVDs[inventory.size()];
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
