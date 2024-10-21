package Oct.ex_15102024;

public class Lab001_Q1_ternary {
    public static void main(String[] args) {
        int a =-1;
        System.out.println(a > 0 ? "positive" : "negative");
        int age = 13;
        System.out.println(age>18 ? "allowed to vote":"Not allowed to vote");
        int x =10;
        int y =100;
        System.out.println(x>y? +x + " is max number":+y + " is max number");
        //find the max btw 3 nums using ternary op
        int i = 50;
        int j = 200;
        int k = -4;

        System.out.println(i>j&i>k? "max number is " +i : j>i&j>k? "max number is " +j:"max number is " +k);

    }
}
