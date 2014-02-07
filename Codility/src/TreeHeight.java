public class TreeHeight {
	
	    public int solution(Tree T) {
	        // write your code in Java SE 6
	        return recurStack(T) - 1;
	    }
	    
	    public int recurStack(Tree T){
	        if (T == null) return 0;
	        int leftSide = recurStack(T.l);
	        int rightSide = recurStack(T.r);
	        if (leftSide > rightSide){
	            return leftSide + 1;
	        }
	        else{
	            return rightSide + 1;
	        }
	    }
	}
