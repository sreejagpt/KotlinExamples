/**
 *Nothing is an uninhabited type, which means that no
 * value can have this type at runtime, and it’s also a subtype of every other class.
 *
 * Methods that only throw Exceptions can have a return type of Nothing
 *
 *Because every object is derived from Nothing, any method can throw an exception
 **/

fun returnsNothing(): Nothing {
//    throw Exception("I returned Nothing")
}

fun demoNothing(): Int {
    returnsNothing()

    println("Compiler throws a warning because this statement is unreachable")

    return 0
}

/**
 *All objects extend from Any
 */
fun main(args: Array<String>) {
    demoNothing()
    val intObject = 90
    println((intObject is Any))
}


