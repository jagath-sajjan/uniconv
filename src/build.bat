@echo off

REM Compile the Java program
javac AreaTool.java

REM Check if compilation was successful
IF %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
) ELSE (
    echo Compilation successful!
    echo Run the tool using: java AreaTool
)
