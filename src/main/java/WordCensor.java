import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement

        Scanner sc = new Scanner(System.in);
        String initial = sc.nextLine();
        if(initial.toLowerCase().contains("dang") || (initial.contains("nuts") || initial.contains("oops") || initial.contains("yikes") ))
        {
            String newStr = initial.replace("dang", "***").replace("nuts","***").replace("oops", "***").replace("yikes", "***");
            System.out.println("Censored: " + newStr);
        }
        else
        {
            System.out.print("Censored:" + initial);
        }
        
    }
}
