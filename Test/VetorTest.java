import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VetorTest {

    Vetor vetor;

    @Before
    public void setUp() throws Exception {
        this.vetor = new Vetor();

    }


    @Test
    public void organizerNumbers(){
        vetor.numberOrganizer();
        vetor.print();
    }


}
