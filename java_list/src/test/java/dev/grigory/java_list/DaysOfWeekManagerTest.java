package dev.grigory.java_list;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DaysOfWeekManagerTest {
    @Test
    void testGetDays() {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        Assertions.assertEquals(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"), manager.getDays());
    }
}
