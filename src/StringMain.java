import java.util.Scanner;

public class StringMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringManipulator obj = new StringManipulator();
       /* System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.print("Reversed sentence is = "+ obj.ReverseWord(s));*/
            System.out.println("Enter a sentence ");
            String s1 = sc.nextLine();
            System.out.println("Enter word you want to replace");
            String orgword = sc.next();
            System.out.println("Enter new word you want to replace with ");
            String newword = sc.next();
            System.out.println("New sentence is = " + obj.ReplaceWord(s1, orgword, newword));
        }

    }

