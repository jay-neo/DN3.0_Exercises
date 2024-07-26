#!/bin/bash

javac ./ecommerce/*.java
java ecommerce.Testing
rm -rf ./ecommerce/*.class
