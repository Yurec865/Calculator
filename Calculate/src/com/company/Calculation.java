package com.company;

import java.util.ArrayList;

public class Calculation {

   ArrayList<OperationHistory> operationHistories = new ArrayList<OperationHistory>();

    public int calculate(String operation) {
        if (operation.contains("+")) {
            String[] split = operation.split("\\+");
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            OperationHistory operationHistory = new OperationHistory();
            operationHistory.setDescription("Add");
            operationHistory.setDate(24);
            operationHistories.add(operationHistory);
            return (int) (a+b);
        }
        if (operation.contains("-")) {
            String[] split = operation.split("\\-");
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            OperationHistory operationHistory1 = new OperationHistory();
            operationHistory1.setDescription("Minus");
            operationHistory1.setDate(25);
            operationHistories.add(operationHistory1);
            return (int) (a-b);
        }
        if (operation.contains("*")) {
            String[] split = operation.split("\\*");
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            OperationHistory operationHistory2 = new OperationHistory();
            operationHistory2.setDescription("Multiply");
            operationHistory2.setDate(26);
            operationHistories.add(operationHistory2);
            return (int) (a*b);
        }
        if (operation.contains("/")) {
            String[] split = operation.split("\\/");
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            OperationHistory operationHistory3 = new OperationHistory();
            operationHistory3.setDescription("Divide");
            operationHistory3.setDate(27);
            operationHistories.add(operationHistory3);
            return (int) (a/b);
        }
        return 0;
    }
}