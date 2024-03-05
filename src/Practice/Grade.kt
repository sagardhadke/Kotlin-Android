package Practice
    //Grade system Using if else
    fun main() {
        print("Enter Your Marks: ")
        val number = readln().toInt()

        val grade : Char = if (number>=80 && number<=100){
            'A'
        }else if (number>=60 && number<=79){
            'B'
        }else if (number>=35 && number<=59){
            'C'
        }else{
            'F'
        }
        println(grade)
    }
