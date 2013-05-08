maven-groovy-spock-archetype
============================

This is a spin-off fork from prystasj/maven-groovy-spock-archetype, aimed at fixing/upgrading a couple of archetype pom definitions.
Specifically,

    1.    groovy.version property is updated to 1.8.5
    2.    added project.build.sourceEncoding default property as 'utf-8'
    3.    maven-compiler-plugin is upgraded to 3.1
    4.    maven-surefire-plugin is upgraded to 2.14.1
    5.    added includes for **/*Test.groovy and **/*Spec.groovy sources in maven-surefire-plugin configuration

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
* Yeong Sheng, Tan: tanyeongsheng@gmail.com
