public class Common {

    public int count (String a, String b) {
        // TODO: fill in code here
        StringBuilder a_string = new StringBuilder(a);
        StringBuilder b_string = new StringBuilder(b);
        int count = 0;
        for(int i = 0; i < a_string.length(); i++)
        {
            for(int j = 0; j < b_string.length(); j++)
            {
                String a_substring = a_string.substring(i, i+1);
                String b_substring = b_string.substring(j, j+1);
                if (a_substring.equals(b_substring))
                {
                    count++;
                    a_string.delete(i, i+1);
                    b_string.delete(j, j+1);
                    j=-1;
                    if(i == a_string.length())
                    {
                        break;
                    }
                }
            }
        }
        return count;
    }
}