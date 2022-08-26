import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printYear(2024);
        int currentYear = LocalDate.now().getYear();
        checkOSAndCheckYearMade(currentYear, 0);
        int DistancebeforeUser =calculationDays(76);
        System.out.println("Время доставки "+DistancebeforeUser+" дня");

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
    private static void checkOSAndCheckYearMade(int YearOfMade, int oSVersion) {


        if (YearOfMade < 2015 && oSVersion == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (YearOfMade > 2015 && oSVersion == 0) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        }
        if (YearOfMade < 2015 && oSVersion == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (YearOfMade > 2015 && oSVersion == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }

    // Exercise 3
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
