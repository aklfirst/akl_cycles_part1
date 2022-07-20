import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int n = 2070;
//        for (int i = 2020; i < n; i = i + 4) {
//            System.out.println("Leap YeAR " + i);
//        }
//
//        int salary = 65_535;
//        int total = 0;
//        int month = 1;
//        for (; total <= 1_000_000; month++) {
//            total = total + total / 100;
//            total = total + salary;
//            if (month % 5 == 0) {
//                System.out.println(month + " YTD Salary is " + total);
//            }
//        }
//        System.out.println("Total built savings at month " + total);

        //while (total <= 1_000_000) {
        //    total = total + total/100;
        //    total = total + salary;
        //    System.out.println(" YTD Salary is " + total);
        //}
        //System.out.println("Total built savings at month " + total);
//        int day_Number = 1;
//        for (; day_Number <= 31; day_Number++) {
//            if (day_Number % 5 == 0) {
//                System.out.println(day_Number + " This is public holiday my friend!");
//                continue;
//            }
//            //System.out.println(day_Number);
//        }
//
//        int currentYear = 2021;
//        for (int year = currentYear; year<=2070; year++) {
//            if (Year.isLeap(year)) {
//                System.out.println(year + " This is Leap year");
//                break;
//            }
//
//
//        }

// Задание 1

        int i = 1;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i <= 10) {
            i1 = i;
            i2 = i1+1;
            i3 = i2 +1;
            i4 = i3 + 1;
            i5 = i4 + 1;
            i6 = i5 + 1;
            i7 = i6 +1;
            i8 = i7 + 1;
            i9 = i8 + 1;
            i10 = i9 +1;
            System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7 + " " + i8 + " " + i9 + " " +i10);
        break;
        }

        int a = 10;
        int a10 = 0;
        int a9 = 0;
        int a8 = 0;
        int a7 = 0;
        int a6 = 0;
        int a5 = 0;
        int a4 = 0;
        int a3 = 0;
        int a2= 0;
        int a1 = 0;
        for (;a>0;a = a-1) {
            a10 = a;
            a9 = a10 - 1;
            a8 = a9 - 1;
            a7 = a8 - 1;
            a6 = a7 - 1;
            a5 = a6 - 1;
            a4 = a5 - 1;
            a3 = a4 - 1;
            a2 = a3 - 1;
            a1 = a2 - 1;
            System.out.println(a10 + " " + a9 + " " + a8 + " " + a7 + " " + a6 + " " + a5 + " " + a4 + " " + a3 + " " + a2 + " " +a1);
        break;
        }
// Задание 1 после просмотра домашки - с корректировкой
        int currentNum = 0;
        while (currentNum<10) {
            System.out.print(++currentNum+" ");}
        System.out.println();
        for(;currentNum>0;currentNum--){
            System.out.print(currentNum+" ");}
        System.out.println();

// Задание 2

        int firstFriday = 3;
        for (int day = 1; day <= 31; day++){

            if (day == firstFriday){
                System.out.println("This is Friday, date " + firstFriday + " - time to prepare the report");
                firstFriday = firstFriday + 7;
            }
            }

// Задание 2 с доработкой после просмотра ДЗ
        int beginFriday = 5;
        for(; beginFriday <=31; beginFriday = beginFriday +7) {
            System.out.println("This is Friday, date is " + beginFriday +" - time to prepare the report");}



// Задание 3

        int currentYear = 2021;
        int checkYearPast = currentYear - 200;
        int checkYearFuture = currentYear + 100;
        int cometFrequency = 79;


        for (int year = 0;year <= checkYearFuture;year = year + cometFrequency) {
            if (year >= checkYearPast && year <= checkYearFuture) {
                System.out.println(year);}
            }

// Задание 3 с учетом доработки после просмотра ДЗ
        int thisYear = LocalDate.now().getYear();
        int yearFuture = thisYear + 100;
        int yearPast = thisYear -200;
        for (int runYear = yearPast; runYear<= yearFuture; runYear++) {
            if (runYear % 79 == 0) {
                System.out.println(runYear);}
            }
        }

        }






















