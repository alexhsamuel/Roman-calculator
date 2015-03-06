Roman numeral calculator
==

In this project, we are going to build a simple calculator with a twist-- a 
calculator that calculates on Roman numerals! 

_This is a difficult project!_  Don't feel frustrated if it takes you a while to complete it.


Roman numerals
--

Roman numerals use the following symbols to express numbers.

  Symbol | Value
  :------|-----:
  M      |  1000
  D      |   500
  C      |   100
  L      |    50
  X      |    10
  V      |     5
  I      |     1

Symbols must appear from highest value to lowest value.
In addition, these special combinations are used:

  Combo  | Value| Instead of
  :------|-----:|:------------------
  CM     |  900 | (instead of DCCCC)
  CD     |  400 | (instead of CCCC)
  XC     |   90 | (instead of LXXXX)
  XL     |   40 | (instead of XXXX)
  IX     |    9 | (instead of VIIII)
  IV     |    4 | (instead of IIII)

No symbol should ever appear more than three times in a row.  There is exactly
one correct way of writing every number between 1 and 3999.

For example, 25 is XXV, 95 is XCV, 99 is XCIX, 642 is DCXLII, and 2015 is MMXV.


The repository
--

Each team will solve this problem separately.  Start by forking this repository:

>  https://github.com/accesscode-2-1/Roman-calculator

Each team member should clone the _forked_ repository and work there.  Open the
project in IntelliJ.  There's already some code written: we've provided
the skeleton for the methods you will have to write, as well as the main 
calculator loop.  


The team
--

Each team should elect the _team lead_, who is responsible for,

* Forking and managing the git repository.

* Reviewing all code.

* Making sure all code works correctly together.

Each team should split into three groups.  The team lead should be in group 3.
The two members of each group should pair-program to solve the group's
assignments.  

Use github to share code among the groups, as it is ready.  The team lead should
coordinate this.  The team lead should review all code.  Others should review
code as well, if they have time.  If one group finishes before the others, it
should help however possible to move the team forward.  At the end, each person
on the team should review the complete solution, and ask questions to understand
all the code.

Once you have completed your assignments, you will have a complete Roman
numerals calculator!


**Group 1**

The first group will write the code that formats a number as Roman numerals.
Fill in the `RomanNumerals.format()` method. 

**Group 2**

The second group will write the code that parses a number in Roman numerals into
an ordinal `int`.  (Note!  This is hard!)  Fill in the `RomanNumerals.parse()`
method.

**Group 3**

The third group has two jobs.

First, write code that tests the `format()` and `parse()` methods that the
other two groups are working on.  Fill in the `RomanNumerals.main()` method.
It's up to you to decide how to test.  You won't be able to run your test
code successfully until the other groups are done with their work.

Second, write code that performs the calculation.  This is the
`Calculator.calculate` method.  Ultimately, this will accept and print out Roman
numerals, but until the other groups are done with their work, you should
instead use normal decimal numbers.  We've provided a `parseDecimalNumber()`
method to help you with this.  That way, you can test that your logic works
correctly.  Once the other groups are done, you should use their
`RomanNumerals.format()` and `RomanNumerals.parse()` methods.


The result
--

The final program prints a prompt and waits for you to type a simple expression
to calculate.  An expression consists of a number in Roman numerals, followed
by an operation, followed by another number in Roman numerals.  Each should
be separated by a space.

The program will behave like this:

    > I + I
    II

    > VII * VI
    XLII

    > M - I
    CMXCIX

    > C % IX
    I

    > D # DC
    DL

    > D
    syntax error

    > XVII + 4
    invalid number: 4

    > X @ XX
    invalid operation: @

    >
    done

If you provide an empty input, the program prints "done" and exits.  Otherwise,
it keeps running indefinitely.

