public class ConditionalsPractice {

        // Step 1: Basic Mathematical comparisons
        /**
         * Takes two ints and runs three comparisons on them. Less than, Greater Than or Equal To, and just Equal To.
         * For each comparison append to the return String the result of the comparison.
         * "first" is/is not less than "second"
         * "first" is/is not greater than or equal to "second"
         * "first" is/is not equal to "second"
         * However, replace the is/is not with the proper result of the comparisons and "first" and "second"
         * with the values of the variables of the same name. Include a newline character after each line "\n"
         * @param first first variable to compare to
         * @param second second variable to compare against
         * @return String with a statement about the variables.
         */
        public static String compareTwo(int first, int second){
            String output = "";
            if(first < second) {
                output = output + first + " is less than " + second + "\n";
            }
            else {
                output = output + first + " is not less than " + second + "\n";
            }

            // TODO: Student

            return output;
        }

        //Step 2
        /**
         * Depending on the value of the number return one of the following statements:
         * If the number is less than 10 but greater than 0, return "Single digit".
         * If the number is 7 return "Lucky Sevens".
         * If the number is 42, return "The answer to life the universe and everything".
         * If the number is below 0, return "negative number".
         * If the number is 0, return "ZERO".
         * Otherwise return "Positive number".
         * @param number the number to look at
         * @return string with the message that is listed above
         */
        public static String numberGame(int number){
            //Write a series of if/else if statements to complete the method
            if(number == 7) return "Lucky Sevens";
            //TODO Student

            return "Positive number";
        }

        //Step 3
        /**
         * You can assume proper capitalization (e.g. Logan Seabolt not logan seabolt)
         * The return string is based on the first letter of the firt_name and the length of last_name
         * If the user's first letter is in the first half of the alphabet (Up to and including M) the message starts with:
         *      "What is up  [first_name] [last_name]"
         * Otherwise the message starts:
         *      "Good day [first_name] [last_name]"
         * If the User's last name is less than or equal to 5 characters long, the message ends:
         *      ", I am sure glad to meet you!"
         * if the User's last name is between 6 and 12 characters long (inclusive), the message ends:
         *      ", I hope you are having a good day so far!"
         * Otherwise the message ends:
         *      " how are you doing this fine day?"
         * @param first_name the first name
         * @param last_name  the last name
         * @return a string introduction
         */
        public static String nameIntroductions(String first_name, String last_name){
            //Note string's have a .length and .charAt method.
            //Note 2, Characters can be compared directly.
            String message = "";
            if(first_name.charAt(0) >= 'M')
                message = message + "Good day " +first_name+" "+last_name;
            else
                message = message + "What is up " +first_name+" "+last_name;

            //TODO Student

            return message;
        }


}
