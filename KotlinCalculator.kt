data class Operation(val operation: String, val operand1: Double, val operand2: Double, val result: Double)

// Creating the calculator class and functions
class Calculator {
    private val history = mutableListOf<Operation>() //Creates a history list that stores all the calculations done

    // Function to perform addition and add operation to calculator history
    fun add(a: Double, b: Double): Double {
        val result = a + b
        history.add(Operation("Add", a, b, result))
        return result
    }

    // Function to perform subtraction and add operation to calculator history
    fun subtract(a: Double, b: Double): Double {
        val result = a - b
        history.add(Operation("Subtract", a, b, result))
        return result
    }

    // Function to perform multiplication and add operation to calculator history
    fun multiply(a: Double, b: Double): Double {
        val result = a * b
        history.add(Operation("Multiply", a, b, result))
        return result
    }

    // Function to perform division and add operation to calculator history
    fun divide(a: Double, b: Double): Double {
        return if (b != 0.0) {
            val result = a / b
            history.add(Operation("Divide", a, b, result))
            result
        } else {
            history.add(Operation("Divide", a, b, Double.NaN))
            Double.NaN
        }
    }

    // Function to print the calculator history
    fun printHistory() {
        history.forEach { println(it) }
    }
}

// Function to handle user input
fun getUserInput(): Pair<Double, Double> {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    return Pair(a, b)
}

fun main() {
    val calc = Calculator()
    var openApp = true

    println("Welcome to the Basic Calculator!")


    while (openApp) {
        println("\nCalculator Menu:")
        println("1. Add")
        println("2. Subtract")
        println("3. Multiply")
        println("4. Divide")
        println("5. Print History")
        println("6. Exit Menu")

        println("Select an option: ")
        when (readln()) {
            "1" -> {
                println("Addition")
                val (a, b) = getUserInput()
                println("Result: ${calc.add(a, b)}")
            }
            "2" -> {
                println("Subtraction")
                val (a, b) = getUserInput()
                println("Result: ${calc.subtract(a, b)}")
            }
            "3" -> {
                println("Multiplication")
                val (a, b) = getUserInput()
                println("Result: ${calc.multiply(a, b)}")
            }
            "4" -> {
                println("Division")
                val (a, b) = getUserInput()
                val result = calc.divide(a, b)
                if (result.isNaN()) {
                    println("Error: Division by zero")
                } else {
                    println("Result: $result")
                }
            }
            "5" ->  {
                println("History: ")
                calc.printHistory()
            }
            "6" -> {
                println("\nExiting Program.")
                openApp = false
            }
            else -> println("Error: Invalid input. Enter 1-6. ")
        }
    }
}