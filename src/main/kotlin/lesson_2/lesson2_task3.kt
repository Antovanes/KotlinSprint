package org.example.lesson_2

fun main() {
//    Задача 3 к Уроку 2
//
//    Сайт с расписанием поездов получает данные с сервера.
//    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
//    Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//    – Выведи результат в консоль.

    val trainStartTime: Int = 9 * 60 + 39   // (время отправления поезда в минутах)
    val trainRouteTime: Int = 457           // (время в пути в минутах)

    val trainArrivalTime = trainStartTime + trainRouteTime // (время прибытия поезда в минутах)
    val trainArrivalTimeHour = trainArrivalTime / 60
    val trainArrivalTimeMinute = trainArrivalTime % 60

    print("Время прибытия поезда: ${trainArrivalTimeHour.toString().padStart(2, '0')}")
    println(":${trainArrivalTimeMinute.toString().padStart(2, '0')}")
}