import java.util.*

fun main(args: Array<String>) {
    println("-----even or odd---------------")
//    evenOdd()
    println("-----palindrome----------------")
//    isPalindrome()
    println("-----sum of array--------------")
    sumOfArray()
    println("-----search string-------------")
//    searchString()
}

fun evenOdd() {
    val s = Scanner(System.`in`)
    println("Please enter an integer: ")
    val number = s.nextInt()

    val result = if(number % 2 == 0) "even" else "odd"

    println("$number is $result.")
}

fun isPalindrome() {
    val s = Scanner(System.`in`)
    println("Please enter a string: ")
    val string1 = s.next()

    val forward = string1.toCharArray()
    val reversed = forward.reversed()
    val string2 = reversed.joinToString("")

    val result = if(string1 == string2) "" else " not"
    println("$string1 is$result a palindrome.")
}

fun sumOfArray() {
    val s = Scanner(System.`in`)
    println("Please enter the number of numbers:")
    val number = s.nextInt()

    val intArray = IntArray(number)
    println("Please enter array elements:")
    for (i in intArray.indices) {
        print("intArray[i]: ")
        intArray[i] = s.nextInt()
    }

    val result = intArray.sum()
    println("The sum of the entered elements is $result.")
}

fun searchString() {
    val s = Scanner(System.`in`)
    println("Please enter the number of strings:")
    val number = s.nextInt()

    val stringArray = Array<String>(number){""}
    println("Please enter array elements:")
    for (i in stringArray.indices) {
        print("stringArray[$i]: ")
        stringArray[i] = s.next()
    }

    println("Please enter a search term:")
    val searchTerm = s.next()

    val result = if(stringArray.contains(searchTerm)) "contains" else "does not contain"
    println("The entered string array $result '$searchTerm'")
}
