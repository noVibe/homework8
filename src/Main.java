public class Main {
    public static void main(String[] args) {
//      =====Task 1=====
        System.out.println("=====Task 1=====");
        int moneyPepMonth = 15000;
        double total = 0;
        int month = 0;
        while (total <= 2459000) {
               total += moneyPepMonth * 1.01;
               month++;
            System.out.println("Month " + month + ", amount of savings is " + total);
        }
        //=====Task 2=====
        System.out.println("=====Task 2=====");
        int number = 1;
        while (number <=10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //=====Task 3=====
        System.out.println("\n=====Task 3=====");
        int population = 12000000;
        int deaths;
        int births;
        for (int year = 1; year <= 10; year++) {
            deaths = population / 1000 * 8;
            births = population / 1000 * 17;
            population = population - deaths + births;
            System.out.println("Year " + year + " population: " + population);
        }
        //=====Task 2-1, 2-2 and 2-3 combined=====
        System.out.println("=====Task 2-1, 2-2 and 2-3=====");
        int contribution = 15000;
        int savings = 0;
        for (int i = 1; ; i++) {
            savings += contribution * 1.07;
            if (i % 6 == 0 && i <= 9 * 12) {
                System.out.println("Month: " + i + ". Savings: " + savings);
            }
            if (savings >= 12000000) {
                System.out.println("---\nMonth: " + i + ". Savings: " + savings + ". 12 millions have been achieved!");
                break;
            }
        }
//        =====Task 2-4=====
        System.out.println("=====Task 2-4=====");
        int firstFridayDate = 2;
        for (int i = firstFridayDate; i <= 31; i +=7) {
            System.out.println("Today is friday. Day date: " + i + ". Prepare a report.");
        }
//        =====Task 3-1=====
        System.out.println("=====Task 3-1=====");
        int currentYear = 2022;
        for (int i = 0; i <= currentYear + 100 ; i += 79) {
            if (currentYear - i <= 200) {
                System.out.println(i);
            }
        }
//        =====Task 3-2=====
        System.out.println("=====Task 3-2=====");
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("2*" + i + "=" + i*2);
        }


    }
}