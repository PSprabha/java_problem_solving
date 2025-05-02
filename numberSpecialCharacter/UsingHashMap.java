package numberSpecialCharacter;

import java.util.*;

public class UsingHashMap {

	public static int numberOfSpecialChars(String s) 
    {        
        int res = 0;
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char c : ch)
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : ch)
        {
            char cc = (char)(c + 32);
            if(map.containsKey(c) && (map.containsKey(cc) || map.containsKey((char)(c-32))))
            {
                if(c >= 'a' && c <= 'z')
                {
                    map.put(c, map.get(c)-1);
                }
                else
                {
                    if(map.get(cc) == 0)
                        res++;
                    
                    map.remove(c);
                    map.remove(cc);
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args)
	{
		System.out.println(numberOfSpecialChars("aAbBcCa"));
	}

}
