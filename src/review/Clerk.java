package review;

import java.util.ArrayList;

public class Clerk extends Human {

    public Clerk(String name) {
        super(name);
    }


    public void receiveComputer(Computer incomingBrokenComputer, ArrayList<Computer> thisStoresBrokenPile) {
        thisStoresBrokenPile.add(incomingBrokenComputer);
    }
}
