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
	 * @param <ArrayListContestantInformation>
	 * @param args
	 * @throws InvalidInputException 
	 */
	public static <ArrayListContestantInformation> void main(String[] args) throws InvalidInputException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to 'Name That Sound'!");
		String[] fNames = new String[50];
		String[] lNames = new String[50];
		String[] sAddresses = new String[50];
		String[] cities = new String[50];
		String[] provinces = new String[50];
		String[] pCodes = new String[50];
		String[] phones = new String[50];
		String[] bDates = new String[50];
		//ContestantInformation[] contestants = new ContestantInformation[50];
		
		for (int i = 0; i<=51; i++){
			
			ContestantInformation contestanti = new ContestantInformation();
			System.out.print("\n");
			System.out.println("Choose one of the following: ");
			System.out.println("1. Add Contestant" + "\n" + "2. Search Contestants" + "\n" + "3. Print labels" + "\n" + "4. Delete Contestants" + "\n" + "5. Clear All Contestants" + "\n" + "6. Save List" + "\n" +  "7. Load List" + "\n" +  "8. Quit" );
			int option = Integer.parseInt(input.nextLine());
			
		
		
			if (option==1){ //Add Contestant
				/*System.out.println("Please enter your first name.");
				String fN =input.nextLine();
				contestanti.setFirstName(fN);
				fNames[i] = (fN);
				System.out.println("Please enter your last name.");
				String lN=input.nextLine();
				contestanti.setLastName(lN);
				lNames[i] =(lN);
				System.out.println("Please ener your street address (## name)");
				String sA=input.nextLine();
				contestanti.setStreetAddress(sA);
				sAddresses[i] =(sA);
				System.out.println("Please enter your city.");
				String cT=input.nextLine();
				contestanti.setCity(cT);
				cities[i] =(cT);
				System.out.println("Please enter your province (e.g. Ontario, Alberta)");
				String pR =input.nextLine();
				contestanti.setProvince(pR);
				provinces[i] =(pR);
				System.out.println("Please enter your postal code. (e.g. A#A#A#)");
				String pC=input.nextLine();
				contestanti.setPostalCode(pC);
				pCodes[i] =(pC);
				System.out.println("Please enter your phone number. (e.g. ##########)");
				String pH=input.nextLine();
				contestanti.setPhone(pH);
				phones[i] =(pH);
				System.out.println("Please enter your birth date. (e.g. YYYY/MM/DD)");
				String bD=input.nextLine();
				contestanti.setBirthDate(bD);
				bDates[i] =(bD); */
				addContestant();
			}
		
			else if (option==2){ //Search contestants
				System.out.println("Please enter a last name:");
				String searchLast = input.nextLine();
				int index = Search.StringSearch(lNames, searchLast);
				System.out.println(index);
			}

			else if (option==3){ //Print labels
				Label label1 = new Label(contestanti);
				System.out.print(label1.toString());
			}
		
			else if (option==4){ //Delete Contestants
				System.out.println("Please enter the last name if the contestant.");
				String target = input.nextLine();
				int dLName = Search.StringSearch(lNames, target);
				
			
			}
			
			else if (option==5){ //Clear all Contestants
				
			}
			
			else if (option==6){ //Save list
				savefile(contestanti);
			}
			
			else if (option==7){ // Load list
				
			}

			else if (option==8){ //Quit program
				
			}
			
			else { //No sselection
				System.out.println("Please select one of the following");
			}
		}
		
		
		
		
	}
	
	public static void loadfile(ArrayList<ContestantInformation> contestanti) throws FileNotFoundException{
		BufferedReader fbr = new BufferedReader(new FileReader("saved.txt"));
	}
	
	public static void savefile(ArrayList<ContestantInformation> contestanti) throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream("saved.txt");
		for(int i=0;i<contestanti.size();i++){
			PrintStream fps = new PrintStream(fileOutputStream);
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
public static void addContestant(ArrayList<ContestantInformation>contestants){
	ContestantInformation contestant = new ContestantInformation();
	boolean flag = false;
	do{
		try{
			flag = false;
			System.out.print("Please enter your first name.");
			String fN = input.nextLine();
			contestant.setFirstName(fN);
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
			contestant.setLastName(lN);
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
			System.out.print("Please enter your street name.");
			String sA = input.nextLine();
			contestant.setStreetAddress(sA);
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
			contestant.setCity(cT);
		}
		catch (InvalidInputException cT){
			System.out.print(cT.getMessage());
			flag = true;
		}
	}
	while(flag);
			
	System.out.print("Please enter your province.");	
	String pR = input.nextLine();	
	contestant.setProvince(pR);
	
	do{
		try{
			flag = false;
			System.out.print("Please enter your postal code.");
			String pC = input.nextLine();
			contestant.setPostalCode(pC);
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
			System.out.print("Please enter your birth date.");
			String bD = input.nextLine();
			contestant.setBirthDate(bD);
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
			System.out.print("Please enter your phone number.");
			String pH = input.nextLine();
			contestant.setPhone(pH);
		}
		catch (InvalidInputException pH){
			System.out.print(pH.getMessage());
			flag = true;
		}
	}
	while(flag); 
	
	contestants.add(contestant);
}
		

}
