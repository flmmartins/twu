import java.io.IOException;
import java.io.PrintStream;

public class Viewer {
    public static void main(String[] args) {
        Printer printer = new Printer(System.out);
        Asterisk asterisk = new Asterisk();
        try {
            printer.print(asterisk.show());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

