fun main() {
    val amount = 5452

    var result = (amount * 0.75 / 100).toInt()
    result = if(result < 35) 35 else result

    println("Комиссия за перевод суммы $amount руб составит $result руб")
}