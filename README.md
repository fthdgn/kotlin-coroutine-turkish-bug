#### kotlin-coroutine-turkish-bug

* Change the language of your PC to Turkish.
* Run `./gradlew runMain`
* It throws the exception below on runtime.   
  `Exception in thread "main" java.lang.NoSuchMethodError: kotlin.coroutines.jvm.internal.Boxing.box?nt(I)Ljava/lang/Integer;`   
  or   
  `Exception in thread "main" java.lang.NoSuchMethodError: kotlin.coroutines.jvm.internal.Boxing.boxİnt(I)Ljava/lang/Integer;`
* The reason probably is broken code generation. In Turkish the upper case of 'i' is 'İ'. The compiler generates wrong code.
