package di_string;

public class WithouStack 
{
	static void diString()
	{
		String input = "IIIDIDDD";
        String res = "";
        int prev = 0;

        for(int i = 0; i <= input.length(); i++)
        {
            if(i == input.length() || input.charAt(i) == 'I')
            {
                int crnt = i+1;

                while(crnt > prev)
                {
                    res += (crnt--) + "";
                }
                prev = i+1;
            }
        }

        System.out.println("without using stack : " + res);
	}

	public static void main(String[] args) 
	{
		diString();
	}

}
