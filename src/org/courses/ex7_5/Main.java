package org.courses.ex7_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter arithmetic operation sign:");
        String sign = sc.next();
        Calculator calculator = new Calculator(number1, number2);

        switch (sign) {
            case "+": {
                calculator.add();
                break;
            }
            case "-": {
                calculator.sub();
                break;
            }
            case "*": {
                calculator.mul();
                break;
            }
            case "/": {
                calculator.div();
                break;
            }
            default:
                if (sign != "+" && sign != "-" && sign != "*" && sign != "/") {
                    throw new ArithmeticException("Enter correct sign of arithmetic operation.");
                }
        }
    }
}
