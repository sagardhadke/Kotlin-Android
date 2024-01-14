package Practice

fun main(){

    //Arithmetic Operators

    /*
    * + addition
    * - subtraction
    * * multiplication
    * / division
    * % modules */

//    var a = 5
//    var b = 10
//    println(a+b)
//    println(a-b)
//    println(a*b)
//    println(a/b)
//    println(a%b)

    //Relational Operators

    /*
    * < less than
    * > greater than
    * <= less than equal to
    * >= greater than equal to
    * == equal and equal to
    * != not equal to*/

//    var x = 6
//    var y = 10
//
//    println(x<y)
//    println(x>y)
//    println(x<=y)
//    println(x>=y)
//    println(x==y)
//    println(x!=y)

    //Logical Operator

    /*
    * && and
    * || our
    * != not*/

    val internet = true
    val wifi = false
    val mobileData = false

    if (internet && wifi || internet&&mobileData){
        println("Internet is on")
    }else if (internet!=true){
        println("404 No Internet Connection.")
    }else{
        if (mobileData||wifi){
            println("You can Browse the internet")
        }
    }

}