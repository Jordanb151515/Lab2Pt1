
/**
 * Program to show imprecision with large numbers. Part of Lab2 Part1.
 *
 * @author Jordan Byrne
 * @version v.10
 * @since 2/6/2025
 */
public class Imprecision
{
    public static void main (String[] args){
        double x = 12345.6789e200;
        double y,z;
        y=1/x;
        z=x*y;
        
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " +z);
        System.out.println("The value of 1-z is: " + (1-z));
    }
}
