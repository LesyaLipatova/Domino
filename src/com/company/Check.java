package com.company;

import java.util.Scanner;

public class Check {

    public static int input() throws NumberFormatException {

        Scanner scnFromConsole = new Scanner(System.in);
        String number = scnFromConsole.nextLine();

        while (!isInt(number)) {
            System.out.print("Введите количество игроков: ");
            number = scnFromConsole.nextLine();
            isInt(number);
        }

        System.out.println("ok");
        return Integer.parseInt(number);
    }

    private static boolean isInt(String number) throws NumberFormatException
    {
        try {
            Integer.parseInt(number);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

}
