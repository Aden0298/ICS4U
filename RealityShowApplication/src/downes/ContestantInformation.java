package downes;

/**
 * 
 * ContestantInformation contains methods which gather
 * the information of contestants in a competition.
 * @author Aden Downes
 *
 */
public class ContestantInformation {
		
	private String firstName, lastName, streetAddress, city, province, postalCode, phone, birthDate;
			
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
	 */
	public ContestantInformation(String fN, String  lN, String sA, String cT, String pR, String pC, String pH, String bD) {
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
	public void setProvince(String province){
		this.province = province;
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
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
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
