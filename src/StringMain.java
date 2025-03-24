import java.util.Scanner;

public class StringMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringManipulator obj = new StringManipulator();
        while (true) {
            System.out.println("Choose a String operation you want to perform:");
            System.out.println("1. Palindrome String");
            System.out.println("2. Anagram String");
            System.out.println("3. Count word frequency in a sentence");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter a sentence:");
                    String s1 = sc.nextLine();
                    System.out.println("Palindromes are = " + obj.findPalindromes(s1));
                    break;

                case 2:
                    System.out.println("Enter a sentence:");
                    String s2 = sc.nextLine();
                    System.out.println("Anagram pairs are = " + obj.findAnagrams(s2));
                    break;

                case 3:
                    System.out.println("Enter a sentence:");
                    String s3 = sc.nextLine();
                    System.out.println("Enter a word whose frequency you want to count:");
                    String word = sc.next();
                    int freq = obj.Frequency(s3, word);
                    if (freq == 0) {
                        System.out.println("The word doesn't exist in the sentence.");
                    } else {
                        System.out.println("Frequency of the word: " + freq);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    }