/**
 * Fun with templating strings!
 */

fun templateDemo() {
    val rectangle = Rectangle(10, 50)
    println("The width of the rectangle is ${rectangle.width} and the area is ${rectangle.width * rectangle.height}")
}

fun main(args: Array<String>) {
    templateDemo()
}
