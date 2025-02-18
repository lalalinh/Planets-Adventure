import java.util.Scanner;

public class Universe {

    public static void planetHeadline(String planetInput) {
        String planet = planetInput;

        System.out.println("----------------");
        System.out.println("Welcome onboarding to the planet of " + planet + "!");
        System.out.println("----------------");
    }

    public static void planetJoy(Scanner sc) {

        planetHeadline("Joy");

        System.out.println("You arrive at the first destination!");
        System.out.print("(?) Choose a direction for your exploration (left/right): ");
        String joyAnswer1 = sc.nextLine();
        boolean joy_core_memory;

        // Nested if statemen + String method 
        if (joyAnswer1.equals("left")) {
            System.out.print("(?) Recall one joyful moment from your childhood \n- ");
            sc.nextLine();

            // String method + Compound boolean expression
            System.out.print("(?) How much did it have an impact on you (a lot/a little/not at all)? ");
            String joyAnswer3 = sc.nextLine();
            if (!joyAnswer3.equals("not at all") && !joyAnswer3.equals("a little")) {
                joy_core_memory = true;
                System.out.println("Core memory: " + joy_core_memory);
            } else {
                joy_core_memory = false;
                System.out.println("Core memory: " + joy_core_memory);
            }

        } else if (joyAnswer1.equals("right")) {
            System.out.print("(?) Recall a recent joyful moment that you have \n- ");
            sc.nextLine();

            // String method + Compound boolean expression
            System.out.print("(?) How much did it have an impact on you (a lot/a little/not at all)? ");
            String joyAnswer3 = sc.nextLine();
            if (!joyAnswer3.equals("not at all") && !joyAnswer3.equals("a little")) {
                joy_core_memory = true;
                System.out.println("Core memory: " + joy_core_memory);
            } else {
                joy_core_memory = false;
                System.out.println("Core memory: " + joy_core_memory);
            }
        }

        System.out.println("You're at the final stop, an encounter between the past and present");
        System.out.println("(?) Choose a number from 0 to 100 to help you make a decision!");
        int joyAnswer4 = sc.nextInt();
        sc.nextLine();  
        // Math operation 
        if (Math.sqrt(joyAnswer4) <= 5) {
            System.out.print("Before leaving this planet, express something to your present self? \n- ");
            sc.nextLine();
        } else {
            System.out.print("Before leaving this planet, express something to your past self? \n- ");
            sc.nextLine();
        }
    }

    public static void planetSadness(Scanner sc) {

        planetHeadline("Sadness");

        System.out.println("You arrive at the first stop!");
        System.out.print("(?) There is a peak and a valley, which way do you wanna go (peak/valley)? ");
        String sadnessAnswer1 = sc.nextLine();
        boolean sadness_core_memory;

        // Nested if statement + String method
        if (sadnessAnswer1.equals("peak")) {
            System.out.print("(?) What has burdened your feelings lately? \n- ");
            sc.nextLine();

            // String method + Compound boolean expression
            System.out.print("(?) How long has it been disturbing you (long time/some time/short time)? ");
            String sadnessAnswer3 = sc.nextLine();
            if (!sadnessAnswer3.equals("short time") && !sadnessAnswer3.equals("some time")) {
                sadness_core_memory = true;
                System.out.println("Core memory: " + sadness_core_memory);
            } else {
                sadness_core_memory = false;
                System.out.println("Core memory: " + sadness_core_memory);
            }

        } else if (sadnessAnswer1.equals("valley")) {
            System.out.print("(?) What is a worry from the past that you carried until now? \n- ");
            sc.nextLine();

            // String method + Compound boolean expression
            System.out.print("(?) How long has it been disturbing you? (long time/some time/short time)? ");
            String sadnessAnswer3 = sc.nextLine();
            if (!sadnessAnswer3.equals("short time") && !sadnessAnswer3.equals("some time")) {
                sadness_core_memory = true;
                System.out.println("Core memory: " + sadness_core_memory);
            } else {
                sadness_core_memory = false;
                System.out.println("Core memory: " + sadness_core_memory);
            }
        }

        System.out.println("You're at the final stop, an encounter between the past and present");
        System.out.println("(?) Choose a number from 0 to 100 to help you make a decision!");
        int sadnessAnswer4 = sc.nextInt();
        sc.nextLine();

        // Math operation 
        if (Math.sqrt(sadnessAnswer4) <= 5) {
            System.out.print("Before leaving this planet, express something to your present self? \n- ");
            sc.nextLine();
        } else {
            System.out.print("Before leaving this planet, express something to your past self? \n- ");
            sc.nextLine();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Intro 
        System.out.println("----------------");
        System.out.print("Hello! What's your name? ");
        String name = sc.nextLine();

        System.out.println("Hi " + name + ", you're now inside a Universe called Emotions!");
        System.out.println("Let's explore the two main planets of Emotions");
        System.out.println("----------------");

        // Intro Question
        System.out.println("Which number is your favorite?");
        System.out.print("(?) Choose between an odd and even number! ");
        int answer1 = sc.nextInt();
        sc.nextLine();  

        boolean joy = false;
        boolean sadness = false;

        // Math operation
        if (answer1 % 2 == 0) {
            // Direct to the planet of Joy
            joy = true;
        } else if (answer1 % 2 == 1) {
            // Direct to the planet of Sadness
            sadness = true;
        }

        // If answer1 is an even number-----Planet of Joy
        if (joy) {
            planetJoy(sc);
            // Then direct to planet of Sadness
            planetSadness(sc);

        // Else if answer1 is an odd number-----Planet of Sadness
        } else if (sadness) {
            planetSadness(sc);
            // Then direct to planet of Joy
            planetJoy(sc);
        }

        // Final choice
        System.out.println("You've explored the two planets of Emotions!");
        System.out.println("Now is a safe space to leave behind regrets and sorrows.");
        System.out.println("(?) Make your final decision, to leave or to stay (leave/stay)");
        String finalAnswer = sc.nextLine();
        // String method
        if (finalAnswer.equals("leave")) {
            System.out.println("Congrats! You've chosen to leave behind your past");
            System.out.print("Continuing to move forward and ");
            System.out.print("allowing yourself to express the way that you need to make you more authentic!");
        } else if (finalAnswer.equals("stay")) {
            System.out.println("Choose again! To LEAVE or to stay");
            String finalAnswer2 = sc.nextLine();
            if (finalAnswer2.equals("leave")) {
                System.out.println("Congrats! You've chosen to leave behind your past");
                System.out.print("Continuing to move forward and ");
                System.out.print("allowing yourself to express the way that you need to make you more authentic!");
            }
        }

        sc.close();
    }
}
