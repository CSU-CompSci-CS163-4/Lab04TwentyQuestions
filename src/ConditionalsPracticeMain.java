import java.util.Scanner;

public class ConditionalsPracticeMain {


    public static void main(String[] args) {
        if(args.length > 0 ) {
            playGame();
        }else {
            compareTwoTests();
            numberGameTests();
            nameIntroductionsTests();
        }
    }

    private static void playGame() {
        System.out.println("Welcome");
        Scanner scanner =  new Scanner(System.in);
        System.out.print("What is your first and last name? ");
        String first = scanner.next();
        String last = scanner.next();
        System.out.print("Please enter a number:");
        int one = scanner.nextInt();
        System.out.print("Thank you. Please enter another number:");
        int two = scanner.nextInt();


        System.out.println();
        System.out.println(ConditionalsPractice.nameIntroductions(first, last));
        System.out.println();
        System.out.println(ConditionalsPractice.compareTwo(one, two));
        System.out.println(two + " is " + ConditionalsPractice.numberGame(two));
        System.out.println();
        System.out.println("Thank you for playing!");
    }

    //Step 4
    private static void nameIntroductionsTests() {
        System.out.println("Running .nameIntroductions(String, String) tests");
            /*Test 1 for nameIntroductions(), testing:
                -1st half of alphabet first name
                -5 character last name
            */
        System.out.println("EXPECTED: What is up Jess Bahny, I am sure glad to meet you!");
        System.out.println("ACTUAL  : " + ConditionalsPractice.nameIntroductions("Jess", "Bahny"));

            /*Write tests for at least:
                -1st half of alphabet first name/<5 character last name
                -1st half of alphabet first name/6 character last name
                -2nd half of alphabet first name/<5 character last name
                -2nd half of alphabet first name/5 character last name
                -2nd half of alphabet first name/6 character last name
            */
        //STUDENT TODO: add your own here


        System.out.println();

    }


    private static void numberGameTests() {
        System.out.println("Running .numberGame(int) tests");
        System.out.println("EXPECTED: Lucky Sevens");
        System.out.println("ACTUAL  : " + ConditionalsPractice.numberGame(7));
        System.out.println("EXPECTED: The answer to life the universe and everything");
        System.out.println("ACTUAL  : " + ConditionalsPractice.numberGame(42));
        System.out.println("EXPECTED: Positive number");
        System.out.println("ACTUAL  : " + ConditionalsPractice.numberGame(13));
        //STUDENT TODO: Add your own here (notice not every number option is tested)

        System.out.println();
    }

    private static void compareTwoTests() {
        System.out.println("Running .compareTwo(int, int) tests");
        System.out.println("EXPECTED:\n" + "0 is less than 1\n" +
                "0 is not greater than or equal to 1\n" +
                "0 is not equal to 1");
        System.out.println("ACTUAL:\n" + ConditionalsPractice.compareTwo(0,1));
        System.out.println("EXPECTED:\n" + "1 is not less than 0\n" +
                "1 is greater than or equal to 0\n" +
                "1 is not equal to 0");
        System.out.println("ACTUAL:\n" + ConditionalsPractice.compareTwo(1,0));
        System.out.println("EXPECTED:\n" + "0 is not less than 0\n" +
                "0 is greater than or equal to 0\n" +
                "0 is equal to 0");
        System.out.println("ACTUAL:\n" + ConditionalsPractice.compareTwo(0,0));
        //STUDENT TODO: Add your own here


        System.out.println();
    }

}
