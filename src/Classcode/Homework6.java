package Classcode;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Homework6");

        String sentence3 = "bye now";
        String[] sen3Split = sentence3.toUpperCase().split(" ");
        String abbreviation = "";
        for(int i = 0; i < sen3Split.length; i++){
            abbreviation += sen3Split[i].charAt(0);
        }
        System.out.println(abbreviation);



       String givenSentence = "make AMERICA GreAT AgAIn";
        String[] senSplit = givenSentence.toUpperCase().split("");
        String changeSen = "";
        for(int i = 0; i < senSplit.length; i++){
            changeSen += senSplit[i].charAt(0);
        }
        System.out.println(changeSen);



        String orgString = "living standard";
        String newString = "";
        for (int i=0 ; i <= orgString.length() ; i++) {

            newString += orgString.length();
        }
        System.out.println("original String : " + orgString);
        System.out.println("reverse String : " + newString);

    }
}
