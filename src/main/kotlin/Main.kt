import java.util.*

fun main(args: Array<String>) {
    println("-----even or odd-----")
    evenOdd()
    println("-----palindrome------")
    isPalindrome()
}

fun evenOdd() {
    val s = Scanner(System.`in`)
    println("Please enter an integer: ")
    val number = s.nextInt()

    val result = if(number % 2 == 0) {
        "even"
    } else {
        "odd"
    }

    println("$number is $result.")
}

fun isPalindrome() {
    val s = Scanner(System.`in`)
    println("Please enter a string: ")
    val string1 = s.next()

    val forward = string1.toCharArray()
    val reversed = forward.reversed()
    val string2 = reversed.joinToString("")

    val result = if(string1 == string2) "" else "not "
    println("$string1 is $result" + "a palindrome.")
}