fun main(){

    //loops

    for (i in 1..10){
        println(i) //1 2 3 4 5 6 7 8 9 10
    }

    for (i in 1 until 10){
        println(i) // 1 2 3 4 5 6 7 8 9
    }
//
////    DownTo
//
    for (i in 10 downTo 1){
        println(i)  // 10 9 8 7 6 5 4 3 2 1
    }
//
//    //step
//
    for (i in 2 .. 20 step 2){
        println(i)
    }


    //while loops

    var num = 0
    while (num<=10){
        println(num)
        num++
    }

    //do-while

    var d = 9
    do {
        println(d)
    }while (d<10)

}