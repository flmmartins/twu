import java.io.IOException;

public class Viewer {
    public static void main(String[] args) {
        Printer printer = new Printer(System.out);
        Asterisk asterisk = new Asterisk();
        printer.print(asterisk.showOneTime());
    }
}

