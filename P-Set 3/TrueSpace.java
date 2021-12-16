public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // fill in code here
        long space = 0;
        for(int i = 0; i < sizes.length; i++)
        {
            int clusters = sizes[i] / clusterSize;
            int rem = sizes[i] % clusterSize;
            if(rem != 0)
            {
                clusters += 1;
            }
            space += clusters * clusterSize;
        }
        return space;
    }
}