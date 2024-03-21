import java.util.*


class Calculator {


    fun calculate() {

        val reader = Scanner(System.`in`)
        println("This is a calculator!")
        println("Enter first number: ")
        val num1 = reader.nextDouble()
        println("Enter the operator ( + , - , * , / ): ")
        val operator = reader.next()[0]
        println("Enter second number: ")
        val num2 = reader.nextDouble()

        val result: Double

        when(operator){
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> result = num1 / num2

            else -> {
                System.out.printf("Wrong operator!")
                return
            }

        }
        System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result)


    }
}