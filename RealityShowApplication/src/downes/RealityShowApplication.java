/**
 * 
 */
package downes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aden Downes
 * 
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
	 * @param <ArrayListContestantInformation>
	 * @param args
	 * @throws InvalidInputException 
	 * @throws IOException 
	 */
	public static <ArrayListContestantInformation> void main(String[] args) throws InvalidInputException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to 'Name That Sound'!");
		
		for (int i = 0; i<=51; i++){
			
			//ContestantInformation contestanti = new ContestantInformation();
			ArrayList<ContestantInformation> contestanti = new ArrayList<ContestantInformation>();
			System.out.print("\n");
			System.out.println("Choose one of the following: ");
			System.out.println("1. Add Contestant" + "\n" + "2. Search Contestants" + "\n" + "3. Print labels" + "\n" + "4. Delete Contestant" + "\n" + "5. Clear All Contestants" + "\n" + "6. Save List" + "\n" +  "7. Load List" + "\n" +  "8. Quit" );
			int option = Integer.parseInt(input.nextLine());
			
		
		
			if (option==1){ //Add Contestant
				addContestant(contestanti);
			}
		
			else if (option==2){ //Search contestants
				System.out.println("Please enter a last name:");
				String searchLast = input.nextLine();
				int index = Search.StringSearch(contestanti, searchLast);
				System.out.println(index);
			}

			else if (option==3){ //Print labels
				printContestant(contestanti);
				
			}
		
			else if (option==4){ //Delete Contestants
				System.out.println("Please enter the last name of the contestant.");
				String target = input.nextLine();//target location 
				int dLName = Search.StringSearch(contestanti, target);
				contestanti.remove(dLName);//removes info from this array spot
			
			}
			
			else if (option==5){ //Clear all Contestants
				contestanti.removeAll(contestanti);
			}
			
			else if (option==6){ //Save list
				savefile(contestanti);
			}
			
			else if (option==7){ // Load list
				loadfile(contestanti);
			}

			else if (option==8){ //Quit program
				System.exit(0);
			}
			
			else { //No sselection
				System.out.println("Please select one of the following");
			}
		}
		
		
		
		
	}
	
	public static void loadfile(ArrayList<ContestantInformation> contestanti) throws IOException{ //loads text from the txt file 
		BufferedReader fbr = new BufferedReader(new FileReader("saved.txt"));
		contestanti.removeAll(contestanti); //clears array before loading new text
			int size = Integer.parseInt(fbr.readLine());
			for (int i = 0; i<size; i++){
				String firstName = fbr.readLine();
				String lastName = fbr.readLine();
				String streetAddress = fbr.readLine();
				String city = fbr.readLine();
				String province = fbr.readLine();
				String postalCode = fbr.readLine();
				String birthDate = fbr.readLine();
				String phone = fbr.readLine();
				try {
					contestanti.add(new ContestantInformation(firstName, lastName, streetAddress, city, province, postalCode, birthDate, phone));
				} catch (InvalidInputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
	}
	
	public static void savefile(ArrayList<ContestantInformation> contestanti) throws IOException{ //saves text to the txt file
		FileOutputStream fileOutputStream = new FileOutputStream("saved.txt"); //allows saving to the selected file
		PrintStream fps = new PrintStream(fileOutputStream);
		fps.println(contestanti.size()); //shows contestant #
		for(int i = 0; i < contestanti.size(); i++){ 			
			fps.println(contestanti.get(i).getFirstName());
			fps.println(contestanti.get(i).getLastName());
			fps.println(contestanti.get(i).getStreetAddress());
			fps.println(contestanti.get(i).getCity());
			fps.println(contestanti.get(i).getProvince());
			fps.println(contestanti.get(i).getPostalCode());
			fps.println(contestanti.get(i).getPhone());
			fps.println(contestanti.get(i).getBirthDate());
		}
		fileOutputStream.close();
	}
	

/**
 * 
 * @param contestants
 */
public static void addContestant(/*ArrayList<ContestantInformation>contestants*/ ArrayList<ContestantInformation> contestanti){ //adding contestants to the program
	ContestantInformation contestant = new ContestantInformation(); 
	boolean flag = false;
	// Adds contestant information under each category
	do{
		try{
			flag = false;
			System.out.print("Please enter your first name."); 
			String fN = input.nextLine();
			contestant.setFirstName(fN);//sets first name 
		}
		catch (InvalidInputException fN){
			System.out.print(fN.getMessage());
			flag = true;
		}
	}
	while(flag);
	
	do{
		try{
			flag = false;
			System.out.print("Please enter your last name.");
			String lN = input.nextLine();
			contestant.setLastName(lN);//sets last name
		}
		catch (InvalidInputException lN){
			System.out.print(lN.getMessage());
			flag = true;
		}
	}
	while(flag);
	
	do{
		try{
			flag = false;
			System.out.print("Please ener your street address (## name)");
			String sA = input.nextLine();
			contestant.setStreetAddress(sA);//sets street address
		}
		catch (InvalidInputException sA){
			System.out.print(sA.getMessage());
			flag = true;
		}
	}
	while(flag);
			
	do{
		try{
			flag = false;
			System.out.print("Please enter your city.");
			String cT = input.nextLine();
			contestant.setCity(cT);//sets city
		}
		catch (InvalidInputException cT){
			System.out.print(cT.getMessage());
			flag = true;
		}
	}
	while(flag);
			
	System.out.print("Please enter your province (e.g. Ontario, Alberta)");	
	String pR = input.nextLine();	
	contestant.setProvince(pR);//sets province
	
	do{
		try{
			flag = false;
			System.out.print("Please enter your postal code. (e.g. A#A#A#)");
			String pC = input.nextLine();
			contestant.setPostalCode(pC);//sets postal code
		}
		catch (InvalidInputException pC){
			System.out.print(pC.getMessage());
			flag = true;
		}
	}
	while(flag);
	
	do{
		try{
			flag = false;
			System.out.print("Please enter your birth date. (e.g. YYYY/MM/DD)");
			String bD = input.nextLine();
			String year = bD.substring(0,3); //takes the year from the dates inputted
			int req = 1997; //required max birth year 
			if (Integer.parseInt(year) < req){
				contestant.setBirthDate(bD);//sets birth date
			}
			else {
				System.out.println("Sorry, what year were you born in?");
				String bD2 = input.nextLine();
				if (Integer.parseInt(year) < req){
					contestant.setBirthDate(bD2);//sets birth date
				}
				else { //if age is not right
					System.out.println("Sorry, you do not meet the age requirements...");
				}
			}
			
		}
		catch (InvalidInputException bD){
			System.out.print(bD.getMessage());
			flag = true; 
		}
	}
	while(flag);
	
	do{		
		try{
			flag = false;
			System.out.print("Please enter your phone number. (e.g. ##########)");
			String pH = input.nextLine();
			contestant.setPhone(pH);//sets phone 
		}
		catch (InvalidInputException pH){
			System.out.print(pH.getMessage());
			flag = true;
		}
	}
	while(flag); 
	
	return;
	
}
		


public static void printContestant(ArrayList<ContestantInformation>contestants){ //outputs to the console
	for (int i=0; i < contestants.size();i++){
		Label label1 = new Label(contestants.get(i)); //formatting by label
		System.out.println(label1.toString()); //prints the label
	}
}



}
