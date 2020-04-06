package review;

import java.util.ArrayList;

public class Repairer extends Human {


    public Repairer(String name) {
        super(name);
    }

    public void repairComputer(ArrayList<Computer> thisStoresBrokenPile, ArrayList<Computer> thisStoresFixedPile) {
        if(!thisStoresBrokenPile.isEmpty()) {
            Computer computerToBeFixed = thisStoresBrokenPile.get(0);
            while (computerToBeFixed.isBroken()) {
                computerToBeFixed.turnOff();
                computerToBeFixed.turnOn();
            }
            thisStoresBrokenPile.remove(0);
            thisStoresFixedPile.add(computerToBeFixed);
        } else {
            System.out.println("I guess I'll go home...");
        }
    }
}
