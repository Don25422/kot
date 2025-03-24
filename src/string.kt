fun main() {
    var  firstname = "Don"
    var lastname = "Kym"

    println(firstname)
    println(firstname+" "+ lastname) //String Concatenation
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String Interpolation
    println("My firstname is"+ firstname)
    println("My lastname is $lastname")
}