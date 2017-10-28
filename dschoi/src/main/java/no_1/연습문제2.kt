package no_1

import java.util.*

fun initMessage() {
    print("What is the input String?")
}

fun readName() : String{
   return Scanner(System.`in`).next();
}


//글자수 세기
fun main(args: Array<String>) {
   initMessage()
    var next = readName();
    println(next + " has " + next.length + "characters.")
}