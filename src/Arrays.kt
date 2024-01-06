fun main(){

    //Arrays
    val name  = arrayOf("Mango","Litchi","Banana","Kiwi","Orange","Pineapple")
//    println(name[3])
    name[3] = "Apple"
    println(name[3])
    println(name.size)

    val numbers = arrayOf(2,5,6,8,9,4,25,12,"Sagar","Mango",'S')

    for (i in numbers){
        if (i is Int){
            //print only Integer value
            println(i)
        }
    }

}