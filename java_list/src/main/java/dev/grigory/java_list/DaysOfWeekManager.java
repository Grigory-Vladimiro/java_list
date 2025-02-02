package dev.grigory.java_list;

import java.util.List;

public class DaysOfWeekManager {
    private List<String> days;
    public void createDaysList() {
        days = List.of ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    }
    public List<String> getDays() {
        return days;
    }
    public static void main(String[] args) {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        System.out.println(manager.getDays());
    }
    public int getListSize() {
        return days.size();
    }
}
