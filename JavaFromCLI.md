# Build A Project from the Command Line

- Ensure that java version and jar command is in your $PATH
- then to run a simple java program from a specified directory (e.g. classes)
```java
java -version
java -cp classes myfirstapp.MyJavaApp
```

Javac is the compiler used from the Java SE Development Kit to compile Java source files
- *bootclasspath* is used to load/use specific APIs
- *d* option is used to tell the compiler where to put the combined class
 
```java
javac -target 1.3 -source 1.3
-bootclasspath ../../lib/cldc_10.jar;../../lib/midp2.0.jar 
-d tmpclasses
src/*.java
```

For more information about javac there is a man and help page in addition to the Java SE Documentation

```java
\\ there is also the preverfication process afterwards
preverify -classpath <classPath> -d <output-directory>
```
- Preverify, verifies the compiled class files


"As a result of this command, preverified class files are placed in the classes directory. 
If your application uses WMA, MMAPI, or other versions of CLDC or MIDP, 
be sure to include the relevant .jar files in the classpath."

