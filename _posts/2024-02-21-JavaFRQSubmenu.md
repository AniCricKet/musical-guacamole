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
    }
    .magnifying-glass {
      width: 50px;
      height: 50px;
      position: absolute;
      border: 2px solid #000;
      border-radius: 50%;
      display: none;
      pointer-events: none;
      background-size: 300% 300%;
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
    <td>Question 1</td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/66316650-70ff-497f-919b-ba3d4e6a2a87" alt="Question 2">
    </td>
    <td>Question 2</td>
  </tr>
  <tr>
    <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/8b25b143-c55a-47b1-ae2f-204ebb653575" alt="Question 3">
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/41b0d997-e69f-4743-bd69-96754d7ae029" alt="Question 3">
    </td>
    <td>Question 3</td>
  </tr>
  <tr>
   <td class="image-container">
      <div class="magnifying-glass"></div>
      <img src="https://github.com/AniCricKet/musical-guacamole/assets/91163802/768d86c6-5a88-442c-bc90-a75976076308" alt="Question 4">
    </td>
    <td>Question 4</td>
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
        const backgroundX = (x / container.offsetWidth) * 300;
        const backgroundY = (y / container.offsetHeight) * 300;
        const imageUrl = container.querySelector('img').src;
        glass.style.backgroundImage = `url('${imageUrl}')`;
        glass.style.backgroundPosition = `-${backgroundX}px -${backgroundY}px`;
        glass.style.left = x - glass.offsetWidth / 2 + 'px';
        glass.style.top = y - glass.offsetHeight / 2 + 'px';
      });
    });
  });
</script>

</body>
</html>