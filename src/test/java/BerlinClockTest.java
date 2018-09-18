import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BerlinClockTest {

    BerlinClock berlinClock = new BerlinClock();

    @Test
    public void TestSingleMinutesRow() {

        assertThat(berlinClock.getSingleMinutesRow("23:59:59"), equalTo("YYYY"));
    }

    @Test
    public void testSingleHoursRow() {

        assertThat(berlinClock.getSingleHoursRow("23:59:59"), equalTo("RRRO"));
    }

    @Test
    public void testEveryTwoSeconds() {

        assertThat(berlinClock.getEveryTwoSeconds("23:59:59"), equalTo("O"));
    }

    @Test
    public void testFiveMinutesRow() {

        assertThat(berlinClock.getFiveMinutesRow("12:35:00"), equalTo("YYRYYRYOOOO"));
    }

    @Test
    public void testFiveHoursRow(){

        assertThat(berlinClock.getFiveHoursRow("16:35:00"), equalTo("RRRO"));
    }

    @Test
    public void testBerlinClock(){

        assertThat(berlinClock.EntireBerlinClock("23:59:59"), equalTo("ORRRRRRROYYRYYRYYRYYYYYY"));
    }
}
