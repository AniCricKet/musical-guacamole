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
    <td><a href="https://anicricket.github.io/musical-guacamole/2015frq1">Question 1</a></td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/66316650-70ff-497f-919b-ba3d4e6a2a87" alt="Question 2">
    </td>
    <td><a href="https://anicricket.github.io/musical-guacamole/2015frq2">Question 2</a></td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/8b25b143-c55a-47b1-ae2f-204ebb653575" alt="Question 3">
    </td>
    <td><a href="https://anicricket.github.io/musical-guacamole/2015frq3">Question 3</a></td>
  </tr>
  <tr>
   <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/768d86c6-5a88-442c-bc90-a75976076308" alt="Question 4">
    </td>
    <td><a href="https://anicricket.github.io/musical-guacamole/2015frq4">Question 4</a></td>
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