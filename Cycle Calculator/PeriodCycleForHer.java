import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeriodCycleForHer {

    private LocalDate nextCycle;
    public String knowYourMenstruationCycle(LocalDate startDate, LocalDate endDate, int cycleLength){
      int numberOfDaysOfCurrentPeriod = startDate.until(endDate).getDays();
      int daysUntilNextPeriod = cycleLength - numberOfDaysOfCurrentPeriod;

      nextCycle = endDate.plusDays(daysUntilNextPeriod);

        String cycleLastDate = String.valueOf(endDate.plusDays(daysUntilNextPeriod));
            return cycleLastDate;
    }

public String  knowYourOvulationDay(LocalDate endDate){
               String dayOfOvulation = String.valueOf(endDate.plusDays(14));

        return dayOfOvulation;
    }
public List<LocalDate> knowYourFreeTime(LocalDate endDate, LocalDate dayOfOvulation){
        LocalDate startOfFreeDay = endDate.plusDays(1);
        LocalDate endOfFreeDay = dayOfOvulation.minusDays(1);

        List<LocalDate> freeDays = new ArrayList<>();
        freeDays.add(startOfFreeDay);
        freeDays.add(endOfFreeDay);

        return freeDays;
}
    public LocalDate getNextCycle() {
        return nextCycle;
    }



    }




