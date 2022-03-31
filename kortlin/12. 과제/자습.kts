// 1번 문제
fun repeatText(repeatText: String, repeatNumbers: Int) {
    for (i in 1..repeatNumbers) {
        println(repeatText)
    }
}
//repeatText("안녕", 2)

// 2번 문제
fun sumNumber(number: Int): Int {
    var sum: Int = 0
    for (i in 1..number) sum += i
    return sum
}
//sumNumber(5)

// 3번 문제
fun gugudan(): Int {
    var sum: Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}
//gugudan()

// 4번 문제
fun increaseNumber(number: Int) {
    var givenNumber: Int = number
    while (givenNumber < 100) {
        givenNumber++
        println("up")
    }
    return
}
//increaseNumber(98)

// 5번 문제
fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
        else resultArray[index] = false
    }
    return resultArray
}

val result = checkPassOrNot(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
result.forEach {
    println(it)
}

// 7번 문제
fun notHungry (totalCount: Int, currentCount: Int) {
    var currenctCountCopy: Int = currentCount
    do {
        println("밥을 먹었다")
        currenctCountCopy++
    } while (currenctCountCopy < totalCount)
     println("배가 부르다")
}
notHungry(10,10)
