package Oct.ex_21102024;

public class Lab07 {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++)
        {
            if(i==6)
                break;

            System.out.println(i);
        }
        for (int i = 3;i<10;i++)
        {
            if(i==7)
                continue;

            System.out.println(i);
        }
    }
}
