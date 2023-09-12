//
import java.util.Scanner;

public class PigLatin 
{

    public static void main (String[] args)
{
    
    //Declare string for userSentence and pigLatin
    String userSentence; 

    //Assigning variables
    char a = 'a';
    char e = 'e';
    char i = 'i';
    char o = 'o';
    char u = 'u';
    
 
    Scanner scan = new Scanner(System.in);
    //Ask user for input and save to userSentence variable
    System.out.print("Enter a sentence: ");
    userSentence = scan.nextLine();

    //Split the userSentence into an array
    String[] userWords = userSentence.split(" ");

    //This will go through the words and locate vowels
    for(int i = 0; i < userWords.length; i++) {

        //Change letters in userWords to lower case
        String temp = userWords[i].toLowerCase();
        char c = temp.charAt(0); 
        

            //If first character is equal to a vowel
            if(c == a || c == e || c == i || c == o || c == u) 
            {
                System.out.println(temp + "\t" + temp + "way");
                
            }

            else 
            {
                //print the ones that start with a consonant
                System.out.println(temp + "\t" + temp + "ay");
            }
    }
}
}
