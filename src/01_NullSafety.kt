/**
 * By default a variable cannot be null
 */
fun getStringMaybe(): String? {
    val myName: String
//    return "string"
//    myName = null //compiler warning!
    return null
}

fun main(args: Array<String>) {
    val lengthPlus14 = getStringMaybe()?.length?.plus(14)
}