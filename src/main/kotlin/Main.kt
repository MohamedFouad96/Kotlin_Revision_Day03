/** Null Safety and Exceptions */

//fun main(args: Array<String>) {
//
//    var number: Int? = 23
//
//    number?.plus(29)
//
//    number!!.plus(200)
//
//    number = null
//
//
//    if (number != null) {
//        println("Not null")
//    } else {
//         println("Null")
//    }
//
//    number?.let {
//        println("Not Null")
//    }
//
//
//    val username: String? = null
//    val nickname: String = username ?: "nickname"
//
//   // username ?: throw Exception("Unknown")
//
//    try {
//        var age = readLine()!!.toInt()
//    } catch (error: Exception) {
//        println("Unknown number: ${error.message}")
//    }
//
//
//}

/** Scope functions */

/*
fun main() {

    // Let
    // Object reference -> it
    // result value -> lambda result

    var num1: Int? = null
    num1?.let { num ->
        println(num)
    }

    num1 = 50

    var number = num1?.let {
        it+it
    }

    println(number)

    // apply
    // object reference -> this
    // result value -> context object

    var name = "fouad"

    var nickname = name.apply {
        uppercase()
        println(uppercase())
    }

    println(nickname)

    // with
    // object reference -> this
    // result value -> lambda result

    var nameUppercase = with(name) {
        uppercase()
    }

    println(nameUppercase)


    // run
    // object reference -> this
    // result value -> lambda result

    var num2: Int? = 10

    var num3 = num2?.run {
        plus(50)
    }


    println(num3)


    // also
    // object reference -> it
    // result value -> context object

    var username = "mohamedfouad"
    var password: String?

    username.also {
        password = "$it:2332313124"
    }

}*/

/** Loops */

fun main() {

    var books = listOf<String>("AI" , "CV" , "Network" ,"OS")

//    println(books[0])
//    println(books[1])
//    println(books[2])
//    println(books[3])

    for (book in books) {
        println(book)
    }
    println("--------------------------------------------------------")

    for (i in 1..10) {
        println(i)
    }

    println("--------------------------------------------------------")
    for (i in 1..10 step 2) {
        println(i)
    }

    println("--------------------------------------------------------")

    for (i in 'a'..'z') {
        println(i)
    }

    println("--------------------------------------------------------")


    var i = 0

    while (i <= 10) {
        println(i)
        i = 11
    }

}
