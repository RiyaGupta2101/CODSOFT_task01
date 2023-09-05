package objectandclass;
import java.util.Random;
import java.util.Scanner;


public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
        int random=   rd.nextInt(101);
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number");
        
        int input ;
        do {
        	input=sc.nextInt();
        	if(input>random) {
        		System.out.println("Too high");
        	}
        	else if(input<random) {
        		System.out.println("Too low");
        	}
        	else {
        		System.out.println("Correct !");
        	}
        }while(input!=random);
	}

}
