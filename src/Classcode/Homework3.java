package Classcode;
public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Homework3");

        String sentence1 = "Hello dear, how are you doing?";
        int result1 = 30;
        int sentence1Length = result1>10?100:150;
        System.out.println("\nResult1 = " + sentence1Length);


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String sentence2Replace_a_Z = sentence2.replace("a", "Z");
        System.out.println("\nAfter replace -> " + sentence2Replace_a_Z);
        System.out.println("Original sentence -> " + sentence2);

        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        int stringLength = sentence3.length();
        System.out.println("\nThe length of '" + sentence3 + "' is " + stringLength);

        String checkFor = "health";
        String sentence3_UpperCase = sentence3.toUpperCase();
        checkFor = checkFor.toUpperCase();
        boolean itContains = sentence3_UpperCase.contains(checkFor);
        System.out.println("\nDoes '" + sentence3 + "' starts with " + checkFor + "' (ignoring cases)? : " + itContains );

        String checkFor1 = "Body";
        String sentence3_LowerCase = sentence3.toLowerCase();
        checkFor1 = checkFor1.toLowerCase();
        boolean itContains1 = sentence3_LowerCase.contains(checkFor1);

        System.out.println("\nDoes '" + sentence3 + "' contains " + checkFor1 + "' (ignoring cases)? : " + itContains1);

        int indexOfBody = sentence3.indexOf( "body");
        System.out.println("\nIndex of 'body' in " + sentence3 +"' is : " + indexOfBody);
        
    }

}
