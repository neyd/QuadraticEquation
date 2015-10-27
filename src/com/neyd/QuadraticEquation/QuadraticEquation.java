package com.neyd.QuadraticEquation;

import java.util.Scanner;

/**
 * Created by Женя on 27.10.2015.
 */

public class QuadraticEquation {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int res;
        int dis;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте квадратне рівняння a,b,c у рівнянні ax²+bx+c=0");
        System.out.println("Введіть а");
        res = Integer.parseInt(scanner.nextLine());
        a = res;
        System.out.println("Введіть b");
        res = Integer.parseInt(scanner.nextLine());
        b = res;
        System.out.println("Введіть c");
        res = Integer.parseInt(scanner.nextLine());
        c = res;
        dis = b * b - 4 * a * c;
        x1 = -(-b + Math.sqrt(dis)) / (2 * a);
        x2 = -(-b - Math.sqrt(dis)) / (2 * a);
        if (dis > 0) {
            x1 = x1 * 1000;
            x2 = x2 * 1000;
            int i = (int) Math.round(x1);
            int i2 = (int) Math.round(x2);
            x1 = (double) i / 1000;
            x2 = (double) i2 / 1000;
            System.out.println("Дискримінат = " + dis);
            System.out.println("Корені рівняння    " + x1 + "   " + x2);
        } else if (dis < 0) {
            System.out.println("Рівняння коренів не має");
        } else {
            x1 = x1 * 1000;
            int i = (int) Math.round(x1);
            x1 = (double) i / 1000;
            System.out.println("Дискримінант дорівнює 0, корінь рівняння     " + x1);
        }
    }
}
