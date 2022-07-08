package services;

import java.util.ArrayList;
import java.util.List;

public class RunningShoes {
    private static int nextId = 1; // (1)

    private List<models.RunningShoes> inventory = new ArrayList<>();

    public models.RunningShoes create(Integer id, String name, String brand, double size, Integer quantity, float price) {

        models.RunningShoes createdShoes = new models.RunningShoes(nextId++, name, brand, size, quantity, price);

        inventory.add(createdShoes);


        return createdShoes;
    }

    // read
    public RunningShoes findRunningShoes(int id) {
        for(int i = 0; i<inventory.size(); i++){
            if(inventory.get(i).equals(id)){
                return inventory.get(i).getId();
            }
        }

        return null;
    }




}
