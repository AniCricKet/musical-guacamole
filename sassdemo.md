---
toc: true
comments: true
layout: post
title: SASS Demo
permalink: /sassdemo/
courses: {csa: {week: 18} }
type: hacks
---
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Joke Page</title>
</head>
<body>
    <div class="container">
        <h1>Joke of the Day</h1>
        <div class="joke" id="joke-container">
            <!-- Jokes will be dynamically added here using JavaScript -->
        </div>
        <button onclick="fetchJoke()">Get Joke</button>
    </div>
    <script>
        async function fetchJoke() {
            const jokeContainer = document.getElementById('joke-container');
            const response = await fetch('https://official-joke-api.appspot.com/random_joke');
            const joke = await response.json();
            jokeContainer.innerHTML = `<p>${joke.setup}</p><p>${joke.punchline}</p>`;
        }
    </script>
    <script src="script.js"></script>
</body>
</html>
