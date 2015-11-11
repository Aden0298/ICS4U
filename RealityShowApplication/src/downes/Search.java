/**
 * 
 */
package downes;

import java.util.ArrayList;

/**
 * @author Aden Downes
 *
 */
public class Search {
	
	/**
	 * 
	 */
	public Search() {
		// TODO Auto-generated constructor stub
	}

	public static int Linear(int[] things, int target){
		int index = 0;
		
		for (int i=0; i <= things.length - 1;){
			if (things[i] == target){
				return i;
			}
			else {
				return(-1);
			}
		}
		return index;
		
	}	
	
	public static int BinarySearch (int[] things, int target){
		
		int i;
		int begIndex = 0;
		int endIndex = things.length - 1;
		int midIndex = (begIndex + endIndex) / 2;
		do {
			midIndex = (begIndex + endIndex) / 2;
			if (target > things[midIndex]) {
				begIndex = midIndex + 1;
			}
			else if (target < things[midIndex]) {
				endIndex = midIndex - 1; 
			}
			else if (target == things[midIndex]){
				i = midIndex;
				return i;
			}
		} while (endIndex > begIndex);
		return -1;
		
	}
	
	/*public int binarySearch(ArrayList<String> aL, String target){
		return binarySearch(aL, target, aL.size()-1);
	}
	private int binarySearch(ArrayList<String> aL, String target, int begin, int end){
		if(begin>end){
			return -1;
		}
		int mid = (begin+end)/2;
		if(aL.get(mid).compareTo(target)==0){
			return mid;
		}
		else if(aL.get(mid).compareTo(target) < 0){
			return binarySearch(aL,target,begin,mid-1);
		}
	}*/
	
	
	public static int StringSearch (ArrayList<ContestantInformation> contestanti, String target){
		
		int i;
		int begIndex = 0;
		int endIndex = contestanti.size();
		int midIndex = (begIndex + endIndex) / 2;
		do {
			midIndex = (begIndex + endIndex) / 2;
			if (target.compareTo(contestanti.get(midIndex).getLastName()) > 0 ) {
				begIndex = midIndex + 1;
			}
			else if (target.compareTo(contestanti.get(midIndex).getLastName()) < 0) {
				endIndex = midIndex - 1; 
			}
			else if (target.compareTo(contestanti.get(midIndex).getLastName()) == 0){
				i = midIndex;
				return i;
			}
		} while (endIndex > begIndex);
		return -1;
		
	}
}
	
	