#!/bin/bash

javac ./taskmanagement/*.java
java taskmanagement.Testing
rm -rf ./taskmanagement/*.class
