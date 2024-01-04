//Project 1 Result Generator System
fun main(){

    println("Welcome to result management system:)")
    println("Enter Your marks here")

    print("Computer Science : ")
    var comsci = readlnOrNull()!!.toInt()

    print("Information Technology : ")
    val it = readlnOrNull()!!.toInt()

    print("Networking and fundamentals : ")
    val naf = readlnOrNull()!!.toInt()

    print("English : ")
    val english = readlnOrNull()!!.toInt()

    print("Maths : ")
    val maths = readlnOrNull()!!.toInt()

    print("Out off ")
    val Outoff = readlnOrNull()!!.toInt()

    var total = comsci+it+naf+english+maths
    var percantage = total*100/Outoff.toDouble()

    println("Total marks of $total")
    println("Total percentage of ${percantage}")

}
