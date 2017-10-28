package chapter_02

//따옴표 출력

val quoteMaps: MutableMap<String, String> = mutableMapOf()

fun makeMessage1() {
    print("What is the quote? ")
}

fun makeMessage2() {
    print("Who said it? ")
}

fun main(args: Array<String>) {
    makeMessage1()
    val quote = readMessage()
    makeMessage2()
    var who = readMessage()
    quoteMaps.put(who, quote)

    for (quoteMap in quoteMaps) {
        print(quoteMap.key + " says, \"" + quoteMap.value + "\".")
    }

}
