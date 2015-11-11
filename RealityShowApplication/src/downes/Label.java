/**
 * 
 */
package downes;

/**
 * @author Aden Downes
 *
 */
public class Label {

	private ContestantInformation ci1;
	private String output;
		public Label (ContestantInformation ci){
			this.ci1 = ci;
			formatName();
			formatAddress();
			formatNumber();
		
		}
		public String formatName(){
			String name = ci1.getLastName() + ", " + ci1.getFirstName()+"/n";
			this.output = output + ci1.getLastName() + ", " + ci1.getFirstName()+"/n";
			return name;
		}
		
		public String formatAddress(){
			String address = ci1.getStreetAddress() + "/n" + ci1.getCity() + ", " + ci1.getProvince() + "/n" + ci1.getPostalCode();
			this.output = output + ci1.getStreetAddress() + "/n" + ci1.getCity() + ", " + ci1.getProvince() + "/n" + ci1.getPostalCode();
			return address;
		}
		
		public String formatNumber(){
			String cNumber = ci1.getPhone();
			String number = ("(" + (cNumber).substring(0, 3) + ") " + (cNumber).substring(4, 7) +  "-" + (cNumber).substring(7, 11)); 
			this.output = output + ("(" + (cNumber).substring(0, 3) + ") " + (cNumber).substring(4, 7) +  "-" + (cNumber).substring(7, 11)); 
			return number;
		}
		
		public String ToString(){
			return output;
		}
	
	/**
	 * 
	 */

}
