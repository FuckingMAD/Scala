package exercise1

/** Напишите ваши решения в виде функций. */
object HigherOrder {

  val plus: (Int, Int) => Int = _ + _
  val multiply: (Int, Int) => Int = _ * _

  /* a) Напишите функцию, которая принимает `f: (Int, Int) => Int`, параменты `a` и `b`
   *    и коэффициент умножения `n` и возвращает n * f(a, b). Назовите `nTimes`.
   */

 def nTimes(f:(Int,Int)=>Int, a:Int,b:Int,n:Int):Int= n *f(a,b)

  // примените вашу функцию (a) здесь, не изменяйте сигнатуру
  def testNTimes(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = nTimes(f,a,b,n)
  println(testNTimes(multiply,2,3,4))

  /* b) Напишите анонимную функцию, функцию без идентификатора ((a, b) => ???) для `nTimes` которая
   *    выполняет следующее:
   *          if (a > b) a else b
   */
  def testAnonymousNTimes(a: Int, b: Int, n: Int): Int = nTimes((a,b)=> if (a>b) a else b,a,b,n)
  println(testAnonymousNTimes(10,11, 7))

  def main(args: Array[String]): Unit = {}
}
