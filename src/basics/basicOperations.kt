package basics

fun main(args: Array<String>) {
    /*
     * If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
     * and 233 offspring the second time, and then 13 fish are swallowed by a hungry moray eel,
     * how many fish do you have left?
     * How many aquariums do you need if you can put 30 fish per aquarium?
     */

    var fish = 2.plus(71).plus(233).minus(13)

    //2.plus(71).plus(233).minus(13).div(30).plus(1)


    println("remaining fish : ${fish.plus(1)}")
    println("required aquariums : ${fish.div(30)}")
}