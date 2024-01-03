fun main(){
    // variable in kotlin

    // String => " "
    // Int => -2147483648 To 2147483647
    // float => 3.4e-038 To 3.4e to 038
    // Double =>  1.7e-308 To 1.7e 308
    // Char => 'a-z' & 'A-Z'
    // Short =>  -32,768 To 32,767
    // long => -9,223,372,036,854,775,808 To 9,225,036,854,775,807
    // Byte => -128 To 127
    // Boolean => True and false

    //Find any value using this steps

   val intmin : Int = Int.MIN_VALUE
   val intmax : Int = Int.MAX_VALUE
    println("Total value of Min is $intmin") //-2147483648
    println("Total value of Max is $intmax") //2147483647

    //String
    var myName = "Sagar Dhadke"
    myName = "Hey"
    println(myName)

}