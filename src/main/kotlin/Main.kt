//Author: Andrew Haines

const val HERO_NAME = "Andrew"

fun main() {
    println("The hero announces his presence to the world! ")

    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    if (playerLevel == 1){
        println("Meet Mr. Bubbles in the land of soft things.")
    } else {
        println("Locate the enchanted sword.")
    }

    println("Time passes.....")
    println("The hero returns from his quest")

    playerLevel++
    println(playerLevel)

}