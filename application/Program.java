package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        double salary = employee.netSalary();

        System.out.printf("Employee: %s, $ %.2f", employee.name, salary);

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);

        scanner.close();
    }
}
