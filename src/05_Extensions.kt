/**
 * Add extensions to classes
 **/

fun String.repeat(): String {
    return this + " " + this
}

fun main(args: Array<String>) {
    println("stop copying me".repeat())
}