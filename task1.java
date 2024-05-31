import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        byte points=0;
        byte choice;
        byte difficulty;
        byte tries;
        byte won=0;
        byte rounds=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Let's Play a Game and  check your Luck!");
        System.out.println("Rules:");
        System.out.println("Rule 1: If the Guess is correct you will get 10 points");
        System.out.println("Rule 2: For every wrong attempt you will get a negative point");
        do{
            rounds++;
            byte number= (byte)Math.round( Math.random()*100);
            System.out.println(" choose the difficulty:");
            System.out.println("1.Easy (10 Attempts)");
            System.out.println("2.Medium (7 Attempts)");
            System.out.println("3.Hard (4 Attempts)");
            System.out.println("4.Hardcore (2 Attempts)");
            difficulty =in.nextByte();
            if(difficulty==1) {tries=10;} else if (difficulty==2) {tries=7;} else if (difficulty==3) {tries=4;} else if (difficulty==4) {tries=2;} else{System.out.println("Invalid option!So system will set the diffculty");tries=7;System.out.println("Your difficulty has been set to Medium");};
            System.out.println("Guess the number between number 1-100 ?");
            for(int i=1;i<=tries;i++){
            byte Guess=in.nextByte();
            if(Guess==number){
                System.out.println("Your Guess is correct");
                System.out.println("You took  "+i+" tries to find the number");
                points+=10;
                won+=1;
                break;
            }
            else if(Guess<number){
                System.out.println("Oops! The Number you have Guessed is lower than the generated number");
                points-=1;
                continue;
            } else {
                System.out.println("Oops!  The Number you have Guessed is higher than the generated number");
                points-=1;
                continue;
            }
        }
        System.out.println("The generated number is "+number);
        System.out.println("Your acquired  points are:"+points);
        System.out.println("Choose one of the options:");
        System.out.println("1.to continue the game");
        System.out.println("2.To quit the game");
        choice=in.nextByte();
        }while(choice==1);
        System.out.println("You have quited the game");
        System.out.println("You have played "+rounds+" rounds");
        System.out.println("Total rounds won :"+won);
        System.out.println("Your total acquired points are: "+points);
    }
}