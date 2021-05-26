import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void function() {
    }

    private List<Time> createList(Time elements) {
        return new ArrayList<Time>(Arrays.asList(elements));
    }

    private List<Integer> returnList(Integer elements) {
        return new ArrayList<Integer>(Arrays.asList(elements));
    }

    @Test
    void multipleCondition() {
        RuntimeException excpt;

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-19, 5, 36))));
        assertTrue(excpt.getMessage().contains("The hours are smaller than the minimum"));

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(34, 29, 28))));
        assertTrue(excpt.getMessage().contains("The hours are grater than the maximum"));

        assertEquals(returnList(40271), SILab2.function(createList(new Time(11, 11, 11))));

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(14, -10, 13))));
        assertTrue(excpt.getMessage().contains("The minutes are not valid"));

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(15, 61, 55))));
        assertTrue(excpt.getMessage().contains("The minutes are not valid"));

        assertEquals(returnList(40271), SILab2.function(createList(new Time(11, 11, 11))));


        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(22, 42, 69))));
        assertTrue(excpt.getMessage().contains("The seconds are not valid"));

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(23, 51, -54))));
        assertTrue(excpt.getMessage().contains("The seconds are not valid"));


        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 0, 1))));
        assertTrue(excpt.getMessage().contains("The time is greater than the maximum"));

        excpt = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 32, 12))));
        assertTrue(excpt.getMessage().contains("The time is greater than the maximum"));

        assertEquals(returnList(40271), SILab2.function(createList(new Time(11, 11, 11))));
    }
}