public class BinSearch {
    boolean isCharPresent = false;
    Character ch = ' ';

    boolean search(String s, Character c){
        int m = s.length();

        if (m == 0){
            return isCharPresent;
        }
        
        ch = s.charAt(m/2);
        if (c == ch){
            isCharPresent = true;
            return isCharPresent;
        }
        else if(c > ch){
            s = s.substring((m/2)+1);
            search(s, c);
        }
        else if(c < ch){
            s = s.substring(0, m/2);
            search(s, c);
        }
    return isCharPresent;
    }

}
