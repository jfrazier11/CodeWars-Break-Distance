import java.lang.Math;
public class Braking {
    
    public static double dist(double v, double mu) {    // suppose reaction time is 1
        v = v/((double)3600/1000);
        return ((v*v) / ((double)2*mu*9.81)) + v;
        
    }
    public static double speed(double d, double mu) {   // suppose reaction time is 1
            double root1, root2; //This is now a double, too.
            double a,b,c;
            a = 1/(2*mu*9.81);
            b = 1;
            c = d*-1;
            root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            return Math.max(root1, root2) * 3.6;  
    }
}
