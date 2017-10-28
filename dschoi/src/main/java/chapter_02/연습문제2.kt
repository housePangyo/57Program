package chapter_02

import java.util.*

fun initMessage() {
    print("What is the input String?")
}

fun readMessage() : String{
   return Scanner(System.`in`).nextLine()
}


//글자수 세기
fun main(args: Array<String>) {
   initMessage()
    var next = readMessage();
    println(next + " has " + next.length + "characters.")
}