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

}

fun getData(){
    println("Hey Welcome To Android Kotlin Basic to Advance Series")
    println("I Hope You Love this project:)")
}

fun newYear(year: Int) {
    println("Happy New Year!!! $year")
}