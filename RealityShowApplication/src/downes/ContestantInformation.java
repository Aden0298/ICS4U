package downes;

/**
 * 
 * ContestantInformation contains methods which gather
 * the information of contestants in a competition.
 * @author Aden Downes
 *
 */
public class ContestantInformation {
		
	public String firstName, lastName, streetAddress, city, postalCode, phone, birthDate;
	Provinces province;
			
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
	 * @param Provinces pR
	 * @param String pC
	 * @param String pH
	 * @param String bD
	 * @throws InvalidInputException 
	 */
	public ContestantInformation(String fN, String  lN, String sA, String cT, String provicnceCode, String pC, String pH, String bD) throws InvalidInputException {
		setFirstName(fN);
		setLastName(lN);
		setStreetAddress(sA);
		setCity(cT);
		setProvince(province);
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
	public Provinces getProvince(){
		return province;
	}
	
	/**
	 * @param Provinces province
	 */
	Provinces provinceCode;
	public void setProvince(String provinceC){
		if (province.equals("Ontario") || province.equals("ontario")) {
			provinceCode = Provinces.ON;
		}
		else if (province.equals("Quebec")||province.equals("quebec")) {
			provinceCode = Provinces.QC;
		}
		else if (province.equals("Nova Scotia")||province.equals("nova scotia")||province.equals("Nova scotia")) {
			provinceCode = Provinces.NS;
		}
		else if (province.equals("New Brunswick")||province.equals("new brunswick")||province.equals("New brunswick")) {
			provinceCode = Provinces.NB;
		}
		else if (province.equals("Manitoba")||province.equals("manitoba")) {
			provinceCode = Provinces.MB;
		}
		else if (province.equals("British Colombia")||province.equals("british colombia")||province.equals("British colombia")) {
			provinceCode = Provinces.BC;
		}
		else if (province.equals("Prince Edward")||province.equals("prince edward")||province.equals("Prince edward")) {
			provinceCode = Provinces.PE;
		}
		else if (province.equals("Saskatchewan")||province.equals("saskatchewan")) {
			provinceCode = Provinces.SK;
		}
		else if (province.equals("Alberta")||province.equals("alberta")) {
			provinceCode = Provinces.AB; 
		}
		else if (province.equals("Newfoundland and Labrador")||province.equals("newfoundland and labrador")) {
			provinceCode = Provinces.NL;
		}
		else if (province.equals("Northwest Territories")||province.equals("northwest territories")||province.equals("NWT")) {
			provinceCode = Provinces.NT;
		}
		else if (province.equals("Yukon Territories")||province.equals("yukon territories")||province.equals("Yukon")) {
			provinceCode = Provinces.YT;
		}
		else if (province.equals("Nunavut")||province.equals("nunavut")) {
			provinceCode = Provinces.NU;
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
