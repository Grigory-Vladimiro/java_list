package dev.grigory.java_list;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    @Test
    void testMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        DaysOfWeekManager.main(new String[]{});
        System.setOut(originalOut);
        Assertions.assertFalse(outputStream.toString().trim().isEmpty());
    }
    @Test
    void testGetListSize() {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        Assertions.assertEquals(7, manager.getListSize());
}
    @Test
    void testRemoveDay() {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        manager.removeDay("Monday");
        Assertions.assertEquals(6, manager.getListSize()); 
        Assertions.assertFalse(manager.getDays().contains("Monday"));
}
    @Test
    void testGetDay() {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        Assertions.assertEquals("Monday", manager.getDay(0)); 
        Assertions.assertEquals("Wednesday", manager.getDay(2)); 
        Assertions.assertNull(manager.getDay(10)); 
}
    @Test
    void testExists() {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        Assertions.assertTrue(manager.exists("Friday"));
        Assertions.assertFalse(manager.exists("Holiday")); 
}
}