package oop.kotlin

//Enum is used for creating constants
enum class EngineerType(val gender: Gender){

    Electrical(Gender.Male){
        override fun toString(): String {
            return "Electrical[male]"
        }
    },
    Mechanical(Gender.Male),

    Electronic(Gender.Female),

    Chemical(Gender.Male),

    Civil(Gender.Female)
}
enum class Gender{
    Male,
    Female
}

//fun main() {
//    val eng = EngineerType.Chemical
//    println("${eng.ordinal}")
//}
