import java.util.*

fun main() {
    var read = Scanner(System.`in`)

    println("Enter 1st number :")
    var first = read.nextDouble()

    println("Enter operator(*,+,/,-) :")
    val operator = readln()

    println("Enter 2nd number :")
    var second = read.nextDouble()

    var solution = when(operator) {

        "+" -> first + second
        "-" -> first - second
        "/" -> first / second
        "*" -> first * second

        else -> "Invalid operator"

    }
    println("The solution is $solution")



}