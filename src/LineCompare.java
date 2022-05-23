import java.util.Scanner;

public class LineCompare {
        public double x1, x2, y1, y2, length;
        public void calculateLength()
        {

            System.out.println("Calutating Length");
            System.out.println("Enter x1 : ");
            //System.out.println("x1:"+x1);
            Scanner sc=new Scanner(System.in);
            x1=sc.nextInt();
            System.out.println("Enter y1 : ");
            y1=sc.nextInt();
            System.out.println("Enter x2: ");
            x2=sc.nextInt();
            System.out.println("Enter y2 : ");
            y2=sc.nextInt();

            double length=Math.sqrt( Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) ));
            System.out.println("Length of line is :" +length);
        }
        public static void main(String args[])
        {
            LineCompare lc=new LineCompare();
            lc.calculateLength();
        }
    }

