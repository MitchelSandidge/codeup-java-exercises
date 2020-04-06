package review;

import java.util.ArrayList;

public class BranceTech {

    private static ArrayList<Computer> brokerComputers = new ArrayList<>();
    private static ArrayList<Computer> fixedComputers = new ArrayList<>();

    private static Clerk brance = new Clerk("Brance");
    private static Repairer johnny = new Repairer("Johnny");

    public static void main(String[] args) {

        Computer testComputerOne = new Computer("Dell", false, true);
        Computer testComputerTwo = new Computer("Ailenware", false, true);
        Computer testComputerThree = new Computer("Lapple", false, true);


        brance.receiveComputer(testComputerOne, brokerComputers);
        brance.receiveComputer(testComputerTwo, brokerComputers);
        brance.receiveComputer(testComputerThree, brokerComputers);

        for (Computer computer : brokerComputers) {
            System.out.println(computer.getName()+ " needs to be worked on");
        }

        johnny.repairComputer(brokerComputers, fixedComputers);
        johnny.repairComputer(brokerComputers, fixedComputers);


        System.out.println("------------");
        for (Computer computer : brokerComputers) {
            System.out.println("Broken computeres left: " + computer.getName());
        }


    }

}
