/**
 * Deprecation Levels for APIs and Libraries
 **/

@Deprecated(level = DeprecationLevel.ERROR,
        message = "We definitely don't use this api call anymore!",
        replaceWith = ReplaceWith("semiOldFunction()"))
fun superOldFunction(): String {
    return "super old"
}

@Deprecated(level = DeprecationLevel.WARNING,
        message = "We don't use this api call anymore!",
        replaceWith = ReplaceWith("slightlyNewerFunction()"))
fun semiOldFunction(): String {
    return "semi old"
}

@Deprecated(level = DeprecationLevel.HIDDEN,
        message = "We hide this api call from new modules but any old runtime dependencies still work!",
        replaceWith = ReplaceWith("slightlyNewerFunction()"))
fun hiddenFunction(): String {
    return "hidden function"
}

fun slightlyNewerFunction(): String {
    return "slightly newer function"
}

fun main(args: Array<String>) {
    val superOld = superOldFunction()
    val semiOld = semiOldFunction()
    val hidden = hiddenFunction()
}

