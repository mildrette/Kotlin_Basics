
# After the Fundamentals — What Comes Next
Separate project, for after you've mastered variables, operators, conditionals, loops, functions, data structures, input/output, and basic error handling.

## HOW TO USE THIS
Same style as before: small steps, plain explanations, one thing at a time. This is the "intermediate" layer that sits between fundamentals and real professional work.

---

## 1. OBJECT ORIENTED PROGRAMMING (OOP)
What it is: organizing your code around "objects" that combine data and actions together, instead of separate loose variables and functions.
Analogy: instead of separate boxes for a person's name, age, and actions, you build one blueprint called "Person" that has all three built in, and you can stamp out as many people as you want from that one blueprint.
Key ideas to learn in order: classes and objects, then constructors, then inheritance (one blueprint building on another), then interfaces (a contract of what a class must be able to do).

## 2. WORKING WITH APIS
What it is: how your app talks to other services or servers over the internet to get or send data.
Analogy: like ordering food through a waiter, you ask for something, the waiter goes to the kitchen, and comes back with your order.
Concepts: requests and responses, JSON (the common format data is packaged in), and asynchronous programming (doing something while waiting for a slow response, instead of freezing).

## 3. ASYNCHRONOUS PROGRAMMING
What it is: letting your program continue doing other things while it waits for something slow, like a network call.
Analogy: putting rice on the stove and continuing to prepare other food while it cooks, instead of standing and staring at the pot doing nothing else.
In Kotlin this is coroutines, in Python this is async and await.

## 4. VERSION CONTROL DEEPER SKILLS
You already use Git day to day. The next level is understanding branching strategies well, resolving merge conflicts confidently, and using pull requests as a communication tool, not just a formality.

## 5. TESTING
What it is: writing small pieces of code whose only job is to check that your other code works correctly.
Analogy: like tasting your food while cooking to check the seasoning is right, before serving it to someone else.
Start with unit tests, small tests for one function at a time.

## 6. DESIGN PATTERNS
What it is: common, proven solutions to problems that show up again and again in software.
Analogy: like standard recipes that experienced cooks reuse, rather than reinventing a dish from scratch every time.
No need to memorize all of them, just get familiar with a few common ones as you encounter the need.

## 7. ARCHITECTURE (for app development specifically, like your Android work)
What it is: how you organize a whole app's code so it stays manageable as it grows, deciding where UI code, logic code, and data code each live.
This becomes very relevant to the Jetpack Compose work you're already doing.

## SUGGESTED ORDER
1. Object Oriented Programming, since almost everything else builds on this
2. Basic testing, so you build the habit early
3. Working with APIs
4. Asynchronous programming, right after APIs since they go together
5. Deeper git skills, ongoing alongside everything else
6. Design patterns and architecture, once you have real project experience to hang them on
