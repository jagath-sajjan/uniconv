#!/bin/bash

javac AreaTool.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Run the tool using: java Main"
else
    echo "Compilation failed!"
fi