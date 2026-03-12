
@ECHO OFF
SETLOCAL ENABLEDELAYEDEXPANSION

SET WRAPPER_DIR=.mvn\wrapper
SET WRAPPER_JAR=%WRAPPER_DIR%\maven-wrapper.jar
SET WRAPPER_URL=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.2/maven-wrapper-3.3.2.jar

IF NOT EXIST %WRAPPER_DIR% (mkdir %WRAPPER_DIR%)
IF NOT EXIST %WRAPPER_JAR% (
  ECHO Downloading Maven Wrapper JAR from %WRAPPER_URL%
  powershell -Command "& {\$wc = New-Object System.Net.WebClient; \$wc.DownloadFile('%WRAPPER_URL%', '%WRAPPER_JAR%')}"
)

SET JAVA_EXE=java
IF DEFINED JAVA_HOME (
  SET JAVA_EXE=%JAVA_HOME%in\java.exe
)

"%JAVA_EXE%" -classpath %WRAPPER_JAR% org.apache.maven.wrapper.MavenWrapperMain %*
