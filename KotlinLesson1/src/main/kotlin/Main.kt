fun main(args: Array<String>) {
    val pricePalto = 20.0
    val priceShlyapa = 5.0
    val priceKostyum = 17.0
    val priceSorochka = 7.0
    val priceTufli = 9.0

    // Скидка на пальто
    val discountPalto = 0.32
    val pricePaltoAfterDiscount = pricePalto * (1 - discountPalto)

    // Скидка на шляпу
    val discountShlyapa = 0.3
    val priceShlyapaAfterDiscount = priceShlyapa * (1 - discountShlyapa)

    // Скидка на костюм
    val discountKostyum = 0.2
    val priceKostyumAfterDiscount = priceKostyum * (1 - discountKostyum)

    // Скидка на рубашку
    val discountSorochka = 0.7
    val priceSorochkaAfterDiscount = priceSorochka * (1 - discountSorochka)

    // Общая стоимость покупки
    val totalPrice = pricePaltoAfterDiscount + priceShlyapaAfterDiscount + priceKostyumAfterDiscount + priceSorochkaAfterDiscount + priceTufli

    // Проверка, хватит ли средств
    val enoughMoney = totalPrice <= 32.0

    // Вывод результата
    if (enoughMoney) {
        println("На счету достаточно средств для покупки.")
    } else {
        println("На счету недостаточно средств для покупки.")
    }
}