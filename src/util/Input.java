package util;

public class Input {

    private String scanner;

    public String getString() {
        return scanner;
    }


    public Input (String scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Input scanner = new Input("Test");
        System.out.printf(scanner.getString());
    }

}



