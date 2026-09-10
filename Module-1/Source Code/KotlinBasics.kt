fun main() {
    printNotificationMessages()
    fixCompileErrors()
    demonstrateStringTemplates()
    formatMessages("Notification System", 5)
    performMathOperations()
    printEmailDetails(sender = "support@android.com", recipient = "user@example.com")
    printEmailDetails(sender = "alerts@android.com", recipient = "user@example.com", subject = "Security Alert")
    refactorDuplicateCode()
}

fun printNotificationMessages() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When a program runs, the variables are updated as needed.")
}

fun fixCompileErrors() {
    val city = "New York"
    val temperature = 22
    println("The temperature in $city is $temperature degrees Celsius.")
}

fun demonstrateStringTemplates() {
    val numberOfPhotos = 100
    val numberOfDeletedPhotos = 10
    println("$numberOfPhotos photos in total.")
    println("$numberOfDeletedPhotos photos deleted.")
    println("${numberOfPhotos - numberOfDeletedPhotos} photos remaining.")
}

fun formatMessages(systemName: String, alertCount: Int) {
    val formattedMessage = "[$systemName]: $alertCount urgent notifications waiting."
    println(formattedMessage)
}

fun performMathOperations() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = addNumbers(firstNumber, secondNumber)
    val anotherResult = addNumbers(firstNumber, thirdNumber)
    
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber * $secondNumber = ${multiplyNumbers(firstNumber, secondNumber)}")
}

fun addNumbers(first: Int, second: Int): Int {
    return first + second
}

fun multiplyNumbers(first: Int, second: Int): Int {
    return first * second
}

fun printEmailDetails(sender: String, recipient: String, subject: String = "No Subject") {
    println("Sender: $sender | Recipient: $recipient | Subject: $subject")
}

fun refactorDuplicateCode() {
    printWeatherReport("City A", 20, 25, 80)
    printWeatherReport("City B", 15, 18, 65)
    printWeatherReport("City C", 30, 35, 40)
}

fun printWeatherReport(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low: $lowTemp, High: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
