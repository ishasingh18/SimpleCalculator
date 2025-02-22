import java.util.StringTokenizer;

public class StringManipulator {
    public String ReverseWord(String str){
        StringTokenizer st = new StringTokenizer(str);
        String rev="";
        while(st.hasMoreTokens()){
            rev= st.nextToken()+ " "+ rev;
        }
        return rev;
    }
    public String ReplaceWord(String sent,String oldstr, String newstr){
        StringTokenizer st = new StringTokenizer(sent);
        String newsent="";
        boolean temp = false;
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.equals(oldstr)){
                newsent+= newstr + " ";
                temp = true;
            }
            else {
                newsent += word + " "; // Keep other words unchanged
            }
        }
        if(!temp){
            System.out.println("The word you want to replace doesn't exist in the sentence!");
            System.out.println("Please try again.");
            System.exit(0);
        }
        return newsent;

    }
    public int Frequency(String sent, String str){
        StringTokenizer st = new StringTokenizer(sent);
        int count = 0;
        boolean temp = false;
        while(st.hasMoreTokens()){
            String word = st.nextToken();
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
