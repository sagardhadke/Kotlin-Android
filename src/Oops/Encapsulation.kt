package Oops

class Calculation() {
    //data members
    var num1 = 25
    var num2 = 30

    //members function

    fun add(){
        println("Sum of these numbers is = ${num1 + num2}")
    }

    fun subtract(){
        println("Subtraction of these number is = ${num1 - num2}")
    }

}
fun main(){

    val obj = Calculation()
    obj.add()
    obj.subtract()


}