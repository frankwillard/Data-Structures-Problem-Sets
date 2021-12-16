public class TxMsg {

    public String getMessage(String original) {
        // code here
        StringBuilder result = new StringBuilder();
        String[] orig_elems = original.split(" ");
        for(int i = 0; i < orig_elems.length; i++)
        {
            String elem = orig_elems[i];
            StringBuilder resword = new StringBuilder(elem);
            int elem_length = elem.length();
            boolean[] isaVowel = new boolean[elem_length];
            boolean containsConsonant = false;
            int k = 0;
            for(int j = 0; j < elem_length; j++) {
                String substr = elem.substring(j, j + 1);
                isaVowel[j] = isVowel(substr);
                if (isaVowel[j] && containsConsonant) {
                    resword.delete(k, k+1);
                    k--;
                }
                if (!isaVowel[j] && !containsConsonant) {
                    containsConsonant = true;
                    resword.delete(0, j);
                    k-=j;
                }
                if(j > 0 && !isaVowel[j] && !isaVowel[j-1])
                {
                    resword.delete(k, k+1);
                    k--;
                }
                k++;
            }
            result.append(resword);
            if(i < orig_elems.length -1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }

    private boolean isVowel(String charac)
    {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for(int i = 0; i < vowels.length; i++)
        {
            if(charac.equals(vowels[i]))
            {
                return true;
            }
        }
        return false;
    }

}