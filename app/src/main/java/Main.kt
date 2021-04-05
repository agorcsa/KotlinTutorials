fun main() {

    // loops from 0 to 10
    for (i in 0..10) {
        println("$i squared is ${i * i}")
    }

    println("====================")

    // loops from 0 to 9
    for (i in 0 until 10) {
        println(i)
    }

    println("====================")

    // loops from 10 down to 0
    for (i in 10 downTo 0) {
        println(i)
    }

    println("====================")

    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    println("====================")

    // challenge
    // option 1
    println("The numbers that are both divisible by 3 and 5 are:")
    for (i in 0..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println(i)
        }
    }

    println("====================")

    //option 2
    for (i in 0..100 step 3) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}


