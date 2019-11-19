package model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character {

    private ArrayList<Item> inventory;
    private Boolean flatFooted;

    public int rollAnAction() {
        Random random = new Random();
        return (random.nextInt(100));
    }

}