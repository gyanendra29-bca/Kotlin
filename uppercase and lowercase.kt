import java.util.Scanner

fun main() {
    val sc=Scanner(System.`in`)
    println("enter value")
    val name = sc.nextLine()
    println("uppercase =${name.uppercase()}")
    val name2=sc.nextLine()
    println("lowercase=${name2.lowercase()}")
}