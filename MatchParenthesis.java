package day1;

/* Match the Parenthesis
Write a function in your preferred programming language 
that takes as input a sentence containing nested parentheses
and the position of an opening parenthesis. 
The function should find the corresponding closing parenthesis 
and return its position.
For example, if the input sentence is:
Sometimes (when I nest my parenthesis (also called parenthetical) too many times (like this (and this))) they get quite confusing.
And the position of the opening parenthesis is 10, 
the function should return 104, which is the position of the corresponding closing parenthesis.
*/


public class MatchParenthesis {
    public static void main(String[] args) {
        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int op = 10;
        int c=0;
        for(int i=op;i<sentence.length();i++)
        {
        	if(sentence.charAt(i)=='(')
        	{
//        		System.out.println(i);
        		c++;
        	}
        	if(sentence.charAt(i)==')')
        	{
        		c--;
        	}
        	
        	if(c==0)
        	{
        		System.out.println("The corresponding closing parenthesis for " + op+" is : "+i);
        		break;
        	}
        }

       
    }
}