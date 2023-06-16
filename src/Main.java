import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int tempAge;
        String tempMaritalStatus;
        int tempChildrenNo;
        String tempCarOwnershipStatus;
        int tempMonthlyIncome;
        try {
            //prompt the user of their age, marital status, car ownership status, and number of children
            System.out.print("Please enter your marital status (single or married): ");
            tempMaritalStatus = keyboard.nextLine();

            System.out.print("Please enter your car ownership status (car owner or public transport user): ");
            tempCarOwnershipStatus = keyboard.nextLine();

            System.out.print("Please enter your age: ");
            tempAge = keyboard.nextInt();

            System.out.print("Please enter the number of children you have: ");
            tempChildrenNo = keyboard.nextInt();

            budgetCalculator bc = new budgetCalculator();

            //setter
            bc.setAge(tempAge);
            bc.setMaritalStatus(tempMaritalStatus);
            bc.setChildrenNo(tempChildrenNo);
            bc.setCarOwnershipStatus(tempCarOwnershipStatus);

            //call calculate budget for expenses method
            bc.calculateBudget();

            //prompt the user of their monthly income
            System.out.print("Please enter your monthly income: ");
            tempMonthlyIncome = keyboard.nextInt();

            //call calculate saving budget method
            bc.calculateSavingBudget(tempMonthlyIncome);

            //compares the method of comparison between total wants and needs with the suggested expenses
            bc.comparison();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}