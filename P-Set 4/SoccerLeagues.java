public class SoccerLeagues {

    public int[] points(String[] matches) {
        // you write code here
        int[] point_res = new int[matches.length];
        for(int i = 0; i < matches.length; i++)
        {
            for(int j = 0; j < matches[i].length(); j++)
            {
                char event = matches[i].charAt(j);
                switch(event) {
                    case 'W':
                        point_res[i]+=3;
                        break;
                    case 'D':
                        point_res[i]+=1;
                        point_res[j]+=1;
                        break;
                    case 'L':
                        point_res[j]+=3;
                        break;
                }
            }
        }
        return point_res;
    }
}