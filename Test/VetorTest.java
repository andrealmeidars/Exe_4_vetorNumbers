import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VetorTest {

    Vetor vetor;

    @Before
    public void setUp() throws Exception {
        this.vetor = new Vetor();

    }

    @Test
    public void showIfNumberisEven(){
        assertThat(vetor.numberOrganizer(2), is("even"));
    }

    @Test
    public void showIfNumberisOdd(){
        assertThat(vetor.numberOrganizer(3), is("odd"));
    }
}
