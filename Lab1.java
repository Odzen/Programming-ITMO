import java.lang.Math; 


public class Lab1
{
    public static void main(String args [])
    {
        short d[]=new short[10]; 
        double x[]=new double[11];
        double z[][]= new double[10][11];

        for(int i=0,  val =21; i<d.length;i++, val-=2)
            d[i]=(short)val;

        for(int i=0; i<x.length;i++)
            x[i]=randomNumber();
            
     
     // two-dimensional array

     for(int i=0; i<10; i++)
     {
        for (int j=0;j<11;j++)
        {
            if(d[i]==7)
                z[i][j]=firstOp(x[j]);
            else if (d[i]==5 ||d[i]==11 || d[i]==13|| d[i]==19 || d[i]==21)
                z[i][j]=secondOp(x[j]);
            else
                z[i][j]=thirdOp(x[j]);

            System.out.print(String.format("%.4f", z[i][j]) + " | ");

        }
        
        System.out.println();            
        System.out.println();
     }
     
    /* Print for tests 
     printShort(d);

     printDouble(x);
     */     

    }

    public static double randomNumber()
    {
        double max= 8.0; 
        double min= -13.0; 
        double range= max-min;
        return (Math.random()* range)  + min;
        
    }

    public static double firstOp(double x)
    {
        double cubicRoot=Math.pow(x,1.0/3.0);
        double numerator=1.0/2.0;
        double denominator= Math.pow(cubicRoot,1.0/3.0);
        double value= Math.pow((numerator/denominator),Math.tan(cubicRoot));
        
        return value; 
    }

    public static double secondOp(double x)
    {
        double innerOp= Math.sin(Math.pow((4.0/x),x));
        double value= Math.sin(innerOp);
        
        return value;
    }

    public static double thirdOp(double x)
    {
        double numerator=Math.sin(Math.pow(x, ((Math.PI-x)/x)));
        double denominator=2.0;
        double innerOp= Math.pow((numerator/denominator),2.0);
        double value=Math.pow(innerOp,1.0/3.0);

        return value;
    }

    /* auxiliary functions for printing and testing

    public static void printShort(short[] a)
    {
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void printDouble(double[] a)
    {
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    */

}

