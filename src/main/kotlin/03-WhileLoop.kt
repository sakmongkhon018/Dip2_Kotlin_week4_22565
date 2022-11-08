fun testWhileLoop(){
    var i = 1
    var sum = 0
    while (i <= 5){
        sum += i
        println("Line $i")
            ++i
    }
    println("Sum = $sum")
}