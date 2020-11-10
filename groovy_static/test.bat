@echo off
java -Xmx64m -Xms64m -cp .;%GROOVY_HOME%\lib\groovy-4.0.0-SNAPSHOT.jar MonteCarloPI
