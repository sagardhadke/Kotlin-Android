package Practice

fun main(){

    val name = arrayOf("Volvo","Nano Car","Toyota","Tata Nexon","Audi",5,4,3,1,2,9,'S','A',12.5,65.3,25.3,12.5,'G','A','R',2.1f,3.5f,2.5f)

    //print all name
//    for (i in name){
//        println(i)
//    }

    //print only cars name
//    for (i in name){
//        if (i is String)
//        println(i)
//    }

    //print all char value
    for (i in name){
        if (i is Char){
            println(i)
        }
    }

    //print all Int value
    for (i in name){
        if (i is Int){
            println(i)
        }
    }

    //print all Double value
    for (i in name){
        if (i is Double){
            println(i)
        }
    }

    //print all Float value
    for (i in name){
        if (i is Float){
            println(i)
        }
    }

}