package Exercise_21072024;

public class Lab092 {
    public static void main(String[] args) {
        //continue....do not go ahead to next step
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
            if (i==3)
            {
                continue;
            }
            System.out.println("After");
        }
    }
}
