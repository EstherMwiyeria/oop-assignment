fun main() {
    val female = Human("Eunice",21,3)
    female.eat(3)
    female.speak("Your belief system is your limit")
    female.birthday()
    val being = Person("Esther","Kanoro","esthermkanoro@gmail.com",757197884,"esther@018")
    println(being.firstName)
    println(being.email)

}
class Human(var name: String, var age: Int, var weight: Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday(){
        ++age
        println(age)
    }
}
data class Person(var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var password: String )
