public class Gravity {
    public double falling(double time, double velo){
        // fill in code here
        double accel = 9.8;
        return velo * time + 0.5 * accel * time * time;
    }
}