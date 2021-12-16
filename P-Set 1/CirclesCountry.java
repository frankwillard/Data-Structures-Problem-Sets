import java.util.*;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {
        int borders = 0;
        for(int i = 0; i < x.length; i++)
        {
            boolean first = engulfed(x[i], y[i], r[i], x1, y1);
            boolean second = engulfed(x[i], y[i], r[i], x2, y2);
            if((first || second) && !(first && second))
            {
                borders += 1;
            }
        }
        return borders;

    }

    private boolean engulfed(int x, int y, int r, int x1, int y1)
    {
        int xdiff = x1 - x;
        int ydiff = y1 - y;
        double dist = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return dist <= r;
    }

}