import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        budgetCalculator bc = new budgetCalculator();


        while (true) {
            try {
                String  tempMaritalStatus;

                //prompt the user of their age, marital status, car ownership status, and number of children
                System.out.print("Please enter your marital status (single or married): ");
                  tempMaritalStatus = keyboard.nextLine();
                bc.setMaritalStatus(tempMaritalStatus);
break;
            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }

        }

        while (true) {
            try {
                String tempCarOwnershipStatus = null;
                System.out.print("Please enter your car ownership status (car owner or public transport user): ");
                tempCarOwnershipStatus = keyboard.nextLine();
                bc.setCarOwnershipStatus(tempCarOwnershipStatus);
                break;

            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }


        }

        while (true) {
            try {
                int tempAge;
                System.out.print("Please enter your age: ");
                tempAge = keyboard.nextInt();
                bc.setAge(tempAge);
                break;

            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }


        }

        while (true) {
            try {
                int tempChildrenNo;
                System.out.print("Please enter the number of children you have: ");
                tempChildrenNo = keyboard.nextInt();
                bc.setChildrenNo(tempChildrenNo);
                break;

            } catch (Exception e) {
                System.out.println(e);
                keyboard.next();
            }


        }

        //call calculate budget for expenses method
        bc.calculateBudget();
        int tempMonthlyIncome;

        //prompt the user of their monthly income
        System.out.print("Please enter your monthly income: ");
        tempMonthlyIncome = keyboard.nextInt();

        //call calculate saving budget method
        bc.calculateSavingBudget(tempMonthlyIncome);

        //compares the method of comparison between total wants and needs with the suggested expenses
        bc.comparison();


    }
}