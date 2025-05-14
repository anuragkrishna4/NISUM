import java.util.*;

public class EventCalendar {
    static TreeMap<String, ArrayList<String>> calendar = new TreeMap<>();

    public static void addEvent(String date, String eventDetails) {
        calendar.putIfAbsent(date, new ArrayList<>());
        calendar.get(date).add(eventDetails);
        System.out.println("Event added on " + date);
    }

    public static void removeEvent(String date, String eventDetails) {
        if (calendar.containsKey(date)) {
            ArrayList<String> events = calendar.get(date);
            if (events.remove(eventDetails)) {
                System.out.println("Event removed.");
                if (events.isEmpty()) {
                    calendar.remove(date);
                }
            } else {
                System.out.println("Event not found.");
            }
        } else {
            System.out.println("Date not found.");
        }
    }

    public static void displayEventsByDate(String date) {
        if (calendar.containsKey(date)) {
            System.out.println("Events on " + date + ":");
            for (String event : calendar.get(date)) {
                System.out.println("- " + event);
            }
        } else {
            System.out.println("No events on this date.");
        }
    }

    public static void displayAllEvents() {
        if (calendar.isEmpty()) {
            System.out.println("No upcoming events.");
        } else {
            System.out.println("All Upcoming Events:");
            for (Map.Entry<String, ArrayList<String>> entry : calendar.entrySet()) {
                System.out.println("Date: " + entry.getKey());
                for (String event : entry.getValue()) {
                    System.out.println("- " + event);
                }
            }
        }
    }

    public static void main(String[] args) {
        addEvent("2025-05-20", "Meeting at 10 AM");
        addEvent("2025-05-20", "Lunch with team");
        addEvent("2025-05-21", "Project deadline");

        displayEventsByDate("2025-05-20");
        removeEvent("2025-05-20", "Lunch with team");
        displayAllEvents();
    }
}
