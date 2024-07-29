#!/bin/bash

javac ./librarymanagement/*.java
java librarymanagement.Testing
rm -rf ./librarymanagement/*.class
