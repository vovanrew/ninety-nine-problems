package problem2

import java.util.NoSuchElementException

/**
  **
(*) Find the last but one element of a list.
  *Example:
 **
 scala> penultimate(List(1, 1, 2, 3, 5, 8))
  *res0: Int = 5
  *
 **/
class Solution02 {

  def penultimateRecursive[A](list: List[A]): A = {
    if (list.size == 2) list.head
    else if (list.size > 2) penultimateRecursive(list.tail)
    else throw new NoSuchElementException
  }

  def penultimateOneRecursiveMatch[A](list: List[A]): A = list match {
    case one :: two :: Nil             => one
    case head :: tail if tail.nonEmpty => penultimateOneRecursiveMatch(tail)
    case _                             => throw new NoSuchElementException
  }

  def penultimateReverse[A](list: List[A]): A = {
    if (list.size < 2) throw new NoSuchElementException
    else list.reverse.tail.head
  }
}
