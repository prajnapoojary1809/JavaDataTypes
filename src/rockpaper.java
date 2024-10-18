import java.util.Random;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Random rand= new Random();

        String[] choice={"rock","paper","scissors"};

        int userScore=0;
        int compScore=0;
        int i=0;
//        int num=sc.nextInt();

        while(i<4)
        {
            int random = (int)Math.floor(Math.random()*3);
            String compChoice= choice[random];

            System.out.println("enter your choice");
            String userChoice=sc.nextLine();

            if(compChoice.equals((userChoice))) {
                System.out.println("Draw");
            } else if ((compChoice.equals("rock") && userChoice.equals("paper")) || (compChoice.equals("paper") && userChoice.equals("scissors")) || (compChoice.equals("scissors") && userChoice.equals("rock")))
            {
                System.out.println("User Won");
                userScore++;
            } else if ((userChoice.equals("rock") && compChoice.equals("paper")) || (userChoice.equals("paper") && compChoice.equals("scissors") || userChoice.equals("scissors") && compChoice.equals("rock")) )  {
                System.out.println("Computer Won");
                compScore++;
            } else {//
                // System.out.println(compChoice+ "==" +userChoice);//                System.out.println("Please enter the correct choice");//                System.out.println("Try again");

        }i++;
    }
        if(userScore>compScore)
            System.out.println("user Won:"+userScore);
        else if(compScore>userScore)
            System.out.println("computer won:"+compScore);
        else
            System.out.println("its a tie");
    }
}
