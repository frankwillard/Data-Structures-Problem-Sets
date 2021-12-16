
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        // fill in code here
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < rights.length; i++)
        {
            if(rights[i] >= minPermission)
            {
                results.append("A");
            }
            else
            {
                results.append("D");
            }
        }
        return results.toString();
    }
}