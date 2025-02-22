import java.util.Scanner;

public class StringMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringManipulator obj = new StringManipulator();
        while (true) {
            System.out.println("Choose a String operation you want to perform:");
            System.out.println("1. Reverse a sentence");
            System.out.println("2. Replace a word in a sentence");
            System.out.println("3. Count word frequency in a sentence");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter a sentence:");
                    String s1 = sc.nextLine();
                    System.out.println("Reversed sentence: " + obj.ReverseWord(s1));
                    break;

                case 2:
                    System.out.println("Enter a sentence:");
                    String s2 = sc.nextLine();
                    System.out.println("Enter the word you want to replace:");
                    String orgWord = sc.next();
                    System.out.println("Enter the new word:");
                    String newWord = sc.next();
                    System.out.println("New sentence: " + obj.ReplaceWord(s2, orgWord, newWord));
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