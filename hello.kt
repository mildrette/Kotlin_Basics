fun main(){

var messageLengths = arrayOf(50, 100, 150, 200, 250)

for(i in messageLengths){
    var canSend = canSendMessages(i)
    println("$i characters : can send? $canSend")
}

 }



fun canSendMessages(messages: Int): Boolean{
    if(messages <= 160){
        return true
    } else { return false}
}