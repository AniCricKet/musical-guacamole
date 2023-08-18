---
layout: default
title: Student Blog
---

<html>

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

</html>

Please follow me on [Github](https://github.com/AniCricKet) 😁😁!!