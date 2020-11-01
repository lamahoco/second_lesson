fun main(args: Array<String>) {
    var a = 30
    var b = 40
    println("$a,$b")
    menu("misha")
    var w = read()
    if (w == "1"){
        swap(a,b)
    }
}

fun swap(c:Int,d:Int)  {
    var v = c
    var c = d
    var d = v
    print("$c,$d")
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

fun read(): String {
    var f: String? = readLine()
    if (f == null) {
        return ""
    }
    else {
        return f
    }
}















