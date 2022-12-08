@echo off
echo Build started
g++ checkOutput.cpp -o checkOutput && ( 
    echo Build completed
    echo Running...
    checkOutput.exe 
) || (
    echo Build failed
)


