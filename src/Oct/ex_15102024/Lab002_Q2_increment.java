package Oct.ex_15102024;

public class Lab002_Q2_increment {
    public static void main(String[] args) {
        int a = 10;
        int b = a++; //11
        int c = ++a; //12
        int d = --a;
        int e = a--;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a); // here why a is showing as 10?
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
