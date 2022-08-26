import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printYear(2024);
        int currentYear = LocalDate.now().getYear();
        checkOSAndCheckYearMade(currentYear, 0);
        calculationDays(76);

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


    private static int calculationDays(int deliveryDistant) {

        int deliveryDays = 1;


        if (deliveryDistant > 20) {
            deliveryDays++;
        }
        if (deliveryDistant > 60) {
            deliveryDays++;
        }
        //System.out.println("Days before to delivery+"deliveryDays);
        return deliveryDays;



    }

}
