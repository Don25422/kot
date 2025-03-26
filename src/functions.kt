fun main() {
    //Standard library functions/Predefined functions
    var x = Math.sqrt(144.0)
    println("The square root of 144 is $x")

    var y = Math.round(45.45)
    println("The output is $y")

    school()//Calling a function

    student("Joseph",21)
    student("Ian",19)

    employee("Mark",80000,false)
    employee("Ann",70000,true)

}

//User-Defined functions
fun school(){
    println("eMobilis")

}

//Parameter/Variable amd Argument/Value
fun student(name:String,age:Int){
    println("$name is $age years old")
}

fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Disability: $disability")
}