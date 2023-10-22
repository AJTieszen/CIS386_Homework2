import java.util.*

fun main(args: Array<String>) {
    println("-----even or odd---------------")
    evenOdd()
    println("-----palindrome----------------")
    isPalindrome()
    println("-----sum of array--------------")
    sumOfArray()
    println("-----search string-------------")
    searchString()
    println("-----subtract two matrices-----")
    subtractMatrices()
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

    val stringArray = Array(number){""}
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

fun subtractMatrices() {
    val s = Scanner(System.`in`)
    println("Enter the number of rows and columns in the matrix:")
    val rows = s.nextInt()
    val cols = s.nextInt()

    val matrixA = inputMatrix(s, rows, cols, "first")
    val matrixB = inputMatrix(s, rows, cols, "second")
    val matrixR = Array(rows){IntArray(cols)}

    println("Matrix A:")
    printMatrix(matrixA)
    println("Matrix B:")
    printMatrix(matrixB)

    for (i in matrixR.indices) {
        for (j in matrixR.indices) {
            matrixR[i][j] = matrixA[i][j] - matrixB[i][j]
        }
    }

    println("Matrix R:")
    printMatrix(matrixR)
}

fun inputMatrix(s: Scanner, rows: Int, cols: Int, identifier: String): Array<IntArray> {
    val matrix = Array(rows){IntArray(cols)}

    println("Enter the elements in the $identifier matrix ($rows x $cols)")
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("matrix[$i][$j]:")
            matrix[i][j] = s.nextInt()
        }
    }

    return matrix
}

fun printMatrix(matrix: Array<IntArray>) {
    for (i in matrix.indices) {
        println(matrix[i].contentToString())
    }
}