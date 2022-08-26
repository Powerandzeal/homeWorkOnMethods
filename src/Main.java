public class Main {
    public static void main(String[] args) {
        getYear(2024);

    }

    public static void getYear(int year) {


        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является высокосным годом");

        } else {
            System.out.println(year + " не является высокосным годом");
        }
        //return year;


    }



    //public static void checkyear(int year) {}



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
