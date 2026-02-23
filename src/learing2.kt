fun main(){
    val day = 6

    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
      else -> println("its weekend")
    }

    val score = 40
    when(score){
        in 69..90 -> println("Score is A")
        in 20 .. 60 -> println("Score is B")
        in 1..10 -> println("Score is C")
        else -> println("You Failed")
    }

    val daysOfTheWeek= 6

    when(daysOfTheWeek){
        1,2,3,4,5 -> println("weekdays")
        6,7 -> println("WeekEnds")
        else -> println("Invalid Day")
    }

}