fun main(){

    //enum means user define

    println("Today is: "+Days.MONDAY)

    //find holiday using enum class
    for (hol in Days.values()){
            if (hol.holiday){
                println("$hol is a holiday")
            }
    }

    //finding gender using enum class
    for(fg in Gender.values()){
        if (fg.findGender){
            println("$fg is Boy")
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

enum class Gender(val findGender :Boolean = false){

    Male(true),
    Female,
    Other
}