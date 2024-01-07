package Oops
//Inheritance
open class Parent(){
        fun parClass(){
            println("Car")
            println("Home")
            println("Bike")
            println("Property")
        }
}

class Child() : Parent(){
    fun childClass(){
        println("Books")
        println("Watch")
        println("Laptop/Pc/Mobile")
    }
}
fun main(){

    var obj = Child()
    obj.childClass()
    obj.parClass()
}