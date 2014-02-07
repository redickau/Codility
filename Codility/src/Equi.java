
public class Equi {

	    public int solution(int[] A) {
	        // write your code in Java SE 6
	        if (A.length == 0) return -1;
	        if (A.length == 1) return 0;
	        double sum = 0;
	        for (int i = 0; i < A.length; i++){
	            sum += A[i];
	        }
	        
	        int returnVar = -1;
	        double curCount = 0;
	        
	        if (sum - A[0] == 0) return 0;
	        sum = sum - A[0];
	        for (int i = 1; i < A.length && sum != curCount; i++){
	            curCount += A[i-1];
	            sum = sum - A[i];
	            
	            if (curCount == sum){
	                returnVar = i;
	            }
	        }
	        
	        return returnVar;
	    }
	}
