import java.*
import java.util.*

fun main() {
    var read = Scanner(System.`in`)
    println("Enter 1st number :")
    var first = read.nextDouble()
    println("Enter 2nd number :")
    var second = read.nextDouble()
    println("Enter 3rd number :")
    var third = read.nextDouble()

    if (first > second && first > third){
        println("$first is the largest number")
    }
    else if (second > first && second > third){
        println("$second is the largest number")
    }
    else {
        println("$third is the largest number")
    }


}