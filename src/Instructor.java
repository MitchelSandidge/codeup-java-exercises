

public class Instructor {

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("\t%s was just created\n", firstName);
        System.out.printf("\tInstructor count %d\n\n", numInstructors);
    }

    // First name getter and setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name getter and setter
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String last) {
        this.lastName = last;
    }

    // Brain wave getter and setter
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }
    public void setBrainWaveFrequency(int brainWaveFreq) {
        this.brainWaveFrequency = brainWaveFreq;
    }



    // Method to display instructor info
    public String displayStats() {
        return String.format("\t%s %s, Brainwave Frequency: %s ", firstName, lastName, brainWaveFrequency);
    }



}
