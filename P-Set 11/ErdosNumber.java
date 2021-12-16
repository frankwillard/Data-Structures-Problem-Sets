import java.util.*;

public class ErdosNumber {

    TreeMap<String, Set<String>> myGraph;
    TreeMap<String, Integer> myDistance;

    public String[] calculateNumbers(String[] pubs) {
        // you write code here
        makeGraph(pubs);
        ArrayList<String> list = new ArrayList<>();
        bfsErdos();
        for(String s : myGraph.keySet())
        {
            if(myDistance.containsKey(s))
            {
                s = s + " " + myDistance.get(s);
            }
            list.add(s);
        }
        return list.toArray(new String[0]);
    }

    public void makeGraph(String[] pubs)
    {
        myGraph = new TreeMap<>();
        for(String s: pubs)
        {
            String[] authors = s.split(" ");
            for(String author : authors)
            {
                myGraph.putIfAbsent(author, new TreeSet<String>());
                for(String coauthor: authors)
                {
                    if(coauthor != author)
                    {
                        myGraph.get(author).add(coauthor);
                    }
                }
            }
        }
    }

    public void bfsErdos()
    {
        myDistance = new TreeMap<>();
        Set<String> visited = new TreeSet<>();
        Queue<String> q = new LinkedList<>();
        myDistance.put("ERDOS", 0);
        visited.add("ERDOS");
        q.add("ERDOS");
        while(q.size() > 0)
        {
            String v = q.remove();
            for(String adj : myGraph.get(v))
            {
                if(! visited.contains(adj))
                {
                    myDistance.put(adj,myDistance.get(v) +1);
                    visited.add(adj);
                    q.add(adj);
                }
            }
        }
    }





}