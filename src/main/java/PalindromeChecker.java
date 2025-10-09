import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String originString = sc.nextLine();
        String lowerString = originString.toLowerCase();
        StringBuilder stringBuilt = new StringBuilder(lowerString);
        stringBuilt.reverse();
        String reversedString = stringBuilt.toString();
        System.out.println();
        if(lowerString.equals(reversedString))
        {
            System.out.println(originString + " is a palindrome!");
        }
        else
        {
            System.out.println(originString + " is NOT a palindrome.");
        }
    }
}