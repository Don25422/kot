fun main() {
    var dog1 = Dog("Billy","Chihuahua","brown")
    println(dog1.breed)

    var dog2 = Dog("Mike","Kienyeji","brown")
    println(dog2.name)

    var dog3 = Dog("Joseph","German shepherd","black")
    println(dog3.color)

    var dog4 = Dog("Ian","Siberian Husky","black")
}

class Dog(var name:String,var breed:String,var color:String){

}