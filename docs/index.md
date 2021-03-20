## Basic tasks

**Log in to CodingBat** (this is important) and complete the following problems:

1. [Array-2 > countEvens](https://codingbat.com/prob/p162010)

2. [Array-2 > centeredAverage](https://codingbat.com/prob/p136585)

    **Hints**
    
    * The task of finding the maximum value in an array is fairly simple. If you don't think so, imagine it in physical terms: 
    
        1. Get a piece of paper, and write on it the minimum value you can represent on it. (For example, we might start with the value of `Integer.MIN_VALUE`, which is the minimum `int` value Java recognizes: -2147483648.)
        
        2. Go through the array of values one at a time. With each current element value, ...
        
            * If the current element value is _greater than_ the one you have written on the paper, then ...
                * Erase the number from the paper, and write the current element value on the paper;
                otherwise, ...
                * make no change to the number on the paper.
                
        3. After you've gone through all of the elements of the array, the number written on the paper is the maximum of all the values in the array. 
        
            The same approach works for finding the minimum value in an array; the only difference is that we start out with the maximum value we can represent on the piece of paper, and we replace it only if/when the current element value is _less than_ the number on the paper.
            
            (There's one special case where approach this doesn't work exactly as intended; can you figure out what it is? If you can, notice that it doesn't apply to this CodingBat problem, according to the directions.)
            
    * In _a single pass_ through an array, you can find the minimum and maximum values, along with the sum of all values.
    
    * If you take the sum of all values in an array, and subtract from that sum the minimum and maximum values, the result is the sum of all but the minimum and maximum values in the array.
    
    * To find the average of all but the minimum and maximum values in the array, simply take the sum of all but the minimum and maximum values, and divide by the length of the array **minus** 2 (since you're excluding 2 values---the minimum and maximum values---from the calculation).

3. [Logic-2 > blackjack](https://codingbat.com/prob/p117019)

4. [Logic-2 > makeBricks](https://codingbat.com/prob/p183562)

    **Hints**
    
    If you have trouble visualizing this one, imagine an equivalent problem ...
    
    1. You are given a specified number of pennies (the value of the parameter `small`).
    
    2. You are also given some number of nickels (the value of the parameter `big`).

    3. Now, you are asked if it is possible to use some of the pennies (which can be zero or more, but no more than the number you were given in the parameter `small`), along with some or all of the nickels (also zero or more, but no more than the number you were given in the parameter `big`), to add up to a number of cents **exactly equal** to the `goal` parameter.
    
    How would you go about answering that question? Can you turn your approach into code?

5. [Custom > sumMultiples](https://codingbat.com/prob/p264570)

    First, credit where credit is due: Most of the content on CodingBat is &copy; 2017 Nick Parlante; however, this problem was created by Todd Nordquist. (You can add custom problems to CodingBat; that's something I'd like to do more of, when Todd and I get more time.)
    
    **Hints**
    
    Think of this one as a generalization of FizzBuzz; however, instead of ...
    
    > finding the appropriate `String` representation for a number, depending on whether it is divisible by one number or another (or both, or neither), 
    
    here you must ...

    > either add the current number into a running total---again, depending whether it is divisible by either or both of two numbers---or not.

### General hints

* When in doubt, if you need to write a method that returns a result, begin the implementation with the following steps:

    1. Declare a local variable (as the first line in the method body) of the same type as the return type of the method. 
    
    2. In the same statement in which you declare the variable, assign it an initial value. 
    
        * If the return type is a class---including `String`---rather than a primitive, `null` is a reasonable initial value. 
        * For the `boolean` primitive type, `false` is a reasonably safe initial value.
        * For numeric primitive types---`byte`, `short`, `char`, `int`, `long`, `float`, and `double`---the value `0` is usually chosen.)
    
    3. As the last line of the method body, write a `return` statement to return the variable you declared in step 1.
    
        Note that at this point (assuming you've written the lines of code described above correctly), the code can be compiled. Try to stay aware of your edits, and how they affect the ability of the code to be compiled. Pay special attention to structure, and its _tokens_ (pairs of parentheses, pairs of braces, pairs of brackets, closing semi-colons, etc.): Beware of changes that disrupt the structure, when that's not what you intend.

    
    4. Between the 2 lines of code you created in the above steps, write the code to compute and assign the correct value to the variable declared in step 1.

    With experience, you'll be able to simplify the above steps in many cases---but it's never a bad idea to start out with them.

* In CodingBat, the test cases aren't displayed until you submit your code (using the **Go** button). 
However, it can be very useful to see these test cases while you're writing the code, to clarify your understanding of how the method is expected to behave. To do this, simply submit your code before it's done; it will probably fail most of the test cases, _but the test cases will be displayed_. Note that this trick only works if your code actually compiles; if it doesn't, the output from submitting your code will be a compilation error message (which you can use to help you fix the code), but none of the test cases will be displayed.  (As a rule, if you follow the steps listed above, your code won't compile until after step 3 is done.)   

* **Important**: Please remember to _log in to CodingBat_ before writing and submitting code; otherwise, your code won't be saved, and will disappear when you navigate away from the page of any given problem.

## Extra credit

Note that the testing performed by CodingBat is _unit testing_---that is, invocation of a method with parameter values from one or more test cases, and verification that the result returned for each matches the expected value (presumed to be correct).
For extra credit, write your code (or copy & paste it from the code you've written in CodingBat) in an IntelliJ project, then write and run the unit tests using JUnit5.
To make this as simple as possible for this initial assignment, we've created the IntelliJ project for you, along with the method stubs.
To get a copy of the project we've created for you, and then complete and submit your work, do the following:

1. Accept the [coding-bat-3]({{ site.assignment_url | relative_url }}) assignment in GitHub Classroom.
2. Using the **Clone or download** button, copy the SSH URL of the assignment into the clipboard.
3. With IntelliJ (or from a command shell), clone the repository (into a subdirectory of your `bootcamp/projects` directory).
4. From IntelliJ, open the repository contents as an IntelliJ project.
5. Complete the methods in the `edu.cnm.deepdive.codingbat.Array2`, `edu.cnm.deepdive.codingbat.Logic2`, and `edu.cnm.deepdive.codingbat.Custom` classes in the main source root (`src/main/java`).
6. Complete the test methods in the `edu.cnm.deepdive.codingbat.Array2Test`, `edu.cnm.deepdive.codingbat.Logic2Test`, and`edu.cnm.deepdive.codingbat.CustomTest` classes in the test source root (`src/test/java`).
7. Run the JUnit5 tests in the `edu.cnm.deepdive.codingbat.Array2Test`, `edu.cnm.deepdive.codingbat.Logic2Test`, and `edu.cnm.deepdive.codingbat.CustomTest` classes.
8. Commit and push your changes.

### Hints for extra credit

* Note that all of the methods to be implemented are non-`static`; thus, you will need to create instances of `Array2`, `Logic2`, or `Custom` to test the methods in any of those classes.

* All of the code---including the test code---is given to you in a compilable state. Try to stay aware of your edits, and how they affect the ability of the code to be compiled. Pay special attention to structure, and its _tokens_ (pairs of parentheses, pairs of braces, pairs of brackets, closing semi-colons, etc.): Beware of changes that disrupt the structure, when that's not what you intend.