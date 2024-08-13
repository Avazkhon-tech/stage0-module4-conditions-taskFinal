package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
         boolean isLeap = isLeapYear(year);
         int february = isLeap? 29: 28;

         switch (month) {
             case 2:
                 System.out.println(february);
                 break;
             case 1, 3, 5, 7, 8, 10, 12:
                 System.out.println(31);
                 break;
             case 4, 6, 9, 11:
                 System.out.println(30);
                 break;
             default:
                 System.out.println("invalid date");
         }


    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
