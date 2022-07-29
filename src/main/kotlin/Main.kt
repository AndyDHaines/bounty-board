const val PLAYER_NAME = "Andrew"
const val PUB_NAME = "The Unicorn's Horn"

fun main() {
    println("Hello, welcome to Kotlin!")

    println(PLAYER_NAME)
    var playerLevel = 4
    println(playerLevel)

    println("You have explored a new topic in Kotlin, your knowledge grows!")
    playerLevel++
    println(playerLevel)

    //Challenge Code
    var hasSteed = false
    var bartenderOnDuty = "Helga"
    var playerGoldAmount = 50
    var barMenuItems = listOf("Mead", "Wine", "LaCroix")

    println("The magic mirror shows your name as ${PLAYER_NAME.reversed()}")

}