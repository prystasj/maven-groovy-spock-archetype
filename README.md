maven-groovy-spock-archetype
============================

A Maven archetype for a project that will use Groovy and the Spock testing framework.

To make the archetype available locally, until an artifact is made available, check it out and install with:
  
    $ git clone git@github.com:prystasj/maven-groovy-spock-archetype.git
    $ cd maven-groovy-spock-archetype
    $ mvn install

To create an instance of the archetype after it is installed:

    $ mvn archetype:generate -DarchetypeGroupId=org.stash.maven.archetypes \
                             -DarchetypeArtifactId=maven-groovy-spock-archetype \
                             -DarchetypeVersion=0.1-SNAPSHOT

After adding the coordinates, you should have a project structure containing one Groovy source file and one Spock specification:

    .
    +-- pom.xml
    \-- src
        +-- main
        |   +-- groovy
        |      +-- package
        |           +-- Adder.groovy
        \-- test
            +-- groovy
                +-- package
                    +-- AdderSpec.groovy

To try it out, simply run:

    $ mvn install

Please send any feedback/questions/complaints to:

* John Prystash: stash1071@yahoo.com
