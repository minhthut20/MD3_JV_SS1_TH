package BaiTap;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD");
        float dollar, vietnamdong;
        dollar = scanner.nextFloat();
        vietnamdong = dollar * rate;
        System.out.println("VND is " + vietnamdong + "VND");
    }
}
