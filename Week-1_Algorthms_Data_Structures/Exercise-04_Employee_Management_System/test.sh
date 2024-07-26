#!/bin/bash

javac ./employeemanagement/*.java
java employeemanagement.Testing
rm -rf ./employeemanagement/*.class
