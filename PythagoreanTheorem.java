// Question 3
public class PythagoreanTheorem {
    public static void main(String[] args) {
        // getting the input
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // Getting C^2 by formula
        int aSquared = (int) Math.pow(a, 2);
        int bSquared = (int) Math.pow(b, 2);
        int cSquared = aSquared + bSquared;
        
        // Getting C by square root
        double c = Math.sqrt(cSquared);
        System.out.println("c : = " + c);
    }
}
