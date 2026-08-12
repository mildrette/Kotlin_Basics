fun main(){
    // Null Safety (?, !!, ?:)


    // var city:String? = null
    // println(city?.length)

    // city = "Buea"

    // println(city?.length)

    // var house: String? = null
    // println(house!!.length)

    // var hours: String? = null
    // println(hours?.length)

    // var net: Int? = null
    // println(net!!)


    var username: String? = null 
    println(username?.length)

    // how do i print this one then????
    var length = userEmail?.length ?:0
    println(length)

    var name: String? = null 
    val displayName = name ?: "welcome You"
    println(displayName)


    val greetings = readln()

    println(" welcome back $greetings, to day is another day of learning null safety")
}