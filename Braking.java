import java.lang.Math;
/**
 * This class mimics brakes
 * @author Jeremi Frazier  
 * @version 1.0
 */
public class Braking {
   /**
    * This method takes the speed of the the car and the total stoping distance formula to calcuate the distance need to brake
    * @param v - the velocity
    * @param mu - the reaction time of the driver
    * @return double -the distance
    */
   
    public static double dist(double v, double mu) {    // suppose reaction time is 1
        v = v/((double)3600/1000);
        return ((v*v) / ((double)2*mu*9.81)) + v;
   /**
    * This method takes the distance of the the car and the total stoping distance formula to calcuate the speed the car was going
    * @param v - the braking distance
    * @param mu - the reaction time of the driver
    * @return double -the speed
    */
        
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
