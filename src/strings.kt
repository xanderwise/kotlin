fun main() {
    var firstname = "Alex"
    var lastname = "Mtisya"
    var school = "eMobilis"

    println(firstname)
    println(firstname + " " + lastname) // string concatenation
    println(firstname[0])
    println(firstname.uppercase())
    println(lastname.lowercase())

    // string interpolation

    println("$school is a coding school")
    println("my fullname is $firstname $lastname")
}