#!/bin/bash

javac ./inventory/*.java
java inventory.Testing
rm -rf ./inventory/*.class
