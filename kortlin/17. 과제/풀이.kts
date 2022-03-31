class Calculator {
    var result: Int = 0
        set(value) {
            field = value
            println("중간 계산 값 : " + field)
        }

    fun sum(inputNumber: Int) {
        result += inputNumber
    }

    fun minus(inputNumber: Int) {
        result -= inputNumber
    }

    fun multiply(inputNumber: Int) {
        result *= inputNumber
    }

    fun devide(inputNumber: Int) {
        result /= inputNumber
    }
}

//val calculator1 = Calculator()
//calculator1.sum(10)
//calculator1.devide(2)
//calculator1.multiply(3)

class Calculator2 constructor(val initialValue: Int = 0) {
    var result: Int

    init {
        this.result = initialValue
    }

    fun calculate(function: Char, inputNumber: Int) {
        when (function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }

}

//val calculator2 = Calculator2(10)
//calculator2.calculate('+', 10)
//calculator2.calculate('/', 20)
//calculator2.calculate('-', 100)
//println(calculator2.result)

class Calculator3 {
    var result: Int = 0
    fun calculate(operators: List<Char>, inputNumbers: List<Int>) {
        operators.forEachIndexed{ index, operator ->
            this._calculate(operator, inputNumbers[index])
        }
    }


    fun _calculate(function: Char, inputNumber: Int) {
        when (function) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다")
        }
    }
}

//val calculator3 = Calculator3()
//calculator3.calculate(listOf<Char>('+', '-'), listOf<Int>(10,20))
//println(calculator3.result)


//['+', '-', '*'], [10, 20, 30]

//[('+', 50) ('-', 60)]
//[(Any, Any) (Any, Any)] -> 실제
//[(Char, Int) (Char, Int)] -> 기대
// Any -> Char, Int 으로 변환
