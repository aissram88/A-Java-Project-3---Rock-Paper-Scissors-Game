import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
//User input Rock Paper Scissors
//Random choice from opponent
//if Rock win against Scissors, Scissors win against Paper, Paper win against Rock
// Draw if user and opponent are the same


    public static void main(String args[]){
        

        //One dimentional array to store 3 values "Rock","Paper","Scissors"
        String [] RockPaperScissors = new String[3];

        RockPaperScissors[0]= "Rock";
        RockPaperScissors[1]= "Paper";
        RockPaperScissors[2]= "Scissors";
        
        //Message Who won the game.
        String msgWinnerisUser="You Won. The oppnent lose";
        String msgWinnerisOpponent="You lose. The Opponent won!";
        String msgDraw="It's draw. Play again!";
        
        //Declaration of userinput
        String userhand="";
        //Initialization of Scanner class
        Scanner sc  =new Scanner(System.in);
        

        while(userhand==""){
        //User input of Rock paper Scissors
        System.out.println("Rock ? Paper ? Scissors? Enter one :");
        userhand = sc.nextLine();
        //Random choice of RockPaperScissors list which will be the opponent hand
        Random r = new Random();
        int ran =r.nextInt(3);
        String opponenthand = RockPaperScissors[ran];     
        System.out.println(opponenthand);


        if(userhand.equals("Rock")){
            if(opponenthand==RockPaperScissors[1]){
                System.out.println(msgWinnerisOpponent);
                break;
            }else if(opponenthand==RockPaperScissors[2]){
                System.out.println(msgWinnerisUser);
                break;
            
            }else{
                System.out.println(msgDraw);
                userhand="";
            }
        }else if(userhand.equals("Paper")){
            if(opponenthand==RockPaperScissors[0]){
                System.out.println(msgWinnerisUser);
                break;
            }else if(opponenthand ==RockPaperScissors[2]){
                System.out.println(opponenthand);
                System.out.println(msgWinnerisOpponent);
                break;
            }else{
                System.out.println(msgDraw);
                userhand="";
            }
        }else if(userhand.equals("Scissors")){
            if(opponenthand==RockPaperScissors[0]){
                System.out.println(opponenthand);
                System.out.println(msgWinnerisOpponent);
                break;
            }else if(opponenthand==RockPaperScissors[1]){
                System.out.println(opponenthand);
                System.out.println(msgWinnerisUser);
                break;
            }else{
                System.out.println(msgDraw);
                userhand="";
            }
        }//end if  
        }//end while loop
    }//end main

}//end class
