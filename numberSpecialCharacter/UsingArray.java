package numberSpecialCharacter;

public class UsingArray 
{
	
	public static int numberOfSpecialChars(String s) 
    {
		int[] indices = new int[124];
	    int res = 0;
			    
	    for(char i = 'a'; i <= 'z'; i++)
	        indices[i] = s.lastIndexOf(i)+1;
	    
	    
	    for(char i = 'A'; i <= 'Z'; i++)
	        indices[i] = s.indexOf(i)+1;
	    
	    for(int i = 65; i < 91; i++)	    
	        if(indices[i] > indices[i+32] && indices[i] > 0 && indices[i+32] > 0)	        
	            res++;	        
	    
	    return res;
    }

	public static void main(String[] args)
	{
		System.out.println(numberOfSpecialChars("aabABcC"));
	}

}
