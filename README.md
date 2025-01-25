# ansroid-auto-tagger
This is a 'TAG' interface.

## how to use
This is available through   [JitPack](https://jitpack.io/#Dirtfy/ansroid-auto-tagger).

```kotlin
import com.dirtfy.tagger.Tagger

class ClassA: ParentClass, Tagger {

  fun functionA() {
    // Tag format would be "[class name].[function name]"
    println("$TAG : tagger test")
    // In this case, it would be "ClassA.functionA"
  }
}
```

## notice
The function name in the tag might differ from what you expect because it is derived from the current thread's stack trace.
