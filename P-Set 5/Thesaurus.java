import java.util.*;

public class Thesaurus {

    public String[] edit(String[] entry) {
        // TODO: fill in code here
        ArrayList<TreeSet<String>> list = convert(entry);

        while(true)
        {
            int size = list.size();
            list = combine(list);
            if(list.size() == size) break;
        }

        ArrayList<String> ret = new ArrayList<>();
        for(TreeSet<String> set:  list)
        {
            String s = String.join(" ", set);
            ret.add(s);
        }
        Collections.sort(ret);
        return ret.toArray(new String[0]);
    }

    public ArrayList<TreeSet<String>> convert(String[] entry)
    {
        ArrayList<TreeSet<String>> ret = new ArrayList<>();
        for(String s: entry)
        {
            String[] elems = s.split(" ");
            TreeSet<String> current = new TreeSet<>();
            for(String s_elem: elems)
            {
                current.add(s_elem);
            }
            ret.add(current);
        }
        return ret;
    }

    public ArrayList<TreeSet<String>> combine(ArrayList<TreeSet<String>> list)
    {
        ArrayList<TreeSet<String>> ret = new ArrayList<>(list);
        for(int i = 0; i < ret.size(); i++)
        {
            for(int j = i + 1; j < ret.size(); j++)
            {
                TreeSet<String> current = new TreeSet<>(ret.get(i));
                TreeSet<String> other = new TreeSet<>(ret.get(j));
                current.retainAll(other);
                if(current.size() >= 2)
                {
                    ret.get(i).addAll(ret.get(j));
                    ret.remove(j);
                }
            }
        }
        return ret;
    }

}