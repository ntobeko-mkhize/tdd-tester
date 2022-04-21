# tdd-tester

Author: @ntobeko-mkhize

A Java based project demonstrating Test Driven Development (TDD) using [Junit5](https://junit.org/junit5/docs/current/user-guide/).

## Environment Setup

### Windows
1. Download and install [Java 8 JDK](https://www.oracle.com/java/technologies/downloads/#java8).
2. [Configure JAVA_HOME](https://stackoverflow.com/questions/2619584/how-to-set-java-home-on-windows-7) environment variable.
3. Download Maven [3.8.5](https://maven.apache.org/download.cgi#files) (*make sure to get the Binary and not the source*).
4. [Install and Configure maven](https://maven.apache.org/install.html) in PATH environment variable.

### Linux
TODO
### Mac
TODO

## Running the project

### Run in terminal

This is the simplest way to run the project, and can be useful to check whether your base envirnment has been configured correctly

1. Create a new directory for you workspace (`$Workspace`)
2. Run `git clone https://github.com/ntobeko-mkhize/tdd-tester.git`
3. `cd $Workspace/tdd`
4. Build your project `mvn clean install`
5. To run only the tests `mvn test`. Note you must first run a `mvn clean install` at least once before.

This should trigger the [maven test](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#build-lifecycle-basics) lifecycle. The output should look similar to 
```
[INFO] Scanning for projects...
[INFO]
[INFO] ----------------------< za.co.ntobeko:tdd-tester >----------------------
[INFO] Building tdd-tester 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ tdd-tester ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ tdd-tester ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ tdd-tester ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ tdd-tester ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M6:test (default-test) @ tdd-tester ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running za.co.ntobeko.ee.StoreFrontTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.185 s - in za.co.ntobeko.ee.StoreFrontTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.486 s
[INFO] Finished at: 2022-04-21T13:25:08+02:00
[INFO] ------------------------------------------------------------------------
```
### Run inside IDE

#### Eclipse

> Eclipse IDE offers support for the JUnit Platform since the Eclipse Oxygen.1a (4.7.1a) release.

1. Download and install [Eclipse](https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-java-developers)
2. Confige Java JRE - set as the *JDK* we installed during [setup](https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-java-developers)
3. Configure Maven Installation - set as the JDK we installed during [setup](https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-java-developers)

To learn how to run your unit test insise Eclipse you can refer this [JUnit 5 with Eclipse](https://www.eclipse.org/eclipse/news/4.7.1a/#junit-5-support)

#### IntelliJ
TODO

#### VSCode
TODO
