package k_1_4

import kotlin.reflect.full.allSupertypes
import kotlin.reflect.full.starProjectedType
import kotlin.reflect.full.superclasses
import kotlin.reflect.jvm.jvmErasure
import kotlin.reflect.jvm.jvmName
import kotlin.reflect.typeOf
import kotlin.system.measureTimeMillis

fun main() {
//    testTypeOf<Int>()
//    testTrimMargin()
//    testTime()
//    testTailRec()
//    testGeneric()
//    testPoiFun(age = 1, str = "haha")
}

fun <T> elvisLike(x: T, y: T & Any): T & Any = x ?: y


fun testReflect() {
}

fun testPoiFun(str: String, age: Int) {

}

fun testGeneric() {
    println(GenericB::class.supertypes[0].arguments)
}

fun testTime() {
    val sTime = measureTimeMillis {
        Thread.sleep(100)
    }
    println(sTime)
}

fun testTrimMargin() {
    val tString = """
                |hello
      |world  
    """.trimMargin()
    println(tString)
}

inline fun <reified T> testTypeOf() {
    val kType = typeOf<T>()
    println(::returnIntType.returnType == kType)
}

fun returnIntType(): Int {
    return 1
}

open class A {
    open fun foo(count: Int) { // Note: open & tailrec modifiers
        println("A.foo($count)")
        if (count > 0) foo(count - 1)
    }
}

class B : A() {
    override fun foo(count: Int) {
        println("B.foo($count)")
    }

    fun callSuperFoo(count: Int) = super.foo(count)
}

fun testTailRec() {
    B().callSuperFoo(3)
}

open class GenericA<T> {

}

class GenericB : GenericA<String>() {

}