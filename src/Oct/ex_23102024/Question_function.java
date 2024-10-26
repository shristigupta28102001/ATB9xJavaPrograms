package Oct.ex_23102024;

import java.util.Scanner;

public class Question_function {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write First number = ");
        i = sc.nextInt();
        System.out.print("Write Second number = ");
        j = sc.nextInt();
        System.out.println("Addition of 2 numbers : " + add(i, j));
        System.out.println("Substraction of 2 numbers : " + sub(i, j));
        System.out.println("Multiplication of 2 numbers : " + mul(i, j));
        System.out.println("Division of 2 numbers : " + div(i, j));
        sc.close();
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a, int b)
    {
        return a-b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
}