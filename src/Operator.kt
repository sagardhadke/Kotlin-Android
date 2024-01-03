fun main(){

    val a = 5
    val b = 3

    val result = a+b
    println("A and B Result is $result")    // 1 method
    println("A and B Resukt is ${a+b}")     //2 method

    //Arithmetic Operators

    println("Arithmetic Operators")
    println(a+b)
    println("Subtraction of a and b is ${a-b}")
    println("a * b = ${a*b}")
    println("a / b = ${a/b}")
    println("a % b = ${a%b}")

    //increment and decrement
    var x = 4

    println(x++)    //4
    println(++x)    //6
    println(++x)    //7
    println(x)       //7

    //Decrement

    var y = 9
    println(y--) //9
    println(--y) //7
    println(--y) //6
    println(y--) //6
    println(y)  //5

}