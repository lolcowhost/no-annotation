# @NoAnnotation annotation

[![Cloudsmith](https://api-prd.cloudsmith.io/v1/badges/version/red_mvn/lolcowhost/maven/no-annotation/latest/a=noarch;xg=com.lolcowhost/?render=true&show_latest=true)](https://cloudsmith.io/~red_mvn/repos/lolcowhost/packages/detail/maven/no-annotation/latest/a=noarch;xg=com.lolcowhost/)
![Sonatype](https://lift.sonatype.com/api/badge/github.com/lolcowhost/no-annotation)


Tired of seeing all those classes with dozens of annotations? 
Want to signal your fellow coders that a class should not be bloated with annotations?
Use the `@NoAnnotation` annotation!

## How to use

Annotate your class
```java
import com.lolcowhost.no.annotation.NoAnnotation;

@NoAnnotation
@ReplacesOneLineOfCode
@CreateEnormousStackTrace
class MySuperClass {
    
}
```
This will clearly indicate that all annotations have to be removed.
```
Compilation failure
Class MySuperClass cannot be annotated.
```

[See the example usage repository](https://github.com/lolcowhost/no-annotation-example/) 

**Note:** You can use `@NoAnnotation(strict = false)` to allow classes to be annotated with `@NoAnnotation`. 

## But... but annotations are cool.

No they are not. Just take a look at what ChatGPD has to say about them.

> 1. Annotations can increase complexity and make the code harder to read and understand.
> 2. Annotations can lead to over-engineering, where developers use annotations excessively, making the code harder to maintain and debug.
> 3. Annotations can affect performance, as they require extra processing time and may cause additional memory consumption.
> 4. Annotations may not always be compatible with earlier versions of Java and may need to be updated with each new release.


## Are you serious?

No
