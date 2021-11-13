package exercise1

/** Напишите решение в виде функции. 
  * 
  * Синтаксис:
  *   val a: Int = ???
  * 
  *   a match {
  *     case 0 => true
  *     case _ => false
  *   }
  */
object PatternMatching {

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {

    val name: String
    val food: Food
  }
  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Fish(name: String, food: Food)                extends Animal
  case class Bird(name: String, food: Food)                extends Animal



  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */

  def intToString(a:Int):String = a match{
    case 1 => "it is one"
    case 2 => "it is two"
    case 3 => "it is three"
    case _ => "what's that"
  }

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = intToString(value)
  println("1 "+ testIntToString(value=1))
  println("2 "+ testIntToString(value=2))
  println("3 "+ testIntToString(value=3))
  println("4 "+ testIntToString(value=4))
  println()

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max
   *     "moritz" или "Moritz"
   */

 def IsMaxAndMoritz(value:String):Boolean =
   value == "max" || value == "Max" || value == "moritz" || value == "Moritz"

  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = IsMaxAndMoritz(value)
  println("Max " + testIsMaxAndMoritz(value="Max"))
  println("moritz " + testIsMaxAndMoritz(value="moritz "))
  println()


  // c) Напишите функцию проверки является ли `value` четным

  def IsEven(value:Int):Boolean = value%2 == 0

  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = IsEven(value)
  println("1 " + testIsEven(value=1))
  println("2 " + testIsEven(value=2))
  println()


  
  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага 
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */

  def winsA(a: Hand, b:Hand):Result = a match{
    case Rock => b match{
      case Rock => Draw
      case Paper => Lose
      case Scissor => Win
    }
    case Scissor => b match{
      case Rock => Lose
      case Paper => Win
      case Scissor => Draw
    }
    case Paper => b match{
      case Rock => Win
      case Paper => Draw
      case Scissor => Lose
    }
  }

  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = winsA(Rock,Paper)
  println("Rock, Paper " + testWinsA(Rock,Paper))



  // Примечание: используйте определение Animals

  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.

  def EXM(animal:Animal): Int = animal match {
    case mammal: Mammal => mammal.weight
    case _ => -1
  }

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = EXM(animal)
  println(EXM(Mammal("Monkey",Vegetables, 1)))
  println()


  // f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.

  def UpdateFood(animal:Animal):Animal = animal match {
    case fish: Fish => Fish(fish.name, Plants)
    case bird: Bird => Bird(bird.name, Plants)
  }


  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = UpdateFood(animal)
  println(testUpdateFood(Bird("hawk", Meat)))

  def main(args: Array[String]): Unit = {}
}
