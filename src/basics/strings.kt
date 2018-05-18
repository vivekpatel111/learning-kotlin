package basics

fun main(args: Array<String>) {
    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }

    /**
     * Create three String variables for trout, haddock, and snapper.
     * Use a String template to print whether you do or don't like to eat these kinds of fish.
     */
    val trout = "t"
    val haddock = "h"
    val snapper = "s"

    println("I don't like to eat these kinds of fish - $trout $haddock $snapper")

    /**
     * when statements in Kotlin are like case or switch statements in other languages.
     *
     * Create a when statement with three comparisons:
     *
     * If the length of the fishName is 0, print an error message.
     * If the length is in the range of 3...12, print "Good fish name".
     * If it's anything else, print "OK fish name".
     */

    var fishName = "nemo"

    when(fishName.length) {
        0 -> println("error message")
        in 3..12 -> println("Good $fishName")
        else -> println("OK $fishName")
    }
}