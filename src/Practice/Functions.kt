package Practice

fun add(a:Int,b:Int) : Int{
    val addition = a+b
    return addition
}

fun max(x:Float,y:Float) : Float{
    val findMax = if (x>y) x else y
    return findMax
}
fun main(){

    println("Addition of a and b is ${add(20,65)}")
    println("MAx value is ${max(2.0f,6.2f)}")

}