/**
 * @author raul aguilar
 */
package calculateelasticity;
import java.util.Scanner;

public class CalculateElasticity {
    
    public static double elasticity(double oq, double nq, double op, double np)
    {
        return ( ( (oq-nq)/((oq+nq)/2) ) * 100)/( ((np-op)/((np+op)/2)) * 100);
    }
    
    public static void main(String[] args) {
        double oq;
        double nq;
        double op;
        double np;
        double elasticity;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter old quanity: ");
        oq = in.nextDouble();
        System.out.println("Enter new quanity: ");
        nq = in.nextDouble();
        System.out.println("Enter old price: ");
        op = in.nextDouble();
        System.out.println("Enter new price: ");
        np = in.nextDouble();
        elasticity = elasticity(oq, nq, op, np);
        System.out.printf("%n%s %.2f%n", "Elasticity:", elasticity);
    }
}
