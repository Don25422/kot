import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number:")
    var first_number = read.nextInt()

    println("Enter second number:")
    var second_number = read.nextInt()

    println("Enter third number:")
    var third_number = read.nextInt()

    if (first_number > second_number && first_number > third_number) {
        println("$first_number is the largest number")

    }
    else if (second_number > first_number && second_number > third_number){
        println("$second_number is the largest number")

    }
    else{
        println("$third_number is the largest number")
    }
}