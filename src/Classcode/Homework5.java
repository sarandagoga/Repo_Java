package Classcode;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Homework5");

        int num = 45;
        if (num%5 ==0) {
            System.out.println( num + " is divisible by 5");
        }  else if (num%3 ==0) {
            System.out.println( num + " is divisible by 3");
        }  else if (num%5 == 0 || num%3 == 0) {
            System.out.println( num + " is divisible by 5 and 3");
        }  else {

            System.out.println(num);
        }




         double myScore = 180;
          int maxScore = 200;
        myScore=(myScore/maxScore*100);
          if(myScore <= 100 && myScore>= 91){
              System.out.println("Grade: A");
          }
          else if (myScore <= 90.99 && myScore>= 81){
              System.out.println("Grade: B");
          }
          else if (myScore <= 80.99 && myScore>= 71){
              System.out.println("Grade: C");
          }
          else if (myScore <= 70.00 && myScore>= 61){
              System.out.println("Grade: D");
          }
          else if (myScore <61){
              System.out.println("Grade: E");
          } else {
              System.out.println("Invalid student score entered");
          }


          }

    }


