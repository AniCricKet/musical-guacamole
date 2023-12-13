async function fetchJoke() {
    const jokeContainer = document.getElementById('joke-container');
    const response = await fetch('https://official-joke-api.appspot.com/random_joke');
    const joke = await response.json();

    jokeContainer.innerHTML = `<p>${joke.setup}</p><p>${joke.punchline}</p>`;
}