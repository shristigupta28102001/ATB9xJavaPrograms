package Oct.ex_21102024;

public class Lab001_ForLoop {
    public static void main(String[] args) {
        for (int i =0;i<50;i++)
        {
            if(i%2==0) {
                System.out.println("even no -> " +i);
                continue;
            }
            else {
                System.out.println("odd no -> "+i);
            }
        }

    }
}
