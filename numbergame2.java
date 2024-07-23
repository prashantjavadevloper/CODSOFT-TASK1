//WRITE A PROGRAM TO MAKE A NUMBER GAME ACCORDING TO THE GIVEN CONDITIONS.
/* 1. Generate a random number within a specified range, such as 1 to 100.
    2. Prompt the user to enter their guess for the generated number.
    3. Compare the user's guess with the generated number and provide feedback 
       on whether the guess is correct, too high, or too low.
    4. Repeat steps 2 and 3 until the user guesses the correct number.
       You can incorporate additional details as follows:
    5. Limit the number of attempts the user has to guess the number.
    6. Add the option for multiple rounds, allowing the user to play again.
    7. Display the user's score, which can be based on the number of attempts 
       taken or rounds won.
*/
import java.util.Scanner; //IMPORT SCANNER CLASS
//MAKE A CLASS AND ASSIGN ITS NAME

class numbergame2
// OPENING OF CLASS
{
    //PUBLIC CLASS OF GETRANDN
    public static int getrandN(int min, int max)
    // OPENINGING OF GETRANDN BRACKET
    {
        return (int) (Math.random() * (max - min + 1) + min); //RETURN METHOD
    }// CLOSING OF GETRANDN BRACKET
    // EXECUTION START OF PROGRAM FROM THE MAIN METHOD
    public static void main(String arg[])
    // OPENING OF MAIN METHOD BRACKET
    {
        System.out.println("_____________________"); // DISPLAYING THE UNDERSCORE
        System.out.println("NUMBER GAME"); // DISPLAYING THE CODE NAME
        System.out.println("_____________________"); // DISPLAYING THE UNDERSORE
        System.out.println("NUMBER GAME RANGE IS BETWEEN 1 TO 100"); // DISPLAYING THE INSTRUCTION
        System.out.println("HEY YOU HAVE " + 5 + " CHANCES TO WIN"); // DISPLAYING THE INSTRUCTION
        int user_choice, finalscore = 0;  //INITIALIZE THE VARIABLE WITH DATATYPE
        Scanner sc = new Scanner(System.in); // CALL SYSTEM CLASS IN SCANNER
        System.out.println("1-> WANT TO PLAY GAME"); // MENU DRIVEN
        System.out.println("2-> EXIT"); // MENU DRIVEN
        System.out.print("ENTER CHOICE OF USER= "); // PRINT INSTRUCTION
        int ch = sc.nextInt(); // VALUE ASSIGN TO THE VARIABLE ch
        //SWITCH METHOD
        switch (ch)
        // OPENING OF SWITCH METHOD BRACKET
        {
            case 1: // OPENING OF CASE1
                boolean playagain = true;//INITIALIZE THE VARIABLE WITH DATATYPE
                //WHILE METHOD
                while (playagain) 
                //OPENING OF WHILE METHOD
                {
                    int Random_Number = getrandN(1, 100); //GENERATING RANDOM VALUE
                    boolean guess = false;//INITIALIZE THE VARIABLE WITH DATATYPE
                    // BEGNING OF 'FOR' LOOP
                    for (int i = 1; i <= 5; i++)
                    // OPEPNING OF 'FOR' LOOP BRACKET
                    {
                        System.out.println("Round" + i); // PRINT THE NUMBER OF ROUND
                        System.out.print("ENTER NUMBER OF YOUR CHOICE USER= ");// PRINT INSTRUCTION
                        user_choice = sc.nextInt(); // VALUE ASSIGN TO THE VARIABLE user_choice
                        // 'IF' CONDITION
                        if (user_choice == Random_Number)
                        // OPENING OF 'IF' CONDITION BRACKET
                        {
                            guess = true;
                            finalscore++; //SCORE ADDED
                            System.out.println("CONGRATULATION YOU WIN"); // PRINT INSTRUCTION
                            break; //TERMINATE THE LOOP
                        }
                        // 'ELSE IF' CONDITION 
                        else if (user_choice > Random_Number)
                        // OPENING OF 'ELSE IF' CONDITION BRACKET
                        {
                            System.out.println("USER CHOICED NUMBER IS LARGER.");// PRINT INSTRUCTION
                        } // CLOSING OF 'ELSE IF' CONDITION BRACKET
                        // 'ELSE' CONDITION
                        else 
                        // OPENING OF 'ELSE' CONDITION BRACKET
                        {
                            System.out.println("USER CHOICED NUMBER IS SMALLER.");// PRINT INSTRUCTION

                        }// CLOSING OF 'ELSE IF' CONDITION BRACKET
                        //'IF' CONDITION
                        if (guess = false) 
                        // OPENING OF 'IF' CONDITION BRACKET
                        {
                            System.out.println("YOU LOST YOUR CHANCE  NUMBER  IS" + Random_Number);
                        }// CLOSING OF 'ELSE IF' CONDITION BRACKET
                    }
                    System.out.print("WANT TO PLAY AGAIN(YES/NO)=");
                    String chAgain = sc.next();
                    playagain = chAgain.equalsIgnoreCase("YES");
                }// CLOSING OF 'FOR' LOOP BRACKET
                System.out.println("HOPE YOU ENJOY THIS GAME");//PRINT INSTRUCTION
                System.out.println("SCORE YOU GET=" + finalscore);//TOTAL SCORE
            case 2: // OPENING OF CASE2
                System.out.println("THANKU TO USING THE NUMBER GAME"); // PRINT WHILE USER ARE EXIT
                break; // TERMINATE THE CASE2
            default: // ASSIGN DEFAULT CASE
                System.out.println("INVALID CHOICE. PLEASE TRY AGAIN."); // PRINT WHILE USER INPUT WRONG CHOICE
        } // OPENING OF SWITCH METHOD BRACKET
    } // CLOSING OF MAIN METHOD BRACKET
} // CLOSING OF CLASS BRACKET