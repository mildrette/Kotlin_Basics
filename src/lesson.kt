fun main(){
    println("Hello World")

    val name = "Mildred"
    var age:Int = 30
    println("my name is $name and i am $age years old")


    var number  = 30
    number += 31
    number -= 30
    number *= 30
    println("my age is $number and i am $age years old")

    var learning: Int
    learning = 1

    var kotlin:String
    kotlin = "Day 1"
    println(learning)
    println(kotlin)


//    read only list

    val shapes = listOf("square", "circle", "Triangle", "rectangle")
    println(shapes)

    val cars: MutableList<String> = mutableListOf("toyota", "cares", "another", "again")
    println(cars)

    val code= listOf(1, 2, 3, 4, 5)
    print(code)

    val figure: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6,7,8,9,10)
    val figureLocked: List<Int> = figure
    println("the first number of the list is ${figure.first()} and the last number is ${figure.last()}")
}