import java.util.*;

public class MedalTable {

    private class MedalCountry {
        String myName;
        int myGold;
        int mySilver;
        int myBronze;

        MedalCountry(String name) {
            myName = name;
        }

        public int getGold()
        {
            return myGold;
        }

        public int getSilver()
        {
            return mySilver;
        }

        public int getBronze()
        {
            return myBronze;
        }

        public String getName()
        {
            return myName;
        }

        @Override
        public String toString()
        {
            return String.format("%s %d %d %d", myName, myGold, mySilver, myBronze);
        }

    }

    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for(String s: results)
        {
            String[] data = s.split(" ");
            for(int i = 0; i < data.length; i++)
            {
                String c = data[i];
                if(!map.containsKey(c))
                {
                    map.put(c, new MedalCountry(c));
                }
                if(i == 0)
                {
                    map.get(c).myGold += 1;
                }
                else if(i == 1)
                {
                    map.get(c).mySilver += 1;
                }
                else if(i ==2)
                {
                    map.get(c).myBronze += 1;
                }
            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry :: getGold).reversed();
        Comparator<MedalCountry> silver = Comparator.comparing(MedalCountry :: getSilver).reversed();
        Comparator<MedalCountry> bronze = Comparator.comparing(MedalCountry :: getBronze).reversed();
        Comparator<MedalCountry> country = Comparator.comparing(MedalCountry :: getName);
        Comparator<MedalCountry> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(country);
        Collections.sort(list, comp);
        String[] ret = new String[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            ret[i] = list.get(i).toString();
        }
        return ret;
    }
}