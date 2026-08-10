fun main(){

val myFruitBasket = mutableListOf("oranges", "apples", "pear")
for(fruit in myFruitBasket){
    println(fruit)
}

myFruitBasket.add("waterMelons")
myFruitBasket.remove("pear")

println(myFruitBasket)


// maps

// val person = mapOf("name" to "Mildred", "learning" to "Kotlin")
// println(person)

val person = mutableMapOf("name" to "Mildred", "learning" to "Kotlin")

println(person["name"])
person.put("age", "30")

person["days"] = "31"

println(person)

 }





