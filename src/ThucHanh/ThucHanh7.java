package ThucHanh;

import java.util.Scanner;

public class ThucHanh7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight : ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("bmi" + bmi);
        if(bmi<18){
            System.out.println("Gay");
        } else if (bmi<25.0) {
            System.out.println("Binh thuong");
        } else if (bmi<30.0) {
            System.out.println("Beo");
        }
        else {
            System.out.println("Beo Phi");
        }
    }
}
