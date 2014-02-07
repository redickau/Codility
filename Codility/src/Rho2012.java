import java.util.*;

public class Rho2012 {
	 Set<Integer> result = new TreeSet<Integer>();
	    
	    public int[] solution(int A) {
	        int destination = A;
	        int lgstDiv = getLargestDivisor(A);
	        
	        result.add(destination);
	        result.add(1);
	        
	        while (lgstDiv != -1) {         
	            if (destination == lgstDiv) {
	                result.add(destination);
	                destination = lgstDiv - 1;
	                lgstDiv = getLargestDivisor(destination);
	            }
	            
	            buildEndSequence(lgstDiv, destination);
	            destination = lgstDiv;
	            lgstDiv = getLargestDivisor(lgstDiv);
	        }
	        
	        int[] arr = new int[result.size()];
	        int index = 0;
	        for( Integer i : result ) {
	            arr[index++] = i;
	        }
	        
	        //System.out.println(result);
	        return arr;
	    }
	    
	    private int getLargestDivisor(int num) {
	        if (num > 1) {
	            if (num % 2 == 0)
	                return num / 2;
	            else {
	                double sqrt = Math.sqrt((double)num);
	                for (int i = 3; i <= sqrt; i = i + 2) {
	                    if (num % i == 0)
	                        return num / i;
	                }
	                
	                return num;
	            }
	        }
	        
	        return -1;
	    }
	    
	    private Set<Integer> buildEndSequence(int lgDiv, int destination) {
	        int increment = lgDiv;
	        int prevDiv = lgDiv;
	        while (lgDiv <= destination) {
	            result.add(lgDiv);
	            prevDiv = lgDiv;
	            lgDiv += lgDiv;
	        }
	        
	        if (prevDiv < destination)
	            result.add(prevDiv + increment);
	        
	        return result;
	    }
}
