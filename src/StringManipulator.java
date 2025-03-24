import java.util.*;

public class StringManipulator {
    public List<String> findPalindromes(String sentence) {
        List<String> palindromes = new ArrayList<>(); // List to store palindromes
        Set<String> seenPairs = new HashSet<>();//to check for duplicate pairs
        StringTokenizer st = new StringTokenizer(sentence);

        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();

            boolean isPalindrome = true;
            int left = 0, right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if (isPalindrome && !word.isEmpty()) {
                palindromes.add(word); // Adding word to list if palindrome
            }
        }
        return palindromes; //returning the list
    }
    public List<String> findAnagrams(String sentence) {
        {
            List<String> anagrams = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(sentence);
            List<String> words = new ArrayList<>();
            Set<String> seenPairs = new HashSet<>();

            while (st.hasMoreTokens()) {
                words.add(st.nextToken().toLowerCase());
            }

            for (int i = 0; i < words.size(); i++) {
                for (int j = i + 1; j < words.size(); j++) {
                    if (areAnagrams(words.get(i), words.get(j))) {
                        String pair = words.get(i) + " - " + words.get(j);
                        if (!seenPairs.contains(pair) && !seenPairs.contains(words.get(j) + " - " + words.get(i))) {
                            anagrams.add(pair);
                            seenPairs.add(pair);
                        }
                    }
                }
            }
            return anagrams;
        }
    }
    private boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public int Frequency(String sent, String str){
        StringTokenizer st = new StringTokenizer(sent);
        int count = 0;
        boolean temp = false;
        while(st.hasMoreTokens()){
            String word = st.nextToken().toLowerCase();
            if(str.equals(word)) {
                count++;
                temp = true;

            }
        }
        if(!temp){
            System.out.println("The word you entered doesn't exist in the sentence!");
            System.out.println("Please try again.");
            System.exit(0);

        }
        return count;
    }

}
