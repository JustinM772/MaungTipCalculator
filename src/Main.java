import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people? ");
        int people = scan.nextInt();
        System.out.print("How much is the tip percentage?(0-100) ");
        int percentage = scan.nextInt();
        System.out.print("Enter a cost in dollars and cents(-1 to end): ");
        double amountToAdd = scan.nextDouble();
        amountToAdd *= 100;
        double totalCostBeforeTip = 0;
        totalCostBeforeTip += amountToAdd;
        while (amountToAdd != -100.0) {
            System.out.print("Enter a cost in dollars and cents(-1 to end): ");
            amountToAdd = scan.nextDouble();
            amountToAdd *= 100;
            totalCostBeforeTip += amountToAdd;
        }
        totalCostBeforeTip /= 100;
        totalCostBeforeTip += 1;
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + totalCostBeforeTip);
        System.out.println("Total percentage: " + percentage + "%");
        double totalTip = (double) percentage / 100 * totalCostBeforeTip;
        System.out.println("Total tip: $" + totalTip);
        double totalCostWithTip = totalCostBeforeTip + totalTip;
        System.out.println("Total bill with tip: $" + totalCostWithTip);
        double costPerPersonBeforeTip = totalCostBeforeTip / people;
        System.out.println("Per person cost before tip: $" + costPerPersonBeforeTip);
        double tipPerPerson = totalTip / people;
        System.out.println("Tip per person: $" + tipPerPerson);
        double totalCostPerPerson = costPerPersonBeforeTip + tipPerPerson;
        System.out.println("Total cost per person: $" + totalCostPerPerson);
    }
}
