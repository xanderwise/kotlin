fun main() {
    // Standard library functions/Pre-defined functions

    var output = Math.sqrt(144.0)
    println("The square root of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    students("Alex","Male",34)
    students("Mutisya","Male",28)

    employee("John", 56000,true)

}

// User-Defined functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x + y)
}

//Parameters/variables and Arguments/value
fun students(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")
}

fun employee(Name:String,salary:Int,Disability:Boolean){
    println("$Name receives a salary of $salary. Disabled $Disability")
}