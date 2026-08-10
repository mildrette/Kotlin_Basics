fun main(){

val contact = mutableMapOf("wisdom" to "12345678", "promise" to "235681235", "favour" to "987654821")
println(contact)

contact["vanessa"] = "98863760"
contact.put("wisdom", "87654321")
contact.remove("promise")

for((name, number) in contact){
    println("$name -> $number")
}
println(contact)


}