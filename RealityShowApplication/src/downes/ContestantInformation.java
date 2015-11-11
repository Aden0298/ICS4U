package downes;

/**
 * 
 * ContestantInformation contains methods which gather
 * the information of contestants in a competition.
 * @author Aden Downes
 *
 */
@SuppressWarnings("rawtypes")
public class ContestantInformation implements Comparable {
		
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
	 * @throws InvalidInputException 
	 */
	public void setFirstName(String firstName) throws InvalidInputException {
		if(firstName.length() == 0){
			throw new InvalidInputException("You cannot leave your first name empty.");
		}
		for(int i = 0; i < firstName.length(); i ++){
			if (Character.isDigit(firstName.charAt(i)))
				throw new InvalidInputException("You cannot have a number in your name.");
			}
		this.firstName = firstName;
	}
		/*this.firstName = firstName;
	}*/
	
	/**
	 * @return String lastName
	 */
	public String getLastName(){
		return lastName;
	}
	
	/**
	 * @param String lastName
	 * @throws InvalidInputException 
	 */
	public void setLastName(String lastName) throws InvalidInputException{
		if(lastName.length() == 0){ //if field is empty
			throw new InvalidInputException("You cannot leave your last name empty.");
		}
		for(int i = 0; i < lastName.length(); i ++){
			if (Character.isDigit(lastName.charAt(i))){ //checks that only letters are inputted
				throw new InvalidInputException("You cannot have a number in your name.");
			}
		}
		this.lastName = lastName;
	}
		/*this.lastName = lastName;
	}*/
	
	/**
	 * @return String streetAddress
	 */
	public String getStreetAddress(){
		return streetAddress;
	}
	
	/**
	 * @param String streetAddress
	 * @throws InvalidInputException 
	 */
	public void setStreetAddress(String streetAddress) throws InvalidInputException{
		if(streetAddress.length() == 0){ //if field is empty
			throw new InvalidInputException("You can not leave your address empty.");
		}
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
	 * @throws InvalidInputException 
	 */
	public void setCity(String city) throws InvalidInputException{
		if(city.length() == 0){//if field is empty
			throw new InvalidInputException("You can not leave your city empty.");
		}
		for(int i = 0; i < city.length(); i++){ //checks that only letters are inputted
			if (Character.isDigit(city.charAt(i))){
				throw new InvalidInputException("City's names do not contain numbers.");
			}
		}
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
	public void setProvince(String province){ //formats the inputted province
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
	 * @throws InvalidInputException 
	 */
	public void setPhone(String phone) throws InvalidInputException{
		if(phone.length() == 0){ //if field is empty
			throw new InvalidInputException("You can not leave your phone number empty.");
		}
		for (int i=0; i<phone.length(); i++) {
			if (Character.isLetter(phone.charAt(i))){
				throw new InvalidInputException("Please enter a valid phone number.");
			}
		}
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
	 * @throws InvalidInputException 
	 */
	public void setBirthDate(String birthDate) throws InvalidInputException{
		if(birthDate.length() == 0){ //if field is empty
			throw new InvalidInputException("You can not leave your birth date empty.");
		}
		this.birthDate = birthDate;
	}

	public int compareTo(Object args){
		ContestantInformation ci = (ContestantInformation)args;
		return 0; 
	}
	
}
