#!/bin/bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:/Users/playclips/maven/apache-maven-3.9.8/bin:/Users/playclips/homebrew/Cellar/docker-compose/2.28.1/bin:$PATH
mvn clean package


