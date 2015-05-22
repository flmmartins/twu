import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Printer {

    private OutputStream outputStream;

    public Printer(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void print(String input)  {

        try {
            outputStream.write(input.getBytes());
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }

    }
}
