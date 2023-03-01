package ThucHanh;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("Equasion pass with x = "+ x);
        }
    }
}
