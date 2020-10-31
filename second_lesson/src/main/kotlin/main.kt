fun main(args: Array<String>) {
    menu(name = "миша")
    menu(name = "миша")
}

fun swap()  {
    var a = 10
    var b = 20

    var v = a
    a = b
    b = v

    println("a=$a b=$b") // a=20 b=10

}

fun menu(name: String) {
    println("привет, $name !!!")
    println("+------------------------------+")
    println("|             меню             |")
    println("|      1.поменять местами      |")
    println("|           0.выход            |")
    println("+------------------------------+")
    println("введите число")
}

fun sum(a: Int, b: Int): Int {
    var c:Int = a + b
    return c
}


