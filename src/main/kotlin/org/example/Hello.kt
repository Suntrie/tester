package org.example

fun whoAreInBoth(a: List<String>, b: List<String>): List<String> {
    a.toSet()
    b.toSet()
    val ans = mutableSetOf<String>()
    for (name in a) if (name in b) ans += name
    return ans.toList()
}

fun main(args: Array<String>) {
    val a = mapOf(1 to 1)
    val b = mapOf(1 to 1)

    for ((key, _) in a) if (a[key] != b[key]) println("Hello, World")
    println(null==null)
}

