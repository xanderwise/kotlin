open class shape{
    open fun draw(){
        println("Drawing a shape")
    }

}

class Circle:shape(){
    override fun draw(){
        println("Drawing a circle")
    }

}

class Rectangle:shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

fun main() {
    var sh = shape()
    sh.draw()

    var ci = Circle()
    ci.draw()

    var r = Rectangle()


}