interface Signatory {
    fun sign()
}

open class Person(private val name: String, var age:Int, var isMarried: Boolean = false) : Signatory{
//    The code inside the init block is the first to be executed when the class is instantiated.
//    init {
//        if (age < 54) throw Exception("Invalid age")
//    }

//    add some properties
    var partneName: String = ""

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")
}

class Students(name: String, age:Int) : Person(name, age)

// data class for holding data
data class User(val name: String, val id: Int)


fun main(args: Array<String>) {
    val p = Person("Frank", 21, true)
    p.sign()

    p.age = 56
    p.sign()

    p.partneName = "Lucy"

    println("Partner name is ${p.partneName}")

    val frank = User("Frank", 22)
    println(frank)

//    extract data
    val(name, id) = frank

    val otheruser = frank.copy(id = 56)
    println("User is $name and id is $id")
    println(otheruser)
}