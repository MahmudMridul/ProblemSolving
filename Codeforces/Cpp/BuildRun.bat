@echo off

set fileName=%1

cls
echo Build started
g++ %fileName% -o currentFile && ( 
    echo Build completed
    echo Running...
    currentFile.exe
    echo Done
) || (
    echo Build failed
)

