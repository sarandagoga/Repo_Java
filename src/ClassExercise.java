public class ClassExercise {
    public static void main(String[] args) {
        System.out.println("ClassExercise1");

        String day = "tue";    // mon, MonDYA, MONDAY, MonDaY
        if (day.equalsIgnoreCase("mon")
                || day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("wed")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("fri")
                || day.equalsIgnoreCase("friday")) {
            System.out.println("Today is the Technosoft class");
        } else if (day.equalsIgnoreCase("tue")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("thu")
                || day.equalsIgnoreCase("thursday")) {
            System.out.println("Today is self learning day");
        } else if (day.equalsIgnoreCase("sun")
                || day.equalsIgnoreCase("sunday")) {
            System.out.println("No study today");
        } else {
            System.out.println("Entered day-value is not valid");
        }

        }

    }

