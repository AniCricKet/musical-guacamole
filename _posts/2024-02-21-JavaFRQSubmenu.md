---
toc: true
comments: true
layout: post
title: 2015 FRQ Practice Submenu
description: Links to my breakdowns for the 2015 AP CSA FRQ Questions 
type: tangibles
courses: { csa: {week: 24} }
permalink: /2015frqs
---
# 2015 FRQ Submenu
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Submenu Table</title>
  <style>
    body {
      margin: 0;
      padding: 0;
    }
    table {
      width: 100%;
      border-collapse: collapse;
    }
    td {
      border: 1px solid black;
      padding: 10px;
      text-align: center;
      position: relative;
      overflow: hidden; /* Ensure magnifying glass stays within the table */
    }
    .magnifying-glass {
      width: 300px;
      height: 300px;
      position: absolute;
      border: 2px solid #000;
      border-radius: 50%;
      display: none;
      pointer-events: none;
      background-size: 800% 800%; /* Adjust background size for better display */
    }
    .image-container:hover .magnifying-glass {
      display: block;
    }
  </style>
</head>
<body>
<table>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/6ab92a3e-70c1-4603-86e1-9c99439aa0b3" alt="Question 1">
    </td>
    <td>This question involves creating three static methods in a class named DiverseArray. The first method, arraySum calculates the sum of entries in a specified one-dimensional array. The second method, rowSums, calculates sums of each row in a given two-dimensional array and returns these sums in a one-dimensional array. The third method, isDiverse, determines if a given two-dimensional array is diverse, meaning no two rows have the same sum. Approach:
(a) For arraySum, you need to iterate through the one-dimensional array and calculate the sum of its entries. (b) For rowSums, use the arraySum method appropriately. Iterate through each row of the two-dimensional array and use arraySum to calculate the sum of each row.(c) For isDiverse, use rowSums appropriately. Calculate the row sums for the given two-dimensional array and check if all row sums are unique, returning true if they are and false otherwise. </td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/66316650-70ff-497f-919b-ba3d4e6a2a87" alt="Question 2">
    </td>
    <td>This question describes a guessing game where a player attempts to guess a hidden word consisting of capital letters. The player receives hints after each guess, where each hint is based on a comparison between the hidden word and the guess. The hint follows specific rules: matching letters in the same position, letters in different positions marked with a plus sign, and letters not in the hidden word marked with an asterisk. The task is to create a class named HiddenWord to represent the hidden word, with a constructor accepting the hidden word as a parameter and a method named getHint that takes a guess and produces a hint. Approach: (1) Define an instance variable in the HiddenWord class to store the hidden word. (2) Create a constructor to initialize the hidden word when an object of the HiddenWord class is created. (3) Implement the getHint method to compare the guess with the hidden word based on the rules provided. (4) Iterate through each character in the guess, compare it with the corresponding character in the hidden word, and construct the hint accordingly. (5) Return the hint as a string.
</td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/8b25b143-c55a-47b1-ae2f-204ebb653575" alt="Question 3">
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/41b0d997-e69f-4743-bd69-96754d7ae029" alt="Question 3">
    </td>
    <td>This question involves implementing two methods for a SparseArray class, which represents a sparse array using a list of SparseArrayEntry objects. The SparseArrayEntry class represents non-zero elements in the sparse array with their row and column indexes. The methods to be implemented are as follows: (a) Write the getValueAt method in the SparseArray class, which returns the value of the sparse array element at a given row and column. If an entry with the specified row and column exists in the list of entries, the method returns the associated value. Otherwise, it returns 0. (b) Write the removeColumn method in the SparseArray class, which removes a specified column from the sparse array. The method should remove all entries in the list with column indexes matching the specified column, adjust the column indexes greater than the specified column, and update the number of columns in the sparse array. Approach: (a) For getValueAt, iterate through the list of entries and check if there is an entry with the specified row and column. Return the associated value if found, otherwise return 0. (b) For removeColumn, iterate through the list of entries and remove entries with the specified column. Adjust the column indexes greater than the specified column by decrementing them. Update the number of columns in the sparse array.
</td>
  </tr>
  <tr>
   <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/768d86c6-5a88-442c-bc90-a75976076308" alt="Question 4">
    </td>
    <td>This question involves designing an interface called NumberGroup to represent a group of integers with a method named contains. The interface is intended to check if a given integer is part of the group. Following this, a class named Range is to be implemented, which represents a number group of integers within a specified range. The Range class, being a implementation of NumberGroup, includes instance variables, methods, and a constructor to handle the range of values. Lastly, a class called MultipleGroups is mentioned, which represents a collection of NumberGroup objects and itself is a NumberGroup. The task requires writing the contains method for MultipleGroups, checking if a given integer is present in one or more of the number groups stored in the instance variable groupList. To approach this, start by defining the NumberGroup interface with the specified contains method. Then, implement the Range class ensuring the proper handling of ranges. Lastly, for the MultipleGroups class, write the contains method by iterating through the groupList and checking each group for the given integer. </td>
  </tr>
</table>

<script>
  document.addEventListener('DOMContentLoaded', function () {
    document.querySelectorAll('.image-container').forEach(function (container) {
      container.addEventListener('mousemove', function (e) {
        const glass = container.querySelector('.magnifying-glass');
        const rect = container.getBoundingClientRect();
        const x = e.clientX - rect.left;
        const y = e.clientY - rect.top;
        const backgroundX = (x / container.offsetWidth) * 800; /* Adjust background size for better display */
        const backgroundY = (y / container.offsetHeight) * 800; /* Adjust background size for better display */
        const imageUrl = container.querySelector('img').src;
        glass.style.backgroundImage = `url('${imageUrl}')`;
        glass.style.backgroundPosition = `-${backgroundX}px -${backgroundY}px`;
        glass.style.left = Math.min(Math.max(x - glass.offsetWidth / 2, 0), container.offsetWidth - glass.offsetWidth) + 'px';
        glass.style.top = Math.min(Math.max(y - glass.offsetHeight / 2, 0), container.offsetHeight - glass.offsetHeight) + 'px';
      });
    });
  });
</script>

</body>
</html>