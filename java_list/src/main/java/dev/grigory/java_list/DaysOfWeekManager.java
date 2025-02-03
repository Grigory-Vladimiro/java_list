package dev.grigory.java_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeekManager {
    private List<String> days;
    public void createDaysList() {
        days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }
    public List<String> getDays() {
        return days;
    }
    public static void main(String[] args) {
        DaysOfWeekManager manager = new DaysOfWeekManager();
        manager.createDaysList();
        System.out.println(manager.getDays());
        System.out.println("Size of the list: " + manager.getListSize());
        manager.removeDay("Monday");
        System.out.println("After removal: " + manager.getDays());
        System.out.println("Current list: " + manager.getDays()); 
        System.out.println("Day at index 0: " + manager.getDay(0)); 
        System.out.println("Day at index 3: " + manager.getDay(3)); 
        System.out.println("Day at index 10: " + manager.getDay(10));
        System.out.println("Does 'Friday' exist? " + manager.exists("Friday")); 
        System.out.println("Does 'Holiday' exist? " + manager.exists("Holiday"));
        System.out.println("Before sorting: " + manager.getDays());
        manager.sortDays();
        System.out.println("After sorting: " + manager.getDays());
    }
    public int getListSize() {
        return days.size();
    }
    public void removeDay(String day) {
        days.remove(day);
    }
    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        return null;
    }
    public boolean exists(String day) {
        return days.contains(day);
    }
    public void sortDays() {
    Collections.sort(days);
}
}
