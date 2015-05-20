import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AsteriskTest {

    @Test
    public void printAsterisk() {
        Asterisk asterisk = new Asterisk();
        String asterisc = asterisk.show();
        assertThat(asterisc, is("*"));
    }

}