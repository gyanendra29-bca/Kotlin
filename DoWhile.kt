fun main() {
   var x = 0
    do{
        x++
        println(x)
    } while(x < 5)

    do{
        x++
        println(x) // infinite loop
    } while(true)
}