class Bank {
    fun save(account: Account, money: Int) {
        if (money >= 0) account.balance += money
        else println("마이너스 금액은 예금할 수 없습니다")
    }

    fun withdraw(account: Account, money: Int) {
        if (account.checkBalance() >= money) account.balance -= money
        else println("잔액이 부족합니다")
    }
}

class Account constructor(val initialBalance: Int = 0) {
    var balance: Int = 0

    init {
        this.balance = initialBalance
    }

    fun checkBalance(): Int {
        return this.balance
    }
}

val 이준혁 = Account(1000)
val bank = Bank()
println(이준혁.checkBalance())
bank.save(이준혁, 1000)
println(이준혁.checkBalance())

val 조세진 = Account(10000)
println(조세진.checkBalance())