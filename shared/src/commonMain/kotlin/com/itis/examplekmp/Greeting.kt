package com.itis.examplekmp

import kotlin.jvm.JvmInline

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}
//
//fun main() {
//
//    val array = listOf("asdasd")
//
//    var array2 = mutableListOf("asdasd")
//
//    test(bookId = 0, authorId = 0, testId = 0)
//}
//
//fun test(
//    bookId: BookId,
//    authorId: AuthorId,
//    testId: TestId,
//) {
//
//}
//
//
//
//@JvmInline
//value class BookId(val id: Int) {}
//
//@JvmInline
//value class AuthorId(val id: Int) {}
//
//@JvmInline
//value class TestId(val id: Int) {}
