fun main() {
//    newYear(year = 2024)


//project using function

    val internet = true
    if (!internet){
        println("OOps internet connection not found please check your internet!!!")
    }else{
        newYear(2024)
        getData()
    }

   println(add(6,85))
    println(max(56,52))



}

fun add(a : Int, b :Int) : Int{
    val sum = a+b
    return sum
}

fun max(x: Int, y : Int) : Int{
       val max = if (x>y) x else y
        return max
}


fun getData(){
    println("Hey Welcome To Android Kotlin Basic to Advance Series")
    println("I Hope You Love this project:)")
}

fun newYear(year: Int) {
    println("Happy New Year!!! $year")
}


