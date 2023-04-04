# @NoAnnotation annotation

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

**Note:** You can use `@NoAnnotation(strict = false)` to allow classes to be annotated with `@NoAnnotation`. 

## But... but annotations are cool.

No they are not. Just take a look at what ChatGPD has to say about them.

> 1. Annotations can increase complexity and make the code harder to read and understand.
> 2. Annotations can lead to over-engineering, where developers use annotations excessively, making the code harder to maintain and debug.
> 3. Annotations can affect performance, as they require extra processing time and may cause additional memory consumption.
> 4. Annotations may not always be compatible with earlier versions of Java and may need to be updated with each new release.


## Are you serious?

No
