/**
 * 
 */
package downes;

import java.util.Arrays;

/**
 * @author 342643103
 *
 */
public class Sort {

	/**
	 * 
	 */
	public Sort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[] {4,6,2,8,16,10,14,12};
		System.out.println(Arrays.toString(selectionSort(list)));
		
	}
	
	public static int[] selectionSort ( int[] list){
		 int i, x, first, temp;  
	     for ( i = list.length - 1; i > 0; i --)  
	     {
	          first = 0;   
	          for(x = 1; x <= i; x ++)  
	          {
	               if( list[x] > list[first] )         
	                 first = x;
	          }
	          temp = list[first];  
	          list[first] = list[i];
	          list[i] = temp; 
	      } 
	     return list;
	}
	
	public static void insertionSort (int[] list){
		 int j;                     
	     int key;               
	     int i;  

	     for (j = 1; j < list.length; j++)    
	    {
	           key = list[ j ];
	           for(i = j - 1; (i >= 0) && (list[ i ] < key); i--)  
	          {
	        	   list[ i+1 ] = list[ i ];
	          }
	           list[ i+1 ] = key;    
	     }
	}
	
	public static void bubbleSort (int[] list){
		 int j;
	     boolean flag = true;   
	     int temp;   

	     while ( flag )
	     {
	            flag= false;   
	            for( j=0;  j < list.length -1;  j++ )
	            {
	                   if ( list[ j ] < list[j+1] )  
	                   {
	                           temp = list[ j ];              
	                           list[ j ] = list[ j+1 ];
	                           list[ j+1 ] = temp;
	                          flag = true;                
	                  } 
	            } 
	      } 
	}
	
	public static void quickSort (int[] list){
		
	}
	
	public static void mergeSort (int[] list){
		
	}

	
	}

