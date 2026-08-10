fun main(){

val myFruitBasket = mutableListOf("oranges", "apples", "pear")
for(fruit in myFruitBasket){
    println(fruit)
}

myFruitBasket.add("waterMelons")
myFruitBasket.remove("pear")

println(myFruitBasket)

 }


