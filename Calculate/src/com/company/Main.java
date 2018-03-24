package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the expression:");
            String operation = scanner.next();
            int expression = calculation.calculate(operation);
            System.out.println(expression);
            if (operation.equals("end")) {
                break;
            }
        }
        for (OperationHistory operationHistory : calculation.operationHistories)
            System.out.println(operationHistory);
    }
    }

