package basics

fun main(args: Array<String>) {
    /**
     * Create a String variable rainbowColor, set its color value, then change it.
     * Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.
     */
    var rainbowColor: String? = "red"
    rainbowColor = "green"
    val blackColor = "black"
    //blackColor = "not black" error

    /**
     * Try to set rainbowColor to null. Declare two variables, greenColor and blueColor.
     * Use two different ways of setting them to null.
     */

    rainbowColor = null
    var greenColor = null
    var blueColor: Int? = null

    /**
     * Create a list with two elements that are null; do it in two different ways.
     * Next, create a list where the list is null.
     */
    var nullList = listOf(null, null)
    var anoutherNullList: List<Int?> = listOf(null, null)

    /**
     * Create a nullable integer variable called nullTest, and set it to null.
     * Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.
     */
    var nullTest: Int? = null
    println("new value : ${nullTest?.inc() ?: 0}")
}