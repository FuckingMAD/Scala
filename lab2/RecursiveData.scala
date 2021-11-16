package lab2



sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]

/** Напишите свои решения в виде функций. */
object RecursiveData {

  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.

  def ListIntEmpty(list:List[Int]):Boolean = list match{
    case _: Nil[Int] => true
    case _ => false
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = ListIntEmpty(list)
  println(testListIntEmpty(Cons(1,Cons(2,Nil()))))
  println(testListIntEmpty(Nil()))

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.

  def ListIntHead(list: List[Int]):Int = list match {
    case list: Cons[Int] => list.head
    case _ => -1
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = ListIntHead(list)
  println(testListIntHead(Cons(3,Cons(4,Nil()))))
  println(testListIntHead(Nil()))

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?


  /* d) Реализуйте универсальное дерево (Tree) которое хранит значения в виде листьев и состоит из:
   *      node - левое и правое дерево (Tree)
   *      leaf - переменная типа A
   */

  sealed trait Tree[A]
  case class Node[A] (left: Tree[A], right: Tree[A]) extends Tree[A]
  case class Leaf[A] (leaf: A) extends Tree[A]

  def main(args: Array[String]): Unit = {}
}
