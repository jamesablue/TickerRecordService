@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  TickerRecordService startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and TICKER_RECORD_SERVICE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\TickerRecordService-micro-0.1.0.jar;%APP_HOME%\lib\spring-boot-starter-thymeleaf-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-devtools-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-web-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-tomcat-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-actuator-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-security-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-data-jpa-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-actuator-1.4.3.RELEASE.jar;%APP_HOME%\lib\jackson-databind-2.8.5.jar;%APP_HOME%\lib\commons-io-2.5.jar;%APP_HOME%\lib\postgres-socket-factory-1.0.8.jar;%APP_HOME%\lib\jdbc-socket-factory-core-1.0.8.jar;%APP_HOME%\lib\google-api-services-sqladmin-v1beta4-rev25-1.22.0.jar;%APP_HOME%\lib\google-api-client-1.22.0.jar;%APP_HOME%\lib\google-oauth-client-1.22.0.jar;%APP_HOME%\lib\google-http-client-jackson2-1.22.0.jar;%APP_HOME%\lib\google-http-client-1.22.0.jar;%APP_HOME%\lib\httpclient-4.5.3.jar;%APP_HOME%\lib\spring-boot-starter-jdbc-1.4.3.RELEASE.jar;%APP_HOME%\lib\postgresql-9.4.1212.jre7.jar;%APP_HOME%\lib\jaxb-api-2.3.0.jar;%APP_HOME%\lib\spring-boot-starter-aop-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-1.4.3.RELEASE.jar;%APP_HOME%\lib\thymeleaf-spring4-2.1.5.RELEASE.jar;%APP_HOME%\lib\thymeleaf-layout-dialect-1.4.0.jar;%APP_HOME%\lib\spring-boot-autoconfigure-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-boot-1.4.3.RELEASE.jar;%APP_HOME%\lib\tomcat-embed-websocket-8.5.6.jar;%APP_HOME%\lib\tomcat-embed-core-8.5.6.jar;%APP_HOME%\lib\tomcat-embed-el-8.5.6.jar;%APP_HOME%\lib\spring-security-config-4.1.4.RELEASE.jar;%APP_HOME%\lib\spring-data-jpa-1.10.6.RELEASE.jar;%APP_HOME%\lib\spring-security-web-4.1.4.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-web-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-security-core-4.1.4.RELEASE.jar;%APP_HOME%\lib\spring-context-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.3.5.RELEASE.jar;%APP_HOME%\lib\hibernate-entitymanager-5.0.11.Final.jar;%APP_HOME%\lib\hibernate-core-5.0.11.Final.jar;%APP_HOME%\lib\javax.transaction-api-1.2.jar;%APP_HOME%\lib\spring-aspects-4.3.5.RELEASE.jar;%APP_HOME%\lib\jackson-annotations-2.8.5.jar;%APP_HOME%\lib\jackson-core-2.8.5.jar;%APP_HOME%\lib\httpcore-4.4.5.jar;%APP_HOME%\lib\commons-codec-1.10.jar;%APP_HOME%\lib\tomcat-jdbc-8.5.6.jar;%APP_HOME%\lib\spring-orm-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-jdbc-4.3.5.RELEASE.jar;%APP_HOME%\lib\jnr-unixsocket-0.18.jar;%APP_HOME%\lib\mysql-connector-java-5.1.40.jar;%APP_HOME%\lib\spring-boot-starter-logging-1.4.3.RELEASE.jar;%APP_HOME%\lib\spring-data-commons-1.12.6.RELEASE.jar;%APP_HOME%\lib\spring-tx-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.3.5.RELEASE.jar;%APP_HOME%\lib\spring-core-4.3.5.RELEASE.jar;%APP_HOME%\lib\snakeyaml-1.17.jar;%APP_HOME%\lib\hibernate-validator-5.2.4.Final.jar;%APP_HOME%\lib\thymeleaf-2.1.5.RELEASE.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.22.jar;%APP_HOME%\lib\logback-classic-1.1.8.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.22.jar;%APP_HOME%\lib\log4j-over-slf4j-1.7.22.jar;%APP_HOME%\lib\slf4j-api-1.7.22.jar;%APP_HOME%\lib\groovy-2.4.7.jar;%APP_HOME%\lib\aspectjweaver-1.8.9.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.0.1.Final.jar;%APP_HOME%\lib\jboss-logging-3.3.0.Final.jar;%APP_HOME%\lib\hibernate-jpa-2.1-api-1.0.0.Final.jar;%APP_HOME%\lib\javassist-3.20.0-GA.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\jandex-2.0.0.Final.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\tomcat-juli-8.5.6.jar;%APP_HOME%\lib\guava-20.0.jar;%APP_HOME%\lib\jnr-enxio-0.16.jar;%APP_HOME%\lib\jnr-posix-3.0.35.jar;%APP_HOME%\lib\jnr-ffi-2.1.4.jar;%APP_HOME%\lib\jnr-constants-0.9.8.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\classmate-1.3.3.jar;%APP_HOME%\lib\ognl-3.0.8.jar;%APP_HOME%\lib\unbescape-1.1.0.RELEASE.jar;%APP_HOME%\lib\xml-apis-1.4.01.jar;%APP_HOME%\lib\jffi-1.2.15.jar;%APP_HOME%\lib\jffi-1.2.15-native.jar;%APP_HOME%\lib\asm-commons-5.0.3.jar;%APP_HOME%\lib\asm-analysis-5.0.3.jar;%APP_HOME%\lib\asm-util-5.0.3.jar;%APP_HOME%\lib\asm-tree-5.0.3.jar;%APP_HOME%\lib\asm-5.0.3.jar;%APP_HOME%\lib\jnr-x86asm-1.0.2.jar;%APP_HOME%\lib\logback-core-1.1.8.jar

@rem Execute TickerRecordService
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %TICKER_RECORD_SERVICE_OPTS%  -classpath "%CLASSPATH%" com.Ticker.Record.Service.Application %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable TICKER_RECORD_SERVICE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%TICKER_RECORD_SERVICE_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
