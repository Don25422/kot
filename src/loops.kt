fun main() {
    //While loop
    var number = 20
    while (number <= 25) {
        println("Number is $number")
        number++
    }

    var num = 5
    while (num >= 1){
        println(num)
        num --
    }

    //Do while loop
    var count = 100
    do {
        println("Number is $count")
        count++
    }
        while (count <= 105)

        //For loop
        for (x in 35..40){
            println("Number : $x")
        }

    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }

    //Break
    for (a in 1..5){
        if (a == 3){
            break
        }
        println("Number is $a")
    }

    //Continue
    for (myletter in 'b'..'h'){
        if (myletter == 'f'){
            continue
        }
        println("My letter is $myletter")
    }
}