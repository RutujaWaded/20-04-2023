package Lab;

public class String1Program {

	public static void main(String[] args) {
		
		String strng = "Welcome to Java World";
		System.out.println("String : " + strng);
		
		System.out.println();
		
		//returning character at 5th position
		char pos = strng.charAt(4);
		System.out.println("Character at fifth position : " + pos );
		
		System.out.println();
		
		//compare strng  with "Welcome" 
		
		int comp = strng.compareToIgnoreCase("Welcome");
		System.out.println("Lexicographically Compared Strings are   : " + comp);
		
		System.out.println();
		
		// concatenate "let us learn"
		String concat1 = strng.concat(" Let us learn");
		System.out.println(concat1);
		
		System.out.println();
		
		// return position of first occurence of character 'a'
		int pos2 = strng.indexOf('a');
	  System.out.println("Position of first occurence of character 'a' is : " + pos2);
	    
	    System.out.println();
		
		//Replace all occurences of 'a' character with new 'e' 
	    String newstr = strng.replaceAll("a", "e");
	    System.out.println("Replaced string :" + newstr );
	    
	    System.out.println();
	    
	    // return string between 4th and 10th position 
	    
	    String substr = strng.substring(3, 11);
	    System.out.println("String between 4th and 10th position is : " + substr);
	    
	    System.out.println();
	    
	    // lowercase of str
	    String lower = strng.toLowerCase();
	    System.out.println("String in lowercase : " + lower);
	    
	    System.out.println();
		

	}

}
