import java.util.*;

public class VoteRigging {
    public int minimumVotes(int[] votes) {
        // fill in code here
        if(votes.length == 1) return 0;
        int bc = 0;
        int me = votes[0];
        while(true)
        {
            int max_index = findMaxDexArr(votes);
            if(me > votes[max_index])
            {
                break;
            }
            //Make change
            votes[max_index]--;
            me++;
            //Update counter
            bc++;
        }
        return bc;
    }

    public int findMaxDexArr(int[] arr)
    {
        int dex = 1;
        for(int k = 2; k < arr.length; k++)
        {
            if(arr[dex] < arr[k])
            {
                dex = k;
            }
        }
        return dex;
    }
}