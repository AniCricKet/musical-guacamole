---
layout: default
---

{%comment%} 
Setup course data
    - Extract data by course
    - Within course create units
{%endcomment%}

{% assign course = site.data[page.course] %} <!-- Load YML data -->
{% assign units = page.units | split: ',' %}
<h1>{{page.title}}</h1>
<br>

{%comment%} 
Load all posts with site
{%endcomment%}

{% assign posts = null | compact %}
{% assign posts = posts | concat:site.posts | concat:site.pages %}

{%comment%} 
<!-- Iterate through Course Units -->
{%endcomment%}

{% for unit in units %}
{% assign unitKey = "Unit" | append: unit %}
{% assign unitData = course[unitKey] %}
<h2>
  {{ unitKey }}: {{ unitData.title }}
</h2>
<p>  {{ unitData.description }} </p>

{% assign start = unitData.start %}
{% assign end = unitData.end %}

{%comment%} 
<!-- Output Column Headings for Blogs -->
{%endcomment%}

<table>
  <tr>
    <th>Week</th>
    <th>Plans</th>
    <th>Hacks</th>
  </tr>

  {%comment%} 
  <!-- These loops group blogs according to Row (week) and Column (category) 
    units = empty array
    sym = value to be used as a separator
    deli = sym forced to array
  -->
  {%endcomment%}

  {% assign units = null | compact %}  
  {% assign sym = "|||" %} 
  {% assign deli = sym | compact %} 

  {% for index in (start..end) -%}
    {% assign plans = null | compact %}
    {% assign hacks = null | compact %}

  {%comment%} 
  <!-- looping through all posts -->
  {%endcomment%}

    {% for post in posts %}
      {% if post.courses[page.course] %}
  {%comment%} 
  <!-- prepare data blog post data for evaluation -->
  {%endcomment%}
        {% assign week = post.courses[page.course].week | tangibles: 0 %}
        {% assign title = post.title | compact %}
        {% assign url = post.url | compact %}

  {%comment%} 
  <!-- process posts for the current week -->
  {%endcomment%}
        {% if week == index %} 

  {%comment%} 
  <!-- organizing blogs by type -->
  {%endcomment%}
          {% if post.type == "plans" %} 
              {% assign plans = plans | unshift: title %}
              {% assign plans = plans | unshift: url %}
          {% elsif post.type == "hacks" %}
              {% assign hacks = hacks | unshift: title %}
              {% assign hacks = hacks | unshift: url %} 
          {% else %}
              {% assign uk = uk | unshift: title %}
              {% assign uk = uk | unshift: url %}     
          {% endif %}

        {% endif %}
      {% endif %}
    {% endfor %}

  {%comment%} 
  <!-- ordering units and inserting column delimiters -->
  {%endcomment%}
  {% assign units = units | concat:plans | concat:deli | concat:hacks  %}

  {%comment%} 
  <!-- This Loop is maximum iterations, since elements are pairs it will decrement an extra time at the end -->
  {%endcomment%}
  <tr>
  <td> {{ index }} </td> 
  <td>
  {% for i in (0..units.size) -%} 
    {% if units.size == 0 %}
      {% break %}
    {% elsif units[0] == sym %} <!-- make a new column -->
  </td>
  <td>
      {% assign units = units | shift %} <!-- remove delimiter -->
    {% else %} <!-- make a link in the column -->
      - <a href="{{site.baseurl}}/{{units[0]}}">{{units[1]}}</a> <br/> 
      {% assign units = units | shift | shift %} <!-- remove title and url -->
    {% endif %}
  {% endfor %}
  </td>
  </tr>
  {% endfor %}

</table>
{% endfor %}

<style>
      h1 {
          font-size: 50px;
          text-align: center;
          margin-top: 50px;
          color: #000000;
      }
      table {
          width: 1000px;
          border-collapse: separate;
          margin: 0 auto;  
          background-color: rgb(217, 238, 255);
      }
      th, td {
          border: 1.5px dashed #000000;
          padding: 10px 10px;
          text-align: center;
          width: 333px;
      }
      th {
          background-color: #333;
          color: #ffffff;
      }
      td {
          color: #000000;
      }
      a {
          color:black;
      }
</style>