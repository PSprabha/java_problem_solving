package di_string;
import java.util.*;

public class UsingStack 
{
	
	static void diString()
	{
		String input = "IIIDIDDD";
		
		String res = "";
        Stack<Integer> stck = new Stack<>();

        for(int i = 0; i <= input.length(); i++)
        {
            stck.push(i+1);

            if(i == input.length() || input.charAt(i) == 'I')
            {
                while(!stck.isEmpty())
                {
                    res += stck.pop()+"";
                }
            }
        }

        System.out.println("using stack : " + res);
	}

	public static void main(String[] args) 
	{
		diString();
	}

}
