/**
 * 
 */
package downes;

import java.util.Scanner;
/**
 * @author 342643103
 *
 */
public class TowersOfHanoi {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * 
	 */
	public TowersOfHanoi() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	    System.out.print("Enter number of discs: " );
	    Scanner scanner = new Scanner(System.in);
	    int discs = scanner.nextInt();
	    towersOfHanoi.solve(discs, "A", "B", "C");
	    System.out.println("\n" + "And then you're done!");
	}
	
	public void solve(int n, String src, String aux, String dest) {
	       if (n == 1) {
	           System.out.println("\n" + "Move " + src + " to " + dest + "\n");
	       } else {
	           solve(n - 1, src, dest, aux);
	           System.out.println("Then move " + src + " to " + dest + "\n\n");
	           solve(n - 1, aux, src, dest);
	       }
	   }

}
