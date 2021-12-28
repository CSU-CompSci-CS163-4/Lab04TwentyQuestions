**Introduction**

In this lab, you will work on a simple program that helps you learn about conditional statements, both for primitives and for Strings. By the end you will have a very simple program that outputs a greeting and some information about a number. This is also the first lab that has multiple files, and we will talk you through those files.

**Review of Branching**

Branching logic statements allow programmers to create multiple scenarios for their code to follow depending on different input criteria. The most basic of branching logic statements is the 'if' statement.

The 'if' statement is like asking a question, for example: “Do you like mac and cheese?” If yes, make mac and cheese. In addition to this you have the 'else' statement, this statement is a form of default statement for a question. “Do you like mac and cheese?”: if yes, make mac and cheese, else make hamburgers. In programming, 'if' statements are used to create branching pathways that the code can take.


if (logical statement) {

    /*Code here*/
    
} 

else {

    /*Code here*/
    
}

The following conditional operators exist for primitive values (int, double, char).

== (Equals)

\> (Greater than)

< (Less than)

\>= (Greater than or equal)

<= (Less than or equal)



As Strings are objects, you have to use methods to compare them. Common methods are:

.equals() (Strings are exactly equal including case)

.equalsIgnoreCase() (Strings are equal ignoring case)


**Reviewing The Code**

This is the first time you have dealt with multiple files in a lab. Java is made up of many files and classes all interacting together. If you click the arrow by the file name, you will be able to see both files.

The details of the files are as follows:

ConditionalsPracticeMain.java

This file contains your main method (public static void main(String[] args)), which also means it is the entry point into your program. Looking through this file, you will see a number of methods designed to help you test your code. It is very common practice that for every method you write, you write a secondary method to test it.

ConditionalsPractice.java

This is the heart of your program logic. You will code all of the methods in this class, so let’s start here! Select the file ConditionalsPractice.java in the drop down.



**Part 1 compareTwo(int first, int second)**

compareTwo(int, int) compares two numbers together and will return a String. At its heart, it is three if/else statements. The first if/else condition is done for you as an example:


if(first < second) { 

  output = output + first + " is less than " + second + "\n";
  
} 
else {

  output = output + first + " is not less than " + second + "\n";
  
}

A couple things to notice about the code - the return value of the method is output, and you are concatenating/adding to it with every value. Given the newline character, \n,  is added that means your String will contain multiple lines if it is printed (which it is in the test method).

Now it is your turn to write two additional statements.

**If** the first integer is greater than or equal to second integer:

[first] is greater than or equal to [second]

**else:**

[first] is not greater than or equal to [second]

**If** the first integer is equal to the second integer:

[first] is equal to [second]

**else**

[first] is not equal to [second]

For example:

System.out.println(compareTwo(0, 1));

Would output:

0 is less than 1

0 is not greater than or equal to 1

0 is not equal to 1

Work through the method, writing only a couple of lines at a time, run the program, then add more lines.

**Testing compareTwo(int first, int second)**

When you run the program, it will automatically test the method by calling compareTwoTests(). You should find that method in BranchingMain.java. You should add your own tests, as we only tested a limited set of numbers.

**Part 2 numberGame(int number)**

The numberGame() uses 'if' statements, but instead of setting a variable, you will notice the example uses returns.

if(number == 7) return "Lucky Sevens";

  //TODO Student    
  
return "Positive number";  

Once you return out of the method, the rest of the code isn’t processed. The following numbers to look for are listed below:

If the number is less than 10 but greater than 0, return “Single digit”.

If the number is 7 return “Lucky Sevens”.

If the number is 42, return “The answer to life the universe and everything”.

If the number is below 0, return “negative number”.

If the number is 0, return “ZERO”.

Otherwise, return “Positive number”.

Hint: Your 'if' statements should go from most specific to least specific. If one answer falls under multiple categories, return the most specific one. For example if the number is 7, the method should return “Lucky Sevens” not “Single Digit”.

**Testing numberGame(int number)**

You should be testing as you write each line (really, typos are easy to make but hard to find). Go to the numberGameTest() and add tests. You will notice we did not test all the conditions, and you should.

**Part 3 nameIntroductions(String first_name, String last_name)**

For this next method you are going to practice If statements with Strings. You will write a method called “nameIntroductions” that takes two Strings, a first and last name, and returns a String containing a short message to the user.

We have completed the first half of the statements for you. However, the second half of the greeting needs to be added to the message String.

If their last name is between 0 and 5 letters long the message ends “, I am sure glad to meet you!”.

If the last name is between 6 to 13 letters long the message ends “, I hope you are having a good day so far!”.

Otherwise, the message ends “ how are you doing this fine day!”.

Be careful about commas and spacing!

One last reminder, to get the length of the String, call .length()

For example:

int len = last_name.length();

Here are a couple examples of output from a successfully working method.

What is up Audrey Dorin, I am sure glad to meet you!

Good day Matthew Ernst, I am sure glad to meet you!

What is up Isabella Zapata, I hope you are having a good day so far!

**Testing nameIntroductions(String first_name, String last_name)**

While we tested the names above in nameIntroductionsTests(), you will want to test other names. Please show your tests to the TA for attendance credit.

Go ahead and run the game a few times. Once you have completed this step, you should go into submit mode and submit for grading.
