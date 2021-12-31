# Lab 04 - Twenty Questions

In this lab, you will create a simple program that is a 20 questions game.

## Step 1: Self-Explanation
Using the flow diagram below, explain *in your own words* what is happening in `main()`. Put some comments above the different methods being called so that before you start coding, you know the big picture of how the game is going to work.

![TwentyQuestionsFlow](https://user-images.githubusercontent.com/77072076/147840072-88908872-f6f5-4a1e-90fd-e39c86e0069e.png)

## Step 2: Coding
Take a look at the [javadoc](http://www.cs.colostate.edu/~cs163/javadoc/lab04/package-summary.html). Edit the methods marked with `TODO student`. Make sure to test your methods as you complete each one. If you wait until the end to test your code, it makes everything so much harder to debug. 

## Step 3: Playtest
Now that you have completed the methods and tested them individuallly, it is time to playtest the game in its entirety.

## Step 4: Turning In/Receiving Credit
Submit the lab in Zybooks by clicking through the Canvas link, as this is a Thursday practice lab, the grade is only based on getting it done. However, you should still be writing tests and using the techniques demonstrated.  Make sure canvas updated (you may need to click the link again, and then click submit for grading again)!

## Review of Branching
Branching logic statements allow programmers to create multiple scenarios for their code to follow depending on different input criteria. The most basic of branching logic statements is the `if` statement.

The `if` statement is like asking a question, for example: “Do you like mac and cheese?” If yes, make mac and cheese. In addition to this you have the `else` statement, this statement is a form of default statement for a question. “Do you like mac and cheese?”: if yes, make mac and cheese, else make hamburgers. In programming, `if` statements are used to create branching pathways that the code can take.
```
if (logical statement) {
    /*Code here*/
} 
else {
    /*Code here*/
}
```
The following conditional operators exist for primitive values (int, double, char):
```
== (Equals)

> (Greater than)

< (Less than)

>= (Greater than or equal)

<= (Less than or equal)
```

As Strings are objects, you have to use methods to compare them. Common methods are:

`.equals()` (Strings are exactly equal including case)

`.equalsIgnoreCase()` (Strings are equal ignoring case)



