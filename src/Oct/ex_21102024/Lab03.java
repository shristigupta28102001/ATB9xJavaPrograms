package Oct.ex_21102024;

public class Lab03 {
    public static void main(String[] args) {
        //no difference in using pre increment or post increment
        for(int a =0; a<3; a++)
        {
            System.out.println(a);
        }
        for(int b =0; b<3; ++b)
        {
            System.out.println(b);
        }
        for(int c =3; c>0; --c)
        {
            System.out.println(c);
        }
        for(int d =3; d>0; d--)
        {
            System.out.println(d);
        }
    }
}
