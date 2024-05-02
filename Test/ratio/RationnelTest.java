import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import ratio.Rationnel;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RationnelTest {
    private Rationnel r1;
    private Rationnel r2;
    private Rationnel resultAddition;
    private Rationnel resultSoustraction;

    public RationnelTest(Rationnel r1, Rationnel r2, Rationnel resultAddition, Rationnel resultSoustraction) {
        this.r1 = r1;
        this.r2 = r2;
        this.resultAddition = resultAddition;
        this.resultSoustraction = resultSoustraction;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Rationnel(1, 2), new Rationnel(1, 3), new Rationnel(5, 6), new Rationnel(1, 6) },
                // Ajoutez d'autres jeux de données ici
        });
    }

    @Test
    public void testAddition() {
        assertEquals(resultAddition, r1.addition(r2));
    }

    @Test
    public void testSoustraction() {
        assertEquals(resultSoustraction, r1.soustraction(r2));
    }
}
