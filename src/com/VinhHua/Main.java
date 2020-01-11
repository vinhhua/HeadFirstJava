package com.VinhHua;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	    takeUserInput(100000);
    }

    private static void takeUserInput(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 6);
        }
        System.out.println(countDice(arr));
    }

    private static String countDice(int[] arr) {
        int dice1 = 0;
        int dice2 = 0;
        int dice3 = 0;
        int dice4 = 0;
        int dice5 = 0;
        int dice6 = 0;
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) dice1++;
            else if (arr[i] == 2) dice2++;
            else if (arr[i] == 3) dice3++;
            else if (arr[i] == 4) dice4++;
            else if (arr[i] == 5) dice5++;
            else dice6++;
        }
        result = "dice1: "+dice1+"\ndice2: "+dice2+"\ndice3: "+dice3+"\ndice4: "+dice4+"\ndice5: "+dice5+"\ndice6: "+dice6;
        return result;
    }
}
