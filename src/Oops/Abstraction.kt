package Oops

abstract class A{
    abstract fun hello()
    /* at least one function abstract  */
    fun hello2(){
        println("Hey How Are You Bro :)")
    }
}

class B : A(){
    override fun hello() {
        println("Good Night...")
    }

}
fun main(){
    val obj =B()
    obj.hello()
    obj.hello2()
}