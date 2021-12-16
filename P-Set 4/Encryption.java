import java.util.*;

public class Encryption {

    public String encrypt(String message){
        // you write code here
        String out= "";
        HashMap<Character,Character> chars = new HashMap<>();
        int min_char = 97;
        for(int i = 0; i < message.length(); i++)
        {
            char current = message.charAt(i);
            char current_encrypted;
            if(!chars.containsKey(current))
            {
                current_encrypted = (char) min_char;
                chars.putIfAbsent(current, current_encrypted);
                min_char++;
            }
            else
            {
                current_encrypted = chars.get(current);
            }
            out += Character.toString(current_encrypted);
        }
        return out;
    }
}