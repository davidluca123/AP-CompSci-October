/**
 * Write a description of class Exercise1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exercise1
{
   public static void main(String[] args){
       int x1=31;
       int y1=15;
       int x2=34;
       int y2=9;
       double d=distance(x1,y1,x2,y2);
       System.out.println("Distance from Baltimare to Manehattan = " + d);
       x1=6;
       y1=20;
       x2=21;
       y2=8;
       d=distance(x1,y1,x2,y2);
       System.out.println("Distance from Los Pegasus to Neighagra Falls = " + d);
       x1=27;
       y1=23;
       x2=16;
       y2=14;
       d=distance(x1,y1,x2,y2);
       System.out.println("Distance from Badlands to Ponyville = " + d);
    }
   public static double distance(int x1,int y1,int x2,int y2){
       double d= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
       return d;
    }
}

