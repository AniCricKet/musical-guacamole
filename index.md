---
layout: default
title: Student Blog
---
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="{{ '/assets/css/style.css?v=' | append: site.github.build_revision | relative_url }}">

<body>

  <div style="display: flex; flex-direction: column; width: 100%; justify-content: center; align-items: center;">
    <h1 id="typewriter" style="text-align: center;"/>
  </div>

</body>

<script>
  var i = 0;
  var txt = "Welcome to Aniket's blog! 😻🤩🤠";

  var speed = 150;
  function typeWriter(x) {

    if (i <= txt.length) {
      document.getElementById("typewriter").innerHTML = txt.substring(0, i)
      i++;
      setTimeout(typeWriter, speed);
    }

  }

  typeWriter();

</script>
</head>

<p style="text-align: center;">My name is Aniket. I'm a junior at Del Norte, and am excited to dive into another year of coding! </p>


![About Me](/musical-guacamole/images/aboutmethingy.png "About Me")

One of my favorite hobbies is watching and playing soccer. Here are my three favorite players:  

Lionel Andrés Messi Cuccittini, Neymar da Silva Santos Junior, Pedro Gonzalez   


![]({{ site.baseurl }}/images/messisquare.png "Image of Lionel Messi"){: height="300px" width="250px"}.
![]({{ site.baseurl }}/images/neymarsquareGIF.gif "GIF of Neymar Jr"){: height="300px" width="250px"}.
![]({{ site.baseurl }}/images/pedrisquare.jpeg "Image of Pedri"){: height="300px" width="250px"}.



| Week | Topic | Tangibles | Lab Notes |
|----------|----------|----------|----------|
| Week 0 | Tools & GH Pages Setup | [Hacks](https://github.com/AniCricKet/musical-guacamole/issues/1) | We began our journey in CSA by setting up a new Github Pages. For me, the biggest challenge was getting the theme to work, as it looked wonky and the theme wouldn't cover the whole page. I also had some problems where my index page was looping and I had random characters on my home page which I couldn't locate in my repository. But after a lot of trial and error, I was able to fix these problems and succesfully deploy on AWS.|
| Week 1 | Coding in Java | [Hacks]() | Yet to come! |


<!-- | Week x | Topic goes here | [Hacks]() | Yet to come! | -->