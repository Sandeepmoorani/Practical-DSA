import java.util.ArrayList;
import java.util.Scanner;

// Lab 01 Task-1 

// public class Lab1 {
//     public static void main(String[] args) {
//         int age = 29;
//         System.out.println(age);
//         boolean isManager = true;
//         System.out.println(isManager);
//         double yearOfService = 2.5;
//         System.out.println(yearOfService);
//         int baseSalary = 3000;
//         int overTime = 40;
//         int totalPayment = baseSalary + overTime;
//         System.out.println(totalPayment);
//         double firstBouns = 10.0, secontbonus = 22.0, thirdbonus = 35.0;
//         double sum = firstBouns + secontbonus + thirdbonus;
//         System.out.println(sum);

//     }
// }

// Lab 01 Task-2 

// public class Lab1 {
//     public static void main(String[] args) {

// String menuTitle="my Dream Menu";
// System.out.println(menuTitle);

// ArrayList<String>menu=new ArrayList<>();
// String starter="salad";
// menu.add(starter);
// String mainCourse="java course";
// menu.add(mainCourse);
// String dessert="sweet";
// menu.add(dessert);
// System.out.println(menu);
// }
// }

// Lab 01 Task-3 

// public class Lab1 {
//     public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);

// System.out.println("Enter your age ");
// int age=sc.nextInt();
// if(age<13){
//     System.out.println("ticket price is 5$ ");
// }
// else if(age>=13 && age<65){
//     System.out.println("ticket price is 10$ ");
// }
// else if(age>=65){
//     System.out.println("ticket price is 7$ ");
// }
//     }
// }

// Lab1-Task-4 

// public class Lab1 {
//     public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// String question="which one of the following computer language is plate-form independent ?";
// String choiceOne="C++";
// String choiceTwo="JAVA";
// String choiceThree="PHP";
// String choiceFour="Angular";
// System.out.println(question);
// System.out.println(choiceOne);
// System.out.println(choiceTwo);
// System.out.println(choiceThree);
// System.out.println(choiceFour);
// String correctAnswer=choiceTwo;
// System.out.println("Enter your answer here ");
// String userAnswer=sc.nextLine();
// userAnswer=userAnswer.toUpperCase();
// if(choiceTwo.equals(userAnswer)){
//     System.out.println("CONGRATS! its correct answer ");
// }
// else{
//     System.out.println("OPPS! your answer is wrong");
// }
// }
// }

// Lab1 task-5 

public class Lab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * An employee must work at least 8 hours per day
         * So the minimum hours he works per week will be 56
         */
        System.out.print("Enter no of hours you work per week (minimum 56): ");
        int workingHours = scan.nextInt();
        // The equivalent hours per day will be
        double workingHoursPerDay = workingHours / 7.0;
        System.out.print("Enter amount of money you make per hour: ");
        double amountPerHour = scan.nextDouble();
        /*
         * -> Gross yearly income can be calculated by multiplying
         * no of hours worked per year with amount of money
         * made per hour.
         * -> no of hours worked per year=no of hours worked per day
         * multiplied with 365 days
         */
        double grossYearlyIncome = workingHoursPerDay * 365.0 * amountPerHour;
        System.out.println("Gross income of the year is: " + grossYearlyIncome);
        System.out.println("\n\n\t\t**BONUS**");
        System.out.print("Enter your vacation days per month: ");
        int vacationDaysPerMonth = scan.nextInt();
        // Here we convert vacation days into vacation hours
        int vacationHoursPerMonth = vacationDaysPerMonth * 8;
        /*
         * -> Payment of vacation days per year can be calculated by
         * multiplying vacation days per year with amount of money
         * made per hour
         * -> vacation days per year = vacation days per month multiply with 12.0
         */
        double vacationSalaryPerYear = vacationHoursPerMonth * 12.0 * amountPerHour;
        /*
         * Actually employee is paid according to the hours he works per week
         * without excluding the payment of vacation days.
         */
        System.out.println("Amount of money you get on vacation days per year (Bonus): " + vacationSalaryPerYear);
        double netSalary = grossYearlyIncome - vacationSalaryPerYear;
        System.out.println("If employee is not paid for vacation days then his net income will be: " + netSalary);
    }
}
