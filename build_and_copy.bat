@echo off


set "project_path=C:\project"


set "libs_dir=build\libs"


del /Q "%libs_dir%\*.jar"


call gradle build


if exist "%libs_dir%\*.jar" (
    rem Skopiowanie pliku *.jar do katalogu project
    copy "%libs_dir%\*.jar" "%project_path%"
    echo Plik *.jar został skopiowany do katalogu project.
) else (
    echo Błąd kompilacji: plik *.jar nie został wygenerowany.
)

pause