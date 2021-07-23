
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class reverse_string
{
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            new Reverse();
            System.out.println(Reverse.reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
        List<Character> list = new ArrayList<Character>();
 
        
        for (char c: str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
                StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }
 
        return builder.toString();
    }
}