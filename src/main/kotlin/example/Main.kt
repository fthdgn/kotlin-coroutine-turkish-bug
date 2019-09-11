@file:JvmName("Main")

package example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.*

fun main() {
    runBlocking {
        println(Locale.getDefault())
        println("i".toUpperCase())
        val a = JavaHolder(getInt())
        println(a.a)
    }
}

suspend fun getInt(): Int {
    delay(50)
    return 5
}
