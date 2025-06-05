import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    private static final DateTimeFormatter SCH_FORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESC_FORMATTER = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.").withLocale(Locale.US);
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        // "7/25/2019 13:45:00"
        return LocalDateTime.parse(appointmentDateDescription, SCH_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();

        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18) ? true : false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
        // E -> day-of-week
        // M -> month-of-year
        // a -> am-pm-of-day
        return "You have an appointment on " + DESC_FORMATTER.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
        System.out.println(scheduler.getAnniversaryDate());
    }
}
