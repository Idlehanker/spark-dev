#!/usr/bin/env bash
mvn clean &&
mvn compile  &&
mvn exec:java
