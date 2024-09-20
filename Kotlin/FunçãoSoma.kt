fun main() {
  var a = 5
  var b = 6
  var soma = 0
  soma = a + b
  println("A soma é $soma")
}

//OU

fun main() {
    println(soma(5,7))
    println(soma(5))
}
fun soma(a:Int, b:Int=1): Int{
    return (a+b)
}

