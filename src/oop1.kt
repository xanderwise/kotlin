class Person{

    var name = "Alex"
    var age = 18
    var gender = "Male"


    fun speak(){
        println("Doctor is speaking")
    }

}

fun main() {
    var doctor1 = Person()
    doctor1.speak()
    println(doctor1.name)

    var doctor2 = Person()
}