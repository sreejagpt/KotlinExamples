/**
 * Remember how in Java you would have to
 * typecheck something and then cast it to
 * the type you were checking for??
 * Kotlin does.
 **/
fun smartCastDemo(obj: Any) {
    if (obj is String) {
        print(obj.length) //obj autocast to string
    }
}