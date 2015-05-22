import java.io.IOException;

public class Viewer {
    public static void main(String[] args) {
        printOneAsterisk();


    }

    private static void printOneAsterisk() {
        Printer printer = new Printer(System.out);
        Asterisk asterisk = new Asterisk();
        try {
            printer.print(asterisk.showOneTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

