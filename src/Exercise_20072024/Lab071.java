package Exercise_20072024;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        // Optimized code
        // Program to find vowel and consonant

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char Character = sc.next().charAt(0);
        switch(Character)
        {
            case 'a', 'e', 'i', 'o', 'u' :
                System.out.println("Entered text is a vowel");
                break;
            default :
                System.out.println("Entered character is a consonant");
        }
    }
}
