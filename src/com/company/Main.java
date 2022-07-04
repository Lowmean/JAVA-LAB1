package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива 1:");
        int counter1=0;
        int counter2=0;
        int counter3=0;
        for (int i = 0; i < 7; i++) {
            int next = input.nextInt();
            if (next %2 == 0) {
                next *= -1;
            }
            if (next<0){
                counter1++;
            }
            array1.add(next);

        }
        System.out.println("Введите элементы массива 2:");
        for (int i = 0; i < 5; i++) {
            int next = input.nextInt();
            if(next %2 == 0) {
                next *= -1;
            }
            if(next<0){
                counter2++;
            }
            array2.add(next);

        }
        System.out.println("Введите элементы массива 3:");
        for (int i = 0; i < 6.; i++) {
            int next = input.nextInt();
            if(next %2 ==0){
                next *= -1;
            }
            if(next<0){
                counter3++;
            }
            array3.add(next);
        }
        System.out.println(array1.toString());
        System.out.println(array2.toString());
        System.out.println(array3.toString());
        System.out.println("Массив 1 имеет " + counter1 + " отрицательный(-х) элемент(ов)");
        System.out.println("Массив 2 имеет " + counter2 + " отрицательный(-х) элемент(ов)");
        System.out.println("Массив 3 имеет " + counter3 + " отрицательный(-х) элемент(ов)");
    }

}