import java.lang.Math; 


public class Lab1
{
    public static void main(String args [])
    {
        short c[]=new short[10]; 
        double x[]=new double[11];
        double d[][]= new double[10][11];

        for(int i=0,  val =21; i<c.length;i++, val-=2)
            c[i]=(short)val;

        for(int i=0; i<x.length;i++)
            x[i]=randomNumber();
            
     
     // two-dimensional array

     for(int i=0; i<10; i++)
     {
        for (int j=0;j<11;j++)
        {
            
            if(c[i]==7)
                d[i][j]=firstOp(x[j]);
            else if (c[i]==5 ||c[i]==11 || c[i]==13|| c[i]==19 || c[i]==21)
                d[i][j]=secondOp(x[j]);
            else
                d[i][j]=thirdOp(x[j]);

            System.out.print(String.format("%.4f", d[i][j]) + " | ");

        }
        
        System.out.println();            
        System.out.println();
     }

    /*Print for tests 
     printShort(c);

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
        double value= Math.pow((numerator/denominator),Math.tan(Math.toRadians(cubicRoot)));
        
        return value; 
    }

    public static double secondOp(double x)
    {
        double innerOp= Math.sin(Math.toRadians(Math.pow((4.0/x),x))); 
        return Math.sin(Math.toRadians(innerOp));
    }

    public static double thirdOp(double x)
    {
        double numerator=Math.sin(Math.toRadians(Math.pow(x, ((Math.PI-x)/x))));
        double denominator=2.0;
        double innerOp= Math.pow((numerator/denominator),2.0);
        double value=Math.pow(innerOp,1.0/3.0);

        return value;
    }

    /*auxiliary functions for printing and testing

    public static void printShort(short[] a)
    {
        for(int i=0; i<a.length;i++)
            System.out.println(a[i]);
        System.out.println("\n");
    }

    public static void printDouble(double[] a)
    {
        for(int i=0; i<a.length;i++)
            System.out.println(a[i]);
        System.out.println("\n");
        
    }
    */
    

}

