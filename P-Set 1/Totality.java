public class Totality {

    public int sum(int[] a, String stype) {
        // you add code here
        int typesum = 0;
        boolean odd = !stype.equals("even");
        boolean even = !stype.equals("odd");
        for (int i = 0; i < a.length; i++)
        {
            if((odd && i % 2 != 0) || (even && i % 2 == 0))
            {
                typesum += a[i];
            }
        }
        return typesum;
    }
}