package Oops

fun poly(a:Int,b:Int) : Int{
    return a+b
}

fun poly(a:Float,b:Float): Float{
    return a*b
}
fun main(){
    println(poly(5,2))
    println(poly(2.0f,5.3f))

}