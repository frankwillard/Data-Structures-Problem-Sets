import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        ArrayList<String> overlap_club = new ArrayList<>(Arrays.asList(club1));
        ArrayList<String> overlap_club_2 = new ArrayList<>(Arrays.asList(club2));
        ArrayList<String> overlap_club_3 = new ArrayList<>(Arrays.asList(club3));
        overlap_club.retainAll(overlap_club_2);
        overlap_club_2.retainAll(overlap_club_3);
        overlap_club_3.retainAll(Arrays.asList(club1));
        overlap_club.addAll(overlap_club_2);
        overlap_club.addAll(overlap_club_3);
        HashSet<String> overlap = new HashSet<>(overlap_club);
        String[] res = overlap.toArray(new String[0]);
        Arrays.sort(res);
        return res;
    }
}