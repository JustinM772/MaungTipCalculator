import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people? ");
        int people = scan.nextInt();
        System.out.print("How much is the tip percentage?(0-100) ");
        int percentage = scan.nextInt();
        System.out.print("How much is the tax? ");
        double tax = scan.nextDouble();
        System.out.print("Enter a cost in dollars and cents(-1 to end): ");
        double amountToAdd = scan.nextDouble();
        scan.nextLine();
        amountToAdd *= 100;
        double totalCostBeforeTip = 0;
        totalCostBeforeTip += amountToAdd;


        while (amountToAdd != -100.0) {
            System.out.print("Enter a cost in dollars and cents(-1 to end): ");
            amountToAdd = scan.nextDouble();
            amountToAdd *= 100;
            totalCostBeforeTip += amountToAdd;
            scan.nextLine();

        }
        totalCostBeforeTip /= 100;
        totalCostBeforeTip += 1;
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + totalCostBeforeTip);
        System.out.println("Total percentage: " + percentage + "%");
        System.out.println("Total tax: " + tax + "%");
        double totalCostWithTax = Math.round((Math.round(totalCostBeforeTip * (tax / 100.0) * 100.0) / 100.0 + totalCostBeforeTip) * 100.0) / 100.0 ;
        System.out.println("Total bill with tax: " + totalCostWithTax);
        double totalTip = (double) percentage / 100 * totalCostWithTax;
        System.out.println("Total tip: $" + Math.round(totalTip * 100.0) / 100.0); // I learned how to round from here: https://stackoverflow.com/questions/5710394/how-do-i-round-a-double-to-two-decimal-places-in-java
        double totalCostWithTip = totalCostWithTax + totalTip;
        System.out.println("Total bill with tip: $" + Math.round(totalCostWithTip * 100.0) / 100.0);
        double costPerPersonBeforeTip = totalCostWithTax / people;
        System.out.println("Per person cost before tip: $" + Math.round(costPerPersonBeforeTip * 100.0) / 100.0);
        double tipPerPerson = totalTip / people;
        System.out.println("Tip per person: $" + Math.round(tipPerPerson * 100.0) / 100.0);
        double totalCostPerPerson = costPerPersonBeforeTip + tipPerPerson;
        System.out.println("Total cost per person: $" + Math.round(totalCostPerPerson * 100.0) / 100.0);
