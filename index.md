---
layout: default
title: Aniket's Mojo Dojo Casa House
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

One of my favorite hobbies is watching and <span style="position: relative; display: inline-block;"><a href="https://anicricket.github.io/musical-guacamole/games" style="color: transparent; text-decoration: none; position: absolute; width: 100%; height: 100%; left: 0; top: 0; z-index: 1;">playing</a><span style="z-index: 0;">playing</span></span> soccer. Here are my three favorite players:

Lionel Andrés Messi Cuccittini, Neymar da Silva Santos Junior, and Pedro "Pedri" Gonzalez   


![]({{ site.baseurl }}/images/messisquare.png "Image of Lionel Messi"){: height="300px" width="250px"}.
![]({{ site.baseurl }}/images/neymarsquareGIF.gif "GIF of Neymar Jr"){: height="300px" width="250px"}.
![]({{ site.baseurl }}/images/pedrisquare.jpeg "Image of Pedri"){: height="300px" width="250px"}.

<p style="text-align: center;">Here is my Scrum Table for Equipo de No Papeles</p>

![Scrum Manifesto](/musical-guacamole/images/ScrumTable.png "Scrum Manifesto")