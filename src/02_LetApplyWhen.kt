/**
 *Let - a null guard
 */
fun returnRectangeMaybe() : Rectangle? {
    return Rectangle(1, 5)
}

fun letDemo() {
    val value = returnRectangeMaybe()
    value?.let {
        println("Returned value's height was ${it.height}")
    }
}

/**
 *Apply
 */
fun applyDemo(): Rectangle? {
    return returnRectangeMaybe()?.apply {
        height = width
    }
}

/**
 *When - crazy switch case.
 * Imagine printing, throwing exceptions, and performing other functions ALL from the same swictch-case-ish block
 */
fun whenDemo() {
    when(returnRectangeMaybe()) {
        null -> throw Exception("string is null!")
        Rectangle(1, 5) -> println("All as expected")
        else -> println(applyDemo())
    }

    when {
        returnRectangeMaybe()?.height == 5-> print(5)
        returnRectangeMaybe() == null -> throw Exception()
    }
}

fun main(args: Array<String>) {
    whenDemo()
    letDemo()
    applyDemo()
}

data class Rectangle(var height: Int, var width: Int)


