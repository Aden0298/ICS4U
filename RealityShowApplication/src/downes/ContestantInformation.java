package downes;

/**
 * 
 * ContestantInformation contains methods which gather
 * the information of contestants in a competition.
 * @author Aden Downes
 *
 */
public class ContestantInformation {
		
	public String firstName, lastName, streetAddress, city, province, postalCode, phone, birthDate;
				
	/**
	 * blank constructor
	 */
	public ContestantInformation(){
		
	}
	
	/**
	 * constructor
	 * @param String fN
	 * @param String lN
	 * @param String sA
	 * @param String cT
	 * @param String pR
	 * @param String pC
	 * @param String pH
	 * @param String bD
	 * @throws InvalidInputException 
	 */
	public ContestantInformation(String fN, String  lN, String sA, String cT, String pR, String pC, String pH, String bD) throws InvalidInputException {
		setFirstName(fN);
		setLastName(lN);
		setStreetAddress(sA);
		setCity(cT);
		setProvince(pR);
		setPostalCode(pC);
		setPhone(pH);
		setBirthDate(bD);
	}
	
	/**
	 * @return String firstName
	 */
	public String getFirstName(){
		return firstName;
	}
	
	/**
	 * @param String firstName 
	 */
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	/**
	 * @return String lastName
	 */
	public String getLastName(){
		return lastName;
	}
	
	/**
	 * @param String lastName
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
	 * @return String streetAddress
	 */
	public String getStreetAddress(){
		return streetAddress;
	}
	
	/**
	 * @param String streetAddress
	 */
	public void setStreetAddress(String streetAddress){
		this.streetAddress = streetAddress;
	}
	
	/**
	 * @return String city
	 */
	public String getCity(){
		return city;
	}
	
	/**
	 * @param String city
	 */
	public void setCity(String city){
		this.city = city;
	}
	
	/**
	 * @return String province
	 */
	public String getProvince(){
		return province;
	}
	
	/**
	 * @param String province
	 */
	String provinceCode;
	public void setProvince(String province){
		if (province.equalsIgnoreCase("ontario")){
			provinceCode = "ON";
		}
		else if (province.equalsIgnoreCase("quebec")) {
			provinceCode = "QC";
		}
		else if (province.equalsIgnoreCase("nova scotia")) {
			provinceCode = "NS";
		}
		else if (province.equalsIgnoreCase("new brunswick")) {
			provinceCode = "NB";
		}
		else if (province.equalsIgnoreCase("manitoba")) {
			provinceCode = "MB";
		}
		else if (province.equalsIgnoreCase("british colombia")) {
			provinceCode = "BC";
		}
		else if (province.equalsIgnoreCase("prince edward")) {
			provinceCode = "PE";
		}
		else if (province.equalsIgnoreCase("saskatchewan")) {
			provinceCode = "SK";
		}
		else if (province.equalsIgnoreCase("alberta")) {
			provinceCode = "AB"; 
		}
		else if (province.equalsIgnoreCase("newfoundland and labrador")) {
			provinceCode = "NL";
		}
		else if (province.equalsIgnoreCase("northwest territories")) {
			provinceCode = "NT";
		}
		else if (province.equalsIgnoreCase("yukon territories")) {
			provinceCode = "YT";
		}
		else if (province.equalsIgnoreCase("nunavut")) {
			provinceCode = "NU";
		}
		this.province = provinceCode;
	}
	
	/**
	 * @return String postalCode
	 */
	public String getPostalCode(){
		return postalCode;
	}
	
	/**
	 * @param String postalCode
	 */
	public void setPostalCode(String pC)throws InvalidInputException { 
		for (int i=0; i<=5; i=i+2) {
			if (!(Character.isLetter(pC.charAt(i)))){
				throw new InvalidInputException("Please enter valid postal code (A1A1A1)");
			}
		}
		for (int i=1; i<=5; i=i+2) {
			if (!(Character.isDigit(pC.charAt(i)))){
				throw new InvalidInputException("Please enter a valid postal code (A1A1A1)");
			}
		}
		this.postalCode = pC;
	}
	
	/**
	 * @return String phone
	 */
	public String getPhone(){
		return phone;
	}
	
	/**
	 * @param String phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	/**
	 * @return String birthDate
	 */
	public String getBirthDate(){
		return birthDate;
	}
	
	/**
	 * @param String birthDate
	 */
	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}
	
	

}
