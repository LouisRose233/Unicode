import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class chase
{
  public static Scanner sc = new Scanner(System.in);

  static boolean powerupachieved1 = false;   // new variables to keep track of the power up achieved/used
  static boolean powerupused1 = false; 


    public static void main(String[] args)
    {
    System.out.println("Hello and welcome to my game to escape you must correctly answer, 5 questions to escape. However beware of what may be following you, incorrectly answer questions after question and you may be caught and stuck forever! ");
   
    System.out.println("First let me know who I am dealing with, what is your name? ");
    String mainname = sc.nextLine();

    System.out.println("Hello " + mainname + " what is your second name? ");
    String mainsecond = sc.nextLine();

    System.out.println("Welcome " + mainname + " " +  mainsecond + " now let me introduce to you, who you are battling to escape ");

    System.out.println("Hello " + mainname + " welcome I would wish you luck however that won't save you so I'm not going to. I want you to remeber I will be one step behind you every time!!");

      boolean powerupachieved = false;
      boolean powerupused = false;


    System.out.println("Now before we begin, would you like the chance to gain a power up? ");
    String userInput;
    userInput = sc.nextLine();
    if(userInput.toLowerCase().contains("y"))
    {
      System.out.println("Perfect, the power up you will achieve is going to be a 50/50. This will allow you to take away 2 wrong answers of one question of your choice. ");
      System.out.println("Firstly you need to answer this question- Who was the Ancient Greek God of the Sun");
      System.out.println("Was it A- Apollo, B- Zeus, C- Ares or D- Artemis? ");
      userInput = sc.nextLine();
      // adding in the answer for the gaining the power up
      if((userInput.equals("A"))||(userInput.contains("Apollo")))
    {

      powerupachieved = true;   // updating it if the user get's the quetion right
      powerupachieved1 = true;

      System.out.println("Well done you have acheived the power up, to active it on any question make sure to say power up time. However you may only use it once so be wise when using it. ");
    }
    else
    {
      System.out.println("Sorry that is the wrong asnwer. You have lost your chance of getting a power up! ");
    }
 }
 else
 {
    System.out.println("Let's get onto the actual questions!!! ");
 }
    String quest = "";
// waiting for the user to type yes to move on, the user can also type it upper or lower case
    while(!quest.equalsIgnoreCase("Yes"))
    {
      System.out.print("Please enter Yes to move on!!! ");
      quest = sc.nextLine();
    }

    int score = 0;      // storing how many right answers
  
      ArrayList<Integer> questionLeft = new ArrayList<>();  // creating an array to hold my questions, so that once is asked it can't be repeated
      for(int x = 1; x <= 14; x++) {
        questionLeft.add(x);
      }              
    
    for (int i = 0; i < 14 && !questionLeft.isEmpty(); i++)
    {

      int index = (int)(Math.random()* questionLeft.size());  // to make sure it is still random and not in order
      int randomnumber = questionLeft.remove(index);    // this will remove the question from the array once it has been asked
      boolean correct =  printQuestion(randomnumber);   // allows the code to now if the user got the question right or wrong, linked to the array with the answers
      if(correct) {score++; 
      
        System.out.println("Correct Well done!! ");  // printing if the user escaped or not
      } else 
      {
        System.out.println("That is wrong unfortunately. :( ");
      }
      
      if(score >= 5) break;  // stops the code if the user get's 5 correct
    } 

    if (score >= 5)
    System.out.println("You Escaped well done and good luck on your next adventures!! ");
    else
    System.out.println("You failed to escape and will be stuck with the chaser forever now.. ");
}
    static boolean printQuestion(int randomnumber) {
      // the three """ make sure everything inside of it get's printed
      String question1 = """ 
          Which country has the highest life expectancy as of 2025?
          A. Monaco
          B. Italy
          C. USA
          D. Iceland
          """;
      String question2 = """
          What phone company produced the 3310?
          A. Apple
          B. Blackberry
          C. Nokia
          D. Samsung
          """;
      String question3 = """
          What is the largest Spanish speaking city in the world as of 2025?
          A. Mexico City
          B. Madrid
          C. Havana
          D. San Juan
          """;
       String question4 = """
           How many colors are used in the South African flag?
           A. 4
           B. 5
           C. 3
           D. 6
           """;
      String question5 = """
          How may bones do we have in an ear?
          A. 15
          B. 3
          C. 6
          D. 7
          """;
      String question6 = """
          What is the chemical element with the symbol Fe?
          A. Lead
          B. Silver
          C. Iron
          D. Copper
          """;
      String question7 = """
          Where is the strongest human muscle located?
          A. Jaw
          B. Arm
          C. Back
          D. Quad
          """;
      String question8 = """
          Who is the most followed person on instagram?
          A. Messi
          B. Selena Gomez
          C. Brian Cox
          D. Ronaldo
          """;
      String question9 = """
          In what year was the first Avatar movie released?
          A. 2009
          B. 2004
          C. 2010
          D. 2011
          """;
      String question10 = """
          Fill in the blank: The Statue Of Liberty was a gift from__
          A. France
          B. England
          C. Spain
          D. Germany
          """;
      String question11 = """
          Who was the only US President to serve more than two terms?
          A. Thomas Jefferson
          B. Abraham Lincoln
          C. Franklin D. Roosevelt
          D. Joe Biden
          """;
      String question12 = """
          In what state is Yosemite National park located?
          A. Nevada
          B. Utah
          C. Coloardo
          D. California
          """;
      String question13 = """
          In which country is Machu Picchu located?
          A. Peru
          B. Mexico
          C. Brazil
          D. Spain
          """;
      String question14 = """
          What is the tallest building in the world?
          A. Big Ben
          B. The Burj Khalifa
          C. Shanghai Tower
          D. Merdeka 118
          """;

          switch(randomnumber) {
            case 1 -> System.out.print(question1);
            case 2 -> System.out.print(question2);
            case 3 -> System.out.print(question3);
            case 4 -> System.out.print(question4);
            case 5 -> System.out.print(question5);
            case 6 -> System.out.print(question6);
            case 7 -> System.out.print(question7);
            case 8 -> System.out.print(question8);
            case 9 -> System.out.print(question9);
            case 10 -> System.out.print(question10);
            case 11 -> System.out.print(question11);
            case 12 -> System.out.print(question12);
            case 13 -> System.out.print(question13);
            case 14 -> System.out.print(question14);
          }
          char[] answers =
          {
            'A', 'C', 'A', 'D', 'B', 'C', 'A', 'D', 'A', 'A', 'C', 'D', 'A', 'B'    // All the correct answers listed in an array
          };

          System.out.print("Your answer is: ");
          String userAnswer = sc.nextLine();

          if(powerupachieved1 && !powerupused1 && userAnswer.equalsIgnoreCase("power up time"))  // checking if the user has earned the power up, they haven't used it and to make sure it doesn't matter the case they put power up time in 
          {
            powerupused1 = true;  // marking the power up as used so it can't be used again

            char correct = answers[randomnumber - 1];  // takes the correct answer out of the answers array so it can't be took away for the 50/50
                    
            ArrayList<Character> wrong = new ArrayList<>();   // creating an array with the 3 wrong answers and labelling them at wrong
            for (char c : new char[]{'A','B','C','D'})
              if (c != correct) wrong.add(c);

            wrong.remove(0);
            wrong.remove(0);  // removing 2 wrong answers from the array list, so there is only one wrong answer left

            System.out.println("Power up has been activited, the remaining options are:");
            for(char c : new char[]{'A', 'B', 'C', 'D'})
              if (c == correct || wrong.contains(c))   // displaying the 2 options which are left
                System.out.println(c);
          
          System.out.println("Your answer is: ");
          userAnswer = sc.nextLine();
          
          }
          while(!userAnswer.matches("[ABCD]")) 
          {
            System.out.println("Please enter A, B, C or D!! ");
            userAnswer = sc.nextLine();
          }
          char guess = userAnswer.charAt(0);     // looking at what the user has typed. 
          return guess == answers[randomnumber - 1];   // checking if the guess equals the answers stored in the array.




          }
    }


// need to create a power up
// need to get it so that when the user says power up time it takes away 2 wrong answers
// need to get it so the chaser is chasing you


