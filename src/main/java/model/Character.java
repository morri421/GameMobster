package model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character {

    public ArrayList<Item> inventory;
    public Boolean flatFootedStatus;

    public int rollAnAction() {
        Random random = new Random();
        return (random.nextInt(100));
    }

}