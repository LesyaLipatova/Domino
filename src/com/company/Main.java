package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите количество игроков: ");
        if(Check.input() == 4) {
            LinkedList firstPlayer = new LinkedList(Distribution.distribute());
            LinkedList secondPlayer = new LinkedList(Distribution.distribute());
            LinkedList thirdPlayer = new LinkedList(Distribution.distribute());
            LinkedList fourthPlayer = new LinkedList(Distribution.distribute());
        }
        if (Check.input() == 3) {
            LinkedList firstPlayer = new LinkedList(Distribution.distribute());
            LinkedList secondPlayer = new LinkedList(Distribution.distribute());
            LinkedList thirdPlayer = new LinkedList(Distribution.distribute());
        }
        if (Check.input() == 2) {
            LinkedList firstPlayer = new LinkedList(Distribution.distribute());
            LinkedList secondPlayer = new LinkedList(Distribution.distribute());
        }

    }
}
