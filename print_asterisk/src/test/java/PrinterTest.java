import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class PrinterTest {

    @Test
    public void printSomething() throws Exception {
        OutputStream mockedOutput = mock(ByteArrayOutputStream.class);
        Printer printer = new Printer(mockedOutput);
        printer.print("test");
        verify(mockedOutput).write(anyString().getBytes());
    }
}