import java.util.Scanner;

public class Anagra {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = false;
        int count = 0;
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        if(a.length() == b.length()){
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if(ac[i] == bc[j]){
                        bc[j]=' ';
                        count++;
                        break;
                    }
                }
            }
        }
        
        if(count == a.length()){
            anagram = true;
        }
        
        return anagram;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}






