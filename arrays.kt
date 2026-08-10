fun main(){
    // arrays in kotliny
    // the size of an array is fix you can not add or remove something from an array
    // you can have the same number or items there eg and arrayOF(2,2,4,5,6,6,7,)

    val numbers = arrayOf( 2,3,4,5,6,7,8)
    println(numbers.joinToString())



    // set in kotlin
    //  on like arrays you can not have the same name or number twice it ignoreds the other and pick one
    // eg setOf(2,3,3,4,5) will print 2,3,4,5

    val random = setOf( 2,2,3,4,4,5,6 )
    println(random)

    val items = mutableSetOf("table", "chair", "house", "house")

    items.add("computer")
    println(items)









}