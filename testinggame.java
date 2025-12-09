// I have made this class to test my game 


public class testinggame
{
  public static void main(String[] args)
  {
      Question question = new Question 
      (
        "What is the capital of England?",  // creating an object for testing
        "London"); // answer to the question 

          if(question.isCorrect("London"))  // test 1 to see if London the correct answer is accepted
  {
      System.out.println("Pass: The correct answer was accepted.");  // this will be printed if the code works how it should
  }
  else {
    System.out.println("Fail: The incorrect answer was rejected.");  // this will be printed if the correct answer was rejected due to an error
  }
      if(!question.isCorrect("Tokyo"))  // test 2 to see if an incorrect answer will be accepted or rejected
      {
        System.out.println("Pass: The incorrect answer was rejected.");  // this answer will be printed if the incorrect answer is rejected
      }
    else {
      System.out.println("Fail: The incorrect answer was accepted."); // this will be printed if the incorrect answer is accepted which will be an error
    }
  }
}
