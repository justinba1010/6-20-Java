import java.util.*;
public class Outside {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many days did you go to school?");
        int x = keyboard.nextInt();
        if(x>5){
            System.out.println("Are you in high school? Answer 1 for yes, 0 for no.");
            int y = keyboard.nextInt();
            if(y==1){
                System.out.println("Good. Work harder!");
            }
            else if(y==0){
                System.out.println("You're too young to be working hard!");
            }else{
                System.out.println("I said answer 1 for yes, 0 for no!");
            }
    }else{
        System.out.println("Are you in elementary school? Answer 1 for yes, 0 for no.");
        int z = keyboard.nextInt();
        if(z==1){
            System.out.println("That explains it. Get ready to work harder!");
        }
        else if(z==0){
            System.out.println("Then why didn't you go to school?");
        }else{
            System.out.println("I said answer 1 for yes, 0 for no!");
        }
    }
}
}
