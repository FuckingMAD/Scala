package exercise1
/** Напишите отдельные функции, решающие поставленную задачу.
  * 
  * Синтаксис:
  *   // метод
  *   def myFunction(param0: Int, param1: String): Double = // тело
  * 
  *   // значение
  *   val myFunction: (Int, String) => Double (param0, param1) => // тело
  */
object Functions {

  def circleS(r: Double): Double = r * r * Math.PI

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */


  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = circleS(r)

  println("а) Площадь круга =" + circleS(7))


  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def rectangleSC(a: Double)(b: Double): Double = a * b


  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = rectangleSC(a)(b)

  val CF = testRectangleCurried(3, _)
  println("б) Площадь прямоуглольника=" + CF(7))

  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def rectangleS(a: Double, b: Double): Double = a * b

  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = rectangleS(a, b)

  println("c) Площадь прямоугольника=" + testRectangleUc(3, 7))

  def main(args: Array[String]): Unit = {}
}
