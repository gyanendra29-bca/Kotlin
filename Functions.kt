fun main() {
   disp()      // Calling Function
   val total = add()
    println(total)
    val multiplication = multi()
   println(multiplication)
   println("After Function")

}

fun disp(){
    println("Hello Kotlin")
}

fun add(): Int {            // Return type Int
    val a = 10
   val b = 20
   return (a+b)
}
fun multi(): String {            // Return type String
    val a = 10
    val b = 20
    return ("Multiplication = ${a*b}")
}