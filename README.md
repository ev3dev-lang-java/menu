# ev3dev.menu

## Motivation

EV3 Brick is the third generation of LEGO Mindstorms with the enough CPU & Memory to
run a complete `Debian distro` and a `JVM`.

When you run a program in Java, you open a terminal and type:

```
java -jar ./yourJar.jar
```  

But when you are in a competition like FLL, you need some utility to load programs easily and
this project try to tackle this problem.

## Goals

- [x] Run a Jar from another Jar
- [ ] Develop a UI to load files in a default folder from EV3
- [ ] Download files from github repos and run
- [ ] Package in the same program (JRI, Program, Dependencies) [JEP 343](https://openjdk.java.net/jeps/343)

## Initial works

Currently, it is possible to execute a Jar from another Jar.
Build the project:

```
mvn clean package
```

and copy the jar from `target` folder to `docs` and execute it from there.
In the folder docs, exist a jar created for the example `demo.jar`

```
java -jar menu-0.1.0-SNAPSHOT.jar
Running another jar
Hello World
```

## References

- http://lejos.org/
- https://sourceforge.net/p/lejos/ev3/code/ci/master/tree/EV3Menu/src/lejos/ev3/startup/JarMain.java
- https://openjdk.java.net/jeps/343