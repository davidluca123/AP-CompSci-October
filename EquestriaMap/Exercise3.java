
/**
 * Write a description of class Exercise3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercise3
{
    public static void main(String[] args){
       int x1=31;
       int y1=15;
       int x2=34;
       int y2=9;
       double d=distance(x1,y1,x2,y2);
       double d1= d;
       x2=34;
       y2=9;
       int x3=6;
       int y3=20;
       d=distance(x2,y2,x3,y3);
       double d2= d;
       x3=6;
       y3=20;
       x1=31;
       y1=15;
       d=distance(x3,y3,x1,y1);
       double d3= d;
       double A=angle(d2,d3,d1);
       double a1=A;
       A=angle(d3,d1,d2); 
       double a2=A;
       A=angle(d1,d2,d3);
       double a3=A;
       System.out.println("Distance from Baltimare to Manehattan = " + d1);
       System.out.println("Distance from Manehattan to Los Pegasus =" + d2);
       System.out.println("Distance from Los Pegasus to Baltimare =" + d3);
       System.out.println("Angle between Los Pegasus, Baltimare, and Manehattan = "+ a1);
       System.out.println("Angle between Baltimare, Manehattan, and Los Pegasus = "+ a2);
       System.out.println("Angle between Manehattan, Los Pegasus, and Baltimare = "+ a3);
    }
    public static double distance(int x1,int y1,int x2,int y2){
       double d= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
       return d;
    }
    public static double angle(double a, double b, double c){
        double A= Math.toDegrees(Math.acos(((b*b)+(c*c)-(a*a))/(2*b*c)));
        return A;
    }
}