#!/usr/bin/env bash
# Thank to plugin 'maven-compiler-plugin', just to run it using follow one command
mvn compile && mvn exec:java
# mvn dependency:tree