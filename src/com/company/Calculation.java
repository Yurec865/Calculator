package com.company;

public class Calculation {

    public int calculate(String operation) {
        int a = Integer.parseInt(operation);
        if (operation.contains("+")) {
            operation.split(" + ");
        }
        System.out.println(a);
        return 0;
    }
}