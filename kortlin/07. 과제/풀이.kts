// 1번
val A: Int = 10
val B: Int = 10
val C: Boolean = if (A == B) true else false
println(C)
// 자료형이 다르면 비교연산자를 사용할 수 없다

// 2번
val AA: Int = 10
val BB: Int = AA * 2

// 3번
fun checkGrade(score: Int): String {
//    if (score >= 90) return "A학점"
//    else if (score >= 80) return "B학점"
//    else if (score >= 70) return "C학점"
//    else return "F학점"
    when (score) {
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..79 -> return "C학점"
        else -> return "F학점"
    }
}

val result: String = checkGrade(90)
println(result)

// 4번
fun gradeTest(correctCount: Int): Int {
    var result = correctCount * 5
    return result
}

fun gradeTest2(correctCount: Int): Int = correctCount * 5
println(gradeTest(10))
println(gradeTest2(10))

// 5번
fun plusTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
    // 함수에서 받은 인자 firstNum, secondNum -> val 이다
//    if (firstNum == null) {
//        firstNum = 0
//    }
//    if (secondNum == null) {
//        secondNum = 0
//    }
//    return firstNum + secondNum

    // 정답
    val first: Int = if (firstNum == null) 0 else firstNum
    val second: Int = if (secondNum == null) 0 else secondNum
    return first + second

    // 함수안에서 똑같은 이름을 갖고 있는 다른 두 변수가 있으면 안된다
}
println(plusTwoNumbers(null, null))