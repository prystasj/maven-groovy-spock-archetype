maven-groovy-spock-archetype
============================

This is a spin-off fork from prystasj/maven-groovy-spock-archetype, aimed at fixing/upgrading a couple of archetype pom definitions.
Specifically,

    1.    cglib.version property is updated to 2.2.2
    2.    groovy.eclipse.compiler.version property is updated to 2.7.0-01
    3.    groovy.version property is updated to 2.1.3
    4.    spock.version property is updated to 0.7-groovy-2.0
    5.    spring.version property is updated to 3.2.2.RELEASE
    6.    added project.build.sourceEncoding default property as 'utf-8'
    7.    maven-compiler-plugin is upgraded to 3.1
    8.    maven-surefire-plugin is upgraded to 2.14.1
    9.    added includes for **/*Test.groovy and **/*Spec.groovy sources in maven-surefire-plugin configuration

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
