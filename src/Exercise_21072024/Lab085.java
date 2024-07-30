package Exercise_21072024;

public class Lab085 {
    public static void main(String[] args) {
        //boolean, byte, short, int, long, float, double, char
        boolean b1=true;
       // for (int i = 0; b1 ; i++) //boolean
        // {
        //    System.out.println("Hello World!"); //Infinite loop
        // }

        for (float f = 0.0f; f <=100 ; f++) //float type
        {
            System.out.println(f);
        }

        for (long l=0; l<=50; l++) //long type
        {
            System.out.println(l);
        }

        for (byte b=1; b<=20; b++) //byte
        {
            System.out.println(b);
        }

        for (char c='a'; c<='z'; c++)
        {
            System.out.println(c);
        }
    }
}
