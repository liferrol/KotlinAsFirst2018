@file:Suppress("UNUSED_PARAMETER")
package lesson2.task2

import lesson1.task1.sqr
import lesson4.task1.abs
import kotlin.math.abs
import kotlin.math.sqrt

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
        sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {
    return ((number / 1000) + ((number % 1000) / 100) == ((number / 10) % 10) + (number % 10))
}
/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    return ((x1 == x2) || (y1 == y2) || abs(x1 - x2) == abs(y1 - y2) )
}


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {
    var days = 0
    if (((month == 2) && (year%4 == 0 ) && (year%100 !== 0)) || ((month == 2) && (year%400 == 0 ))) days = (29)
    if (((month == 2) && (year%4 !== 0 )) || ((month == 2) && (year%400 !== 0) && (year%100 == 0)))  days = (28)
    if (((month%2 == 0) &&(month !== 2)) || (month in 7..12) && (month%2 !== 0)) days = (30)
    if ((month == 1) or  ((month in 3..7) && (month%2 !== 0)) or  ((month in 7..12) && (month%2 == 0))) days = (31)
    return (days)
}

/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(x1: Double, y1: Double, r1: Double,
                 x2: Double, y2: Double, r2: Double): Boolean {
    var x12:Double = sqr(x2-x1)
    var y12:Double = sqr(y2-y1)
    return ((sqrt(x12 + y12) + r1) <= r2)
}

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    return (((a - r <= 0) && (b - s <=0))
            || ((b - r <= 0) && (a - s <= 0))
            || ((c - r <= 0) && (b - s <= 0))
            || ((b - r <= 0) && (c - s <= 0))
            || ((a - r <= 0) && (c - s <= 0))
            || ((c - r <= 0) && (a - s <= 0))
            )

}
