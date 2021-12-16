import java.util.*;

public class SimpleWordGame {

    public int points(String[] player,
                      String[] dictionary) {
        int score = 0;
        HashSet<String> play = new HashSet<>(Arrays.asList(player));
        HashSet<String> dict = new HashSet<>(Arrays.asList(dictionary));
        play.retainAll(dict);
        for(String s : play)
        {
            int length = s.length();
            score += length * length;
        }
        return score;
    }

}
    /*
    public int points(String[] player,
                      String[] dictionary) {
        int score = 0;
        //List<String> dict = Arrays.asList(dictionary);
        ArrayList<String> found = new ArrayList<String>();
        for(String guess: player)
        {
            if(contains(dictionary, guess) && !found.contains(guess))
            {
                int length = guess.length();
                found.add(guess);
                score += length * length;
            }
        }
        return score;
    }

    /*public int points(String[] player,
                      String[] dictionary) {
        int score = 0;
        HashSet<String> found = new HashSet<String>();
        for(String guess: player)
        {
            if(contains(dictionary, guess))
            {
                found.add(guess);
            }
        }
        for(String s: found)
        {
            int length = s.length();
            score += length * length;
        }
        return score;
    }

    private boolean contains(String[] arr, String elem)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(elem))
            {
                return true;
            }
        }
        return false;
    }*/