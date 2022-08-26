import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printYear(2024);
        int currentYear = LocalDate.now().getYear();
        checkOSAndCheckYearMade(currentYear, 0);

    }
// Exercise 1
    private static void printYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является высокосным годом");

        } else {
            System.out.println(year + " не является высокосным годом");
        }
        //return year;
    }
    // Exercise 2
    private static void checkOSAndCheckYearMade(int YearOfMade, int OSVersion) {


        if (YearOfMade < 2015 && OSVersion == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (YearOfMade > 2015 && OSVersion == 0) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        }
        if (YearOfMade < 2015 && OSVersion == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (YearOfMade > 2015 && OSVersion == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }

   /* public static void osAndYear(int typeOsVerison, int yearOfMade) {

    }

    public static int calculationDays(int deliveryDistant) {

        int deliviryDays = 1;


        if (deliveryDistant > 20) {
            deliviryDays++;
        }
        if (deliveryDistant > 60) {
            deliviryDays++;
        }
        return deliviryDays;
        //System.out.println("Потребуется " +deliviryDays+   " дня");

        //System.out.println("Потребуется дней ");
    }*/


    /***
     * public static void printIsEvenNumber(int number) {
     *         boolean evenNumber = isEvenNumber(number);
     *         printIsEvenNumberResult(number, evenNumber);
     *     }
     *
     *     private static boolean isEvenNumber(int number) {
     *         return number % 2 == 0;
     *     }
     *
     *     private static void printIsEvenNumberResult(int number, boolean evenNumber) {
     *         if (evenNumber) {
     *             System.out.println("Число " + number + " четное");
     *         } else {
     *             System.out.println("Число " + number + " нечетное");
     *         }
     *     }
     */
}
