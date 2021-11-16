package Classcode;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Homework4");

        String country = "Spain";
        System.out.println("Country -> " + country);

        String[] splitBy_letter = country.split("");
        int countryLength = splitBy_letter.length;

        System.out.println("The length of '" + country + "' = " + countryLength);

        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String[] numOfWords = sentence2.split(" ");
        int sentenceValue = numOfWords.length;
        System.out.println("\nThe number of words in '" + sentence2 + "' = " + sentenceValue);

        String sentence3 = "make America great again";
        String sentence3ToU = sentence3.toUpperCase();

        String myString_0To1 = sentence3ToU.substring(0,1);
        String myString_5To6 = sentence3ToU.substring(5,6);
        String myString_13T14 = sentence3ToU.substring(13,14);
        String myString_19To20 = sentence3ToU.substring(19,20);
        System.out.println("\nThe abbreviation of '" + sentence3 + "' -> " + myString_0To1 + myString_5To6 + myString_13T14 + myString_19To20);


    }
}
