fun main(){

    //enum means user define

    println("Today is: "+Days.MONDAY)

    for (hol in Days.values()){
            if (hol.holiday){
                println("$hol is a holiday")
            }
    }

}

enum class Days(val holiday: Boolean = false){
    SUNDAY (true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)
}