class TicketBooking {
    private int availableSeats = 5;

    public synchronized void bookTicket(String name, int seatsRequested) {
        System.out.println(name + " trying to book " + seatsRequested + " seat(s)...");

        if (seatsRequested <= availableSeats) {
            System.out.println("Booking successful for " + name);
            availableSeats -= seatsRequested;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Sorry, not enough seats for " + name);
        }
    }
}

class BookingThread extends Thread {
    private TicketBooking ticketBooking;
    private int seats;
    private String userName;

    public BookingThread(TicketBooking ticketBooking, String userName, int seats) {
        this.ticketBooking = ticketBooking;
        this.userName = userName;
        this.seats = seats;
    }

    public void run() {
        ticketBooking.bookTicket(userName, seats);
    }
}

public class Q23 {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        BookingThread t1 = new BookingThread(bookingSystem, "Anurag", 2);
        BookingThread t2 = new BookingThread(bookingSystem, "Basanti", 3);
        BookingThread t3 = new BookingThread(bookingSystem, "Chandu", 2);

        t1.start();
        t2.start();
        t3.start();
    }
}
