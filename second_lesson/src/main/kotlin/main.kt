fun main(args: Array<String>) {
    swap()
}

fun swap()  {
    var a = 10
    var b = 20

    var v = a
    a = b
    b = v

    println("a=$a b=$b") // a=20 b=10
}




