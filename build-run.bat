@echo off

REM Verificar se o arquivo CalculaMediaUnip.jar existe
if exist CalculaMediaUnip.jar (
    REM Deletar o arquivo CalculaMediaUnip.jar
    del CalculaMediaUnip.jar
)

REM Compilar os arquivos Java
javac calcula-media-unip/src/main/*.java calcula-media-unip/src/main/dto/*.java

REM Criar o arquivo JAR
jar cfe CalculaMediaUnip.jar main.Main -C calcula-media-unip/src/ .

REM Executar o arquivo JAR
java -jar CalculaMediaUnip.jar

REM Pausar o prompt de comando antes de fechar
pause
