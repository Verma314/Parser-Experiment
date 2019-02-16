# Parser-Experiment
testing out the Jackson parser

### Step 1 
Download these three 'Jackson JAR' files from search.maven.org 
* jackson-core
* jackson-annotations
* jackson-databind

(This is if you're not using Maven, Eclipse etc. If you are, I guess you could just add them to your POM file.)

### Step 2 
Add the JARs to your Java CLASSPATH. This is dependant on your IDE etc.

I do not have an IDE, so I am doing it manually.
I pasted the three JARS into the 'lib' folder on my 'jdk'.

And I had to *literally* add the path to each of the three JARs manually into the environment variables in system properties in windows. This will prolly be easy in Eclipse or something.

https://javarevisited.blogspot.com/2011/01/how-classpath-work-in-java.html#axzz5ffH7br7D 

### Step 3

We gotta use Jackson JSON parser. 
