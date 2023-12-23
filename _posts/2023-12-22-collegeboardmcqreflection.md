---
toc: true
comments: true
layout: post
title: 2015 Collegeboard MCQ Reflection
description: My college board quiz mistakes and reflections
type: hacks
courses: {csa: {week: 18}}
permalink: /2015mcqreflection
---

# Score: 30/39

<img width="1231" alt="Screenshot 2023-12-22 at 6 47 35 PM" src="https://github.com/nighthawkcoders/teacher_portfolio/assets/91163802/b789e802-3dd6-4c1f-aa4e-d8a4561dd73a">


# Incorrect Answers:

## Question 14:
<img width="801" alt="Screenshot 2023-12-22 at 6 51 31 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/c46d10d9-6080-4b01-9589-b22425e15691">

For this question, you were supposed to identify the potential error in the "biggest" method. I chose the incorrect answer, Option D, when the correct answer was Option C. I mistakenly thought that the method might not work correctly when both "a" and "c" have equal values. However, the actual issue lies in the comparison between "a" and "b" in the second condition of the first "else if" statement. The method may not work correctly when "a" and "b" have equal values because in such a case, it would return the value of "b" instead of "a." This is why the correct answer is Option C.

### Collegeboard Explanation: Consider the example where a = 5, b = 3, and c = 5. In this case, the first boolean condition evaluates to false since a is not greater than c and the second boolean condition evaluates to false since b is not greater than a, and the value of c is returned, which is the greatest of all three integers. Consider the second example where a = 5, b = 6, and c = 5. In this case, the first boolean condition evaluates to false since a is not greater than b and the second boolean condition evaluates to true since b is greater than a and b is greater than c,  and the value of b is returned which is the greatest of the three values. Consider the third example where a = 5, b = 5, and c = 5. In this case, the first boolean condition evaluates to false since a is not greater than b and the second boolean condition evaluates to false since b is  not greater than a,  and the else is executed so the value of c is returned. Since all three values were equal any of the values could be returned as the greatest of the three values.


## Question 17: 
<img width="786" alt="Screenshot 2023-12-22 at 6 52 34 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/097ac6f3-6a3e-48e5-9785-2bc0f190c3ec">

For this question, you were supposed to determine the value returned from a call to the "doWhat" method with a positive integer parameter. I chose the incorrect answer, Option C, when the correct answer was Option D. I mistakenly thought that the method was summing even integers, but it was actually summing odd integers between 1 and the given parameter "num." The loop in the method increments by 2, ensuring that it includes only odd integers. This is why the correct answer is Option D, representing the sum of all odd integers between 1 and num, inclusive.

### Collegeboard Explanation: This would be the result if loop was initialized to 0 instead of 1.

Question 21:
<img width="801" alt="Screenshot 2023-12-22 at 6 53 08 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/ced331e5-bfd0-4b66-9e4f-9f03e56f0955">

For this question, you were supposed to determine what is printed as a result of the call to the "whatsItDo" method with the parameter "WATCH." I chose the incorrect answer, Option C, when the correct answer was Option D. I mistakenly thought that the method was printing substrings excluding the first character. However, the method actually prints substrings including the first character but excluding the last one. Therefore, the correct answer is Option D, representing the printed substrings:

- WATC
- WAT
- WA
- W

### Collegeboard Explanation: This would be the result of temp being assigned a substring of the parameter with the first character removed in the first recursive call and then the last character removed in subsequent calls.


## Question 23:
<img width="821" alt="Screenshot 2023-12-22 at 6 53 50 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/11a4b0b5-cc34-4479-bc20-7424a73d257f">

For this question, you were supposed to determine the values in the array `arr` after two passes of the for loop. I chose the incorrect answer, Option B, when the correct answer was Option C.

After two passes of the for loop, the array `arr` would be {3, 4, 5, 2, 1}. During each pass, the algorithm compares the current element with the elements before it and swaps them if necessary. In this case, the array is sorted in ascending order after two passes, resulting in Option C being the correct answer.

### Collegeboard Explanation: This insertion sort method begins sorting the array from the beginning putting the first three numbers in order during the first two passes. Only 3, 4, and 5 will be in the right order.


## Question 24:
<img width="830" alt="Screenshot 2023-12-22 at 6 54 40 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/40083f91-2fec-49b4-a1db-dc4d8d9db67a">

For this question, you were supposed to identify the methods that can be added to the `SomeMethods` class without causing a compile-time error. I chose the incorrect answer, Option B, when the correct answer was Option D.

I mistakenly thought that both the methods with signatures `public void one(int value)` (Option I) and `public void one(String first, int second)` (Option II) could be added. However, the correct answer is Option D, as only the methods with signatures `public void one(String first, int second)` (Option II) and `public void one(int first, int second, int third)` (Option III) can be added without causing a compile-time error. The reason is that the method signatures must be distinct, and Option I conflicts with the existing method `public void one(int first)` in the `SomeMethods` class.

### Collegeboard Explanation: Choice I will cause a compiler error if added to the SomeMethods class because it has the same method signature as public void one (int first), since it has the same name (one) and each parameter list consists of a single int parameter. Choice III can be added to the SomeMethods class because there are three int parameters and no other method named one has three int parameters

## Question 27:
<img width="828" alt="Screenshot 2023-12-22 at 6 55 31 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/e970ba43-34eb-4475-aaff-cbd8adbdc55d">

For this question, you were supposed to determine the value of the array `data` after three passes of the outer loop. I chose the incorrect answer, Option B, when the correct answer was Option A.

After three passes of the outer loop, the array `data` will be sorted in increasing order. The correct answer is Option A: {1, 2, 3, 4, 5, 6}. The sorting algorithm correctly compares and swaps elements, leading to the sorted order as indicated in Option A.

### Collegeboard Explanation: This is the result of completing all passes through the outer loop.


## Question 30: 
<img width="796" alt="Screenshot 2023-12-22 at 6 56 15 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/a2ae742b-baf3-4391-a0c0-487cde49373e">

For this question, I selected option B, thinking that the second code segment alone would be sufficient to replace the missing code in the `getCost` method. However, the correct choice is actually option D, which combines the first and second code segments.

The correct code segment to replace the missing code in the `getCost` method is:

```java
if (numBoxes >= 10) {
    totalCost = numBoxes * 1.50;
}
else if (numBoxes >= 5) {
    totalCost = numBoxes * 3.00;
}
else if (numBoxes > 0) {
    totalCost = numBoxes * 5.00;
}
```

This ensures that the correct pricing conditions are applied to calculate the total cost based on the number of boxes ordered. I apologize for any confusion in my previous response.

### Collegeboard Explanation: Choice I will compute the incorrect price for numBoxes being greater than or equal to 5. For example, if numBoxes is 10, the first boolean expression will evaluate to true and totalCost will be assigned the correct price of 15. However, the second boolean expression will also evaluate to true, changing the value of totalCost to 30. The third boolean expression will also evaluate to true, changing the value of totalCost to 50.

## Question 33:
<img width="798" alt="Screenshot 2023-12-22 at 6 57 14 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/45e1e869-6852-4165-8aad-fe756af0dada">

For this question, I selected option D, thinking that the second and third code segments would correctly assign the maximum element of the array to the variable `max`. However, the correct choice is actually option E, as all three code segments will always correctly assign the maximum element of the array to the variable `max`.

- Code Segment I uses a for-each loop and initializes `max` to the minimum integer value before iterating through the array to find the maximum.
- Code Segment II initializes `max` to 0, and through a loop, iterates over the array while updating `max` if a larger value is encountered.
- Code Segment III initializes `max` to the first element of the array and iterates through the array, updating `max` if a larger value is found.

### Collegeboard Explanation: Choice I sets max to Integer.MIN_VALUE, which is the smallest possible integer value. Then it accesses each element in arr and assigns them value. If value is greater than max, max is assigned value since it is now the largest value so far.

## Question 36: 
<img width="821" alt="Screenshot 2023-12-22 at 6 57 52 PM" src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/066d0d28-3b52-48d9-9600-5591224f1b83">

For this question, I selected option C, thinking that the maximum number of times the statement indicated by `/ * Calculate midpoint * /` could execute would be 20. However, the correct choice is option D, which indicates that the maximum number of executions is 11.

In the provided binary search method, the statement is executed within a while loop that continues until `start` is equal to `end` (the last possible iteration before termination). In the worst-case scenario where the target is not found, the loop will execute a maximum of 11 times.

### Collegeboard Explanation: The binary search eliminates half of the array during each iteration, as such you would need fewer iterations than 20.


# Final Reflection

The multiple-choice quiz posed challenges, especially in areas that required a nuanced grasp of programming concepts. Despite these challenges, I feel content with my final score of 30 out of 39. Reflecting on my performance, I recognized that the questions I struggled with often involved intricate code segments and required a keen attention to detail. Misinterpreting the logic within certain code snippets or overlooking specific nuances in the questions led to some of my errors. As I plan to use the winter break for targeted practice, I will delve deeper into understanding these specific code structures, reinforcing my comprehension through thorough review and hands-on coding exercises. This focused approach aims to address the specific question types that posed difficulties and further solidify my understanding for future assessments.
