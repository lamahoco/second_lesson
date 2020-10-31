fun main(args: Array<String>) {
    menu()
}

fun swap()  {
    var a = 10
    var b = 20

    var v = a
    a = b
    b = v

    println("a=$a b=$b") // a=20 b=10
}

fun menu() {
    println("+------------------------------+")
    println("|             меню             |")
    println("|      1.поменять местами      |")
    println("|           0.выход            |")
    println("+------------------------------+")
}



