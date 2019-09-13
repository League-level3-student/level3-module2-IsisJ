package _01_Searching_Algorithms;

public class _02_InterpolationSearch {
	
	public static int interpolationSearch(int[] array, int value)
    {
        
      int start = 0;
      int end = array.length-1;
        
      while(start<=end && value>= array[start] && value <= array[end]) {
			//4. create an integer called position
        	//  initialize it to the following:
        	//  start + (((end - start) / (array[end] - array[start])) * (value - array[start]));
        	//  This calculates the center of the array keeping the even distribution in mind.
    	  	int position = start + (((end-start)/(array[end] - array[start]))*(value - array[start]));
            
    	  	if( array[position] == value) {
    	  		return position;
    	  	}
           
            if( array[position] < value) {
            	start = position+1;
            }
            else{
            	end = position-1;
            }
          
      }	  
        return -1;
    }
}
