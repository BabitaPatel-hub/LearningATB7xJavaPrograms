package Exercise_20072024;

import java.util.Scanner;

public class Lab070
{
    public static void main(String[] args)
    {
        // Take a user input as char and Tell the user if it is a vowel
        // a, e, i, o, u

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character and see if it is vowel or consonant : ");
        char Character = sc.next().charAt(0);

        switch(Character)
        {
            case 'a' :
                System.out.println(Character + " " + "is a vowel");
                break;
            case 'e' :
                System.out.println(Character + " " + "is a vowel");
                break;
            case 'i' :
                System.out.println(Character + " " + "is a vowel");
                break;
            case 'o' :
                System.out.println(Character + " " + "is a vowel");
                break;
            case 'u' :
                System.out.println(Character + " " + "is a vowel");
                break;
            default :
                System.out.println("Entered character is a consonant");
        }
    }
}
