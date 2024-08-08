package Exercise_27072024;

public class Lab112 {
    public static void main(String[] args) {
        int arr2D[][] = {
                {10,20,30},
                {11,22,33},
                {21,22,23}
        };

        System.out.println(arr2D.length);
        System.out.println("-----------------");

        for (int i = 0; i < arr2D.length ; i++)
        {
            for (int j = 0; j < arr2D[i].length ; j++)
            {
                System.out.print(arr2D[i][j]);
                System.out.print('\t');
            }
            System.out.print('\n');
        }

    }
}
