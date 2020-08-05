package dsl

fun main(){

    buildString (10) {
        append("Nnamani")
        append("Chinonso")
    }.run {
        println(this)
    }

}