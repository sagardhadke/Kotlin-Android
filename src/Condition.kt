fun main(){

    // if-else statements

    var Bank_Name = "Sagar Bank Of India"

    if (Bank_Name=="Sagar Bank Of India"){
        println("$1002 Receive on your account")
    }else{
        println("Bank Name invalid")
    }

    //when statement

    val day = "Wednesday"
    when(day){
        "Sunday" -> println("Today is Sunday")
        "Monday" -> println( "Today is Monday")
        "Tuesday" -> println("Today is Tuesday")
        "Wednesday" -> println("Today is Wednesday")
        "Thursday" -> println("Today is Thursday")
        "Friday" -> println("Today is Friday")
        "Saturday" -> println("Today is Saturday")
        else -> println("Invalid Day")
    }

}