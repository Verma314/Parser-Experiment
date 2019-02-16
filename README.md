# Parser-Experiment
testing out the Jackson parser

I looked at a couple of JSON parsers like, org.json, GSON, Jackson. And I think Jackson is pretty good.

### Step 1 
Download these three 'Jackson JAR' files from search.maven.org 
* jackson-core
* jackson-annotations
* jackson-databind

(This is if you're not using Maven, Eclipse etc. If you are, I guess you could just add names and versions of these files to your POM file, and it will set them up for you;)

### Step 2 
[Skip this step if you use Maven]
Add the JARs to your Java CLASSPATH. This is dependant on your IDE etc.

I do not have an IDE, so I am doing it manually.
I pasted the three JARS into the 'lib' folder on my 'jdk'.

And I had to *literally* add the path to each of the three JARs manually into the environment variables in system properties in windows. This will prolly be easy in Eclipse or something.

https://javarevisited.blogspot.com/2011/01/how-classpath-work-in-java.html#axzz5ffH7br7D 

### Step 3

We gotta use Jackson JSON parser. 

What you wanna do is read the JSON file, into a **tree model**.  I don't think you need the ObjectMapper.
This article explains how to use the tree model really well:
https://dzone.com/articles/processing-json-with-jackson
and also explains how to set up Jackson.

The rest of the documentation is here:
https://fasterxml.github.io/jackson-core/javadoc/2.8/com/fasterxml/jackson/core/JsonParser.html
