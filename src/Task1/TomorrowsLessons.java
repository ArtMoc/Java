package Task1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TomorrowsLessons {
    private String show_Timetable() {
        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();
        return switch (day) {
            case MONDAY -> {
                yield "Monday Lessons";
            }
            case TUESDAY -> {
                yield "Tuesday Lessons";
            }
            case WEDNESDAY -> {
                yield "Wednesday Lesson";
            }
            case THURSDAY -> {
                yield "Thursday Lessons";
            }
            case FRIDAY -> {
                yield "Friday Lessons";
            }
            case SATURDAY, SUNDAY -> {
                yield "No Lessons";
            }
        };
    }

    public String Show_Timetable() {
        return this.show_Timetable();
    }
}