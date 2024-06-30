
fun getUserInput(): Pair<Double, Double> {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    return Pair(a, b)
}

fun main() {
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
//                val (a, b) = getUserInput()
//                println("Result: ${calc.add(a, b)}")
            }
            "2" -> {
                println("Subtraction")
//                val (a, b) = getUserInput()
//                println("Result: ${calc.subtract(a, b)}")
            }
            "3" -> {
                println("Multiplication")
//                val (a, b) = getUserInput()
//                println("Result: ${calc.multiply(a, b)}")
            }
            "4" -> {
                println("Division")
//                val (a, b) = getUserInput()
//                val result = calc.divide(a, b)
//                if (result.isNaN()) {
//                    println("Error: Division by zero")
//                } else {
//                    println("Result: $result")
//                }
            }
            "5" -> println("History") //calc.printHistory()
            "6" -> {
                println("\nExiting Program.")
                openApp = false
            }
            else -> println("Error: Invalid input. Enter 1-6. ")
        }
    }
}