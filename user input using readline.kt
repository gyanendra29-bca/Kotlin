fun main() {
    println("enter the name")
    val name = readLine()
    val num = readLine() !!.toInt() //typecasting string to int because by default readline understand string data type
    println(name)
    println(num)
    println("name " +name!!::class.simpleName)//this statement to use know which data type is.
    println("num " +num!!::class.simpleName)
}