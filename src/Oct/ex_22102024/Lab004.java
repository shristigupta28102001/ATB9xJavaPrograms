package Oct.ex_22102024;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write your age " );
        int age = sc.nextInt();

        while(age<30)
        {
            System.out.println("The age is " +age);
            age++;
        }
        sc.close();
    }
}
