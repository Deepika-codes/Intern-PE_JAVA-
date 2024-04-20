import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play ="yes";
        
while(play.equals("yes")){
Random r =new Random();
int num =r.nextInt(100);
int guess= -1;
int tries= 0;

while(guess != num){
    System.out.println("Guess a number between 1 to 100");
    guess =  sc.nextInt();
    tries ++ ;
    if (guess== num) {
        System.out.println("Congratulation you won!!");
        System.out.println("Your Attempts were "+tries);
        System.out.println("would u like to play again");
        play=sc.next().toLowerCase();
    }
    else if (guess>num) {
        System.out.println( "Your guess is too high!");
    }
    else{
        System.out.println( "Your guess is too low!" );
    }
    }
}
}
}
