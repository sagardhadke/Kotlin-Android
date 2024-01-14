package Practice

fun main(){

    //if-else
    var electricity = false
    if (electricity){ //by default value is true
        println("You Can turn on your Pc/Laptop")
    }else{
        println("You can't run Pc/Laptop you don't have electricity")
    }

    var days = "Sunday" //9:40Pm 14/1/2024

    when(days){
        "Sunday" -> println("Today is Sunday")
        "Monday" -> println("Today is Monday")
        "Tuesday" -> println("Today is Tuesday")
        "Wednesday" -> println("Today is Wednesday")
        "Thursday" -> println("Today is Thursday")
        "Friday" -> println("Today is Friday")
        "Saturday" -> println("Today is Saturday")
    }


}