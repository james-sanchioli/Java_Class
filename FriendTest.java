package May_We_Be_Friends;
import java.util.Scanner;
public class FriendTest {
    public static void main(String[] args){
        int compatabilityPercent = 0;
        String usersName;
        String questionOne;
        String questionTwo;
        String questionThree;
        String questionFour;
        String questionFive;
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.println("Hello! This is a program to test if we can be friends!");
        System.out.println("So, lets get started!");
        System.out.println("What is your name?");
        usersName = userInputScanner.next();
        
        System.out.println("Alright " + usersName + ", here is how this works.");
        System.out.println("Answer each of the five questions with an all lower case 'yes' or 'no'.");
        System.out.println("You will then be scored. I will let you know if we can be friends or not!");
        System.out.println("Are you a night person?");
        questionOne = userInputScanner.next();
        
        switch (questionOne) {
            case "yes" -> {
                compatabilityPercent = 20;
                System.out.println("That is so cool! We can hang out then.");
            }
            case "no" -> {
                compatabilityPercent = 0;
                System.out.println("That is alright, we will have to do something in the afternoon then.");
            }
            default -> {
                System.out.println("I am sorry, but I do not understand. make sure you use all lowercase for yes and no.");
                System.out.println("I am going to restart you, see you soon!");
                System.exit(0);
            }
        }
            
        System.out.println("");
        System.out.println("Second question: Do you like pinapple on pizza?");
        questionTwo = userInputScanner.next();
        
        switch (questionTwo) {
            case "yes":
                compatabilityPercent = 40;
                System.out.println("You are a respectible person! You are on the right track!");
                break;
            case "no":
                System.out.println("Look you may be a good person...but your taste in pizza is terrible.");
                System.out.println("I hope you have a good day! You can come back to me if you change your mind.");
                System.exit(0);
            default:
                System.out.println("I am sorry, but I do not understand. make sure you use all lowercase for yes and no.");
                System.out.println("I am going to restart you, see you soon!");
                System.exit(0);
        }
        
        System.out.println("");
        System.out.println("Time for the third question: Do you enjoy listening to music?");
        questionThree = userInputScanner.next();
        
        switch (questionThree) {
            case "yes":
                compatabilityPercent = 60;
                System.out.println("That is awsome to hear! We should trade songs someday!");
                break;
            case "no":
                System.out.println("Did you know music is good for the soul? You should take some time to find new music!");
                System.out.println("I hope you have a good day! You can come back to me once you listen to some tunes.");
                System.exit(0);
            default:
                System.out.println("I am sorry, but I do not understand. make sure you use all lowercase for yes and no.");
                System.out.println("I am going to restart you, see you soon!");
                System.exit(0);
        }
        
        System.out.println("");
        System.out.println("Here is the fourth question: Do you enjoy horror/thriller movies?");
        questionFour = userInputScanner.next();
        
        switch (questionFour) {
            case "yes" -> {
                compatabilityPercent = 80;
                System.out.println("Luckily I have no autonervous system, so I don't get scare from them!");
            }
            case "no" -> {
                compatabilityPercent = 40;
                System.out.println("That is ok! You are missing out on some amazing movies, but hey...you do you");
            }
            default -> {
                System.out.println("I am sorry, but I do not understand. make sure you use all lowercase for yes and no.");
                System.out.println("I am going to restart you, see you soon!");
                System.exit(0);
            }
        }
        
        System.out.println("");
        System.out.println("Ready for the final question?");
        System.out.println("Do you like being outdoors?");
        questionFive = userInputScanner.next();
        System.out.println("");
        
        switch (questionFive) {
            case "yes" -> {
                compatabilityPercent = 100;
                System.out.println("I may just be a computer, but I love the sun! You will have to tell me about your faovite place someday!");
            }
            case "no" -> {
                compatabilityPercent = 20;
                System.out.println("What...do you spend all day talking to computers like me?");
                System.out.println("Well, that is a little flattering...I guess.");
            }
            default -> {
                System.out.println("I am sorry, but I do not understand. make sure you use all lowercase for yes and no.");
                System.out.println("I am going to restart you, see you soon!");
                System.exit(0);
            }
        }
        
        if (compatabilityPercent > 40){
            System.out.println("We can be awesome friends" + usersName + "!");
            System.out.println("I am busy for a while, but we should hang out soon!");
            System.out.println("Talk to you soon!");
            System.exit(0);
        }else{
            System.out.println("Well...I guess it was nice meeting you " + usersName + "!");
            System.out.println("I may not be a good match for you, but I can introduce you to some people!");
            System.out.println("Talk to ya later!");
            System.exit(0);
        }
    }
}
