fun main() {
    println("Hello, World!")
    println("Welcome to Introduction to Programming in Kotlin!")
    
    val count = 2
    println("You have $count unread messages.")
    
    val userName = "Alice"
    val userAge = 25
    println("$userName is $userAge years old.")
    
    var stepCount = 1000
    println("Step count updated: $stepCount steps.")
    stepCount = 2500
    println("New step count: $stepCount steps.")
    
    displayGreeting("Android Developer")
}

fun displayGreeting(recipient: String) {
    println("Happy Birthday, $recipient!")
}
