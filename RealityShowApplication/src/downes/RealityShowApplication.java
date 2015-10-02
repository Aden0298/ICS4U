/**
 * 
 */
package downes;

import java.util.Scanner;

/**
 * @author 342643103
 *
 */
public class RealityShowApplication {
	
	static Scanner input = new Scanner(System.in);
	/**
	 * 
	 */
	public RealityShowApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws InvalidInputException 
	 */
	public static void main(String[] args) throws InvalidInputException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to 'Name That Sound'!");
		ContestantInformation contestant1 = new ContestantInformation();
		ContestantInformation contestant2 = new ContestantInformation();
		
		System.out.println("Please enter your first name.");
		String fN =input.nextLine();
		contestant1.setFirstName(fN);
		System.out.println("Please enter your last name.");
		String lN=input.nextLine();
		contestant1.setLastName(lN);
		System.out.println("Please ener your street address (## name)");
		String sA=input.nextLine();
		contestant1.setStreetAddress(sA);
		System.out.println("Please enter your city.");
		String cT=input.nextLine();
		contestant1.setCity(cT);
		System.out.println("Please enter your province (e.g. Ontario, Alberta)");
		String provinceC =input.nextLine();
		contestant1.setProvince(provinceC);
		System.out.println("Please enter your postal code. (e.g. A#A #A#");
		String pC=input.nextLine();
		contestant1.setPostalCode(pC);
		System.out.println("Please enter your phone number. (e.g. (###) ###-####)");
		String pH=input.nextLine();
		contestant1.setPhone(pH);
		System.out.println("Please enter your birth date.");
		String bD=input.nextLine();
		contestant1.setBirthDate(bD);
		Label label1 = new Label(contestant2);
		System.out.print(label1.toString());
	}

}
