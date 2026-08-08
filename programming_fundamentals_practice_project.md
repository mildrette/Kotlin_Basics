
# Programming Fundamentals — Separate Practice Project
For Mimi — this is intentionally separate from the main Kotlin roadmap. Goal: build confidence on the "easier feeling" fundamentals first (loops, functions), before circling back to conditionals and operators.

## HOW TO USE THIS
Go in whatever order feels less scary. Suggested order based on what you said: Loops and Functions first, then Data Structures, then Input/Output, then come back to Operators and Conditionals last, once you've built some confidence.

Each fundamental below has: what it is in plain words, a simple analogy, and a small example.

---

## 1. VARIABLES AND DATA TYPES (you already know this — confirmed correct)
What it is: a way to store a piece of data with a name so you can use it later, and change it later.
Analogy: a labeled box. The variable name is the label, the value is what's inside the box. You can always take out what's inside and put something new in.

Data types:
- String: text, wrapped in quotes. Example: val name = "Mimi"
- Number types (integers): whole numbers, no decimals. Example: val age = 31
- Boolean: only true or false. Example: val isLoggedIn = true
- Float: decimal numbers, smaller precision, uses less memory. Example: val price = 2.5f
- Double: decimal numbers, larger precision, more accurate for bigger or more sensitive calculations. Example: val pi = 3.14159265
(Correction from before: float is the smaller/less precise one, double is the larger/more precise one — you had these two backwards, everything else was right.)

---

## 2. OPERATORS
What it is: symbols that do actions, either math (add, subtract) or comparisons (is this equal to that, is this bigger than that).
Analogy: think of them as simple yes or no questions or simple math you'd do with your fingers, just written in symbol form.

Math operators: plus, minus, times, divide — exactly like normal math.
Comparison operators:
- equals to (checking if two things are the same) is written as two equal signs together
- not equal to
- greater than
- less than
- greater than or equal to
- less than or equal to

The trick: these are not formulas, they are just questions. "Is 5 greater than 3?" The computer answers true or false, nothing more complicated than that.

---

## 3. CONDITIONALS
What it is: "if this happens, do that, otherwise do something else."
Analogy: exactly like a decision you make every day. If it is raining, take an umbrella, otherwise don't.

Structure: if (condition) { do this } else { do that }
Example: if (age is greater than or equal to 18) { print "adult" } else { print "child" }
The condition inside the if is just an operator question, like the ones above. That's the only connection between operators and conditionals, once you're comfortable with one, the other becomes just plugging it in.

---

## 4. LOOPS
What it is: repeating an action multiple times without rewriting the code over and over.
Analogy: like telling your son "brush every tooth" instead of naming each tooth one by one, you just say "do this for every one of them."

Two common types:
- For loop: repeat a set number of times, or once for every item in a list. Example: for each day in the week, print the day name.
- While loop: repeat as long as a condition stays true. Example: while the tank is not full, keep pouring water.

---

## 5. FUNCTIONS
What it is: a reusable named block of steps, like a recipe card you write once and use many times.
Analogy: "make tea" is a function. You define the steps once, boil water, add tea leaves, pour, and after that you just say "make tea" instead of listing the steps every single time.

Structure: fun functionName() { steps go here }
Functions can also take information in (called parameters) and give information back out (called a return value). Example: a function called addNumbers that takes two numbers in and gives you their sum back out.

---

## 6. DATA STRUCTURES (lists and collections)
What it is: a way to hold multiple values together instead of one variable per value.
Analogy: instead of one box per pencil, it's a pencil case holding all your pencils together, in order.

Common type: List — an ordered collection of items. Example: a list of your son's favorite foods, val foods = list of "rice", "plantain", "beans". You can loop through a list to do something with each item.

---

## 7. INPUT AND OUTPUT
What it is: getting information into your program, and displaying results back out.
Analogy: input is someone telling you something, output is you telling them something back.

In most learning contexts this starts simple: output is just printing something to the screen so you can see what your code did. Input often comes later, from a user typing something, or in Android's case, from what the user taps or types on their screen.

---

## 8. CONTROL FLOW WITH ERRORS (more advanced, save for later)
What it is: handling situations where something goes wrong in your code without the whole program crashing.
Analogy: a backup plan. If you try to pour from an empty cup, instead of the whole kitchen shutting down, you just say "oh, it's empty, let me get more" and continue.

This one can wait. It's useful once you're comfortable with everything above.

---

## SUGGESTED PRACTICE ORDER FOR THIS SEPARATE PROJECT
1. Loops (you already have curiosity here, start now)
2. Functions (natural next step after loops, they often work together)
3. Data structures / lists (loops become much more useful once you have a list to loop through)
4. Input and output (simple print statements throughout, no need to isolate this, just practice printing results from your loops and functions)
5. Then circle back to Operators and Conditionals, now that you've built confidence elsewhere, these comparison symbols will just be small pieces to slot into what you already know

Remember, the goal of this separate project isn't to finish it fast, it's to prove to yourself that you can learn something new here without the fear response kicking in. Small wins first, hardest part last.
