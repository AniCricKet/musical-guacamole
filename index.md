---
layout: default
title: Student Blog
---

<html lang="{{ site.lang | default: "en-US" }}">
  <head>
    <meta charset="UTF-8">

{% seo %}
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="preload" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700&display=swap" as="style" type="text/css" crossorigin>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="theme-color" content="#157878">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <link rel="stylesheet" href="{{ '/assets/css/style.css?v=' | append: site.github.build_revision | relative_url }}">
    {% include head-custom.html %}
  </head>
  <body>
    <a id="skip-to-content" href="#content">Skip to the content.</a>

    <header class="page-header" role="banner">
      <h1 class="project-name">{{ page.title | default: site.title | default: site.github.repository_name }}</h1>
      <h2 class="project-tagline">{{ page.description | default: site.description | default: site.github.project_tagline }}</h2>
      {% if site.github.is_project_page %}
        <a href="{{ site.github.repository_url }}" class="btn">View on GitHub</a>
      {% endif %}
      {% if site.show_downloads %}
        <a href="http://127.0.0.1:4000/caveman/" class="btn">Home</a>
        <a href="{{ site.github.zip_url }}" class="btn">Download .zip</a>
        <a href="{{ site.github.tar_url }}" class="btn">Download .tar.gz</a>
      {% endif %}
    </header>

    <main id="content" class="main-content" role="main">
      {{ content }}

      <footer class="site-footer">
        {% if site.github.is_project_page %}
          <span class="site-footer-owner"><a href="{{ site.github.repository_url }}">{{ site.github.repository_name }}</a> is maintained by <a href="{{ site.github.owner_url }}">{{ site.github.owner_name }}</a>.</span>
        {% endif %}
        <span class="site-footer-credits">This page was made by <a href="https://github.com/AniCricKet">Aniket Chakradeo</a>.</span>
      </footer>
    </main>
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