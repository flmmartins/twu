import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyString;

public class AsteriskTest {
    Asterisk asterisk;

    @Before
    public void setUp() {
        asterisk = new Asterisk();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void printOneAsterisk() {
        assertThat(asterisk.showOneTime(), is("*"));
    }

    @Test
    public void printAsteriskGivenNumber() {
        assertThat(asterisk.showNTimesGivenNumber(2), is("**"));
    }

    @Test
    public void printAsteriskGivenNumberZero() {
        assertThat(asterisk.showNTimesGivenNumber(0), is(isEmptyString()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionGivenNegativeNumber() {
        asterisk.showNTimesGivenNumber(-1);
    }

}