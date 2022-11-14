fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println("Hello World!")


    var nullable = null

    val whatTypeIAm = nullable?.toDouble()
    println(whatTypeIAm)

    val guessType = whatTypeIAm ?: 4.5
    println(guessType)

    val guessType2 = nullable?.toLong() ?: 5
    println(guessType2)

    val guessType3 = guessType?.toInt() ?: 2
    println(guessType3)

    var anyType: Any = 12
    val castFromAny = anyType as? String
    println(castFromAny)

}