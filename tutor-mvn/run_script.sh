#!/usr/bin/env bash
mvn clean compile assembly:single && 
java -jar target/tutor-mvn-1.0-SNAPSHOT-jar-with-dependencies.jar

# mvn dependency:tree