@echo off
echo Build started
g++ Main.cpp -o Main && ( 
    echo Build completed
    echo Running...
    Main.exe
    g++ TestOutput.cpp -o TestOutput
    TestOutput.exe
    for /f "tokens=* delims=" %%x in (testresult.txt) do echo %%x
) || (
    echo Build failed
)

