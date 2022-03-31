// 1번 문제
val A: Int = 5
val B: Int = 5
val C: Boolean = if (A == B) true else false
println(C)

// 2번 문제
val AA: Int = 10
val BB: Int = AA * 2
println(BB)

// 3번 문제
fun scoreGrade(score: Int): String {
    when (score) {
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..79 -> return "C학점"
        else -> return "F학점"
    }
}

val result: String = scoreGrade(75)
println(result)

// 4번 문제
fun test(correctCount: Int): Int {
    val result2: Int = correctCount * 5
    return result2
}
println(test(10))

// 5번 문제
fun plusTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
    val first: Int = if (firstNum == null) 0 else firstNum
    val second: Int = if (secondNum == null) 0 else secondNum
    return first + second
}
println(plusTwoNumbers(null, 5))