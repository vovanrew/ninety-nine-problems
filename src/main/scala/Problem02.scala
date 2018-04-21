/**

(*) Find the last but one element of a list.
Example:

scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5

**/


class Problem02 {

  def penultimateRecursive[A](list: List[A]): A =
    if (list.size >= 2) penultimateRecursiveHelper[A](list.tail, list.head)
    else throw new NoSuchElementException

  private def penultimateRecursiveHelper[A](list: List[A], head: A): A =
    if (list.size > 1) penultimateRecursiveHelper(list.tail, list.head)
    else head


  def penultimateOneRecursiveMatch[A](list: List[A]): A = list match {
    case one :: two :: Nil => one

    case head :: tail if tail.nonEmpty => penultimateOneRecursiveMatch(tail)

    case _ => throw new NoSuchElementException

  }


  def penultimateReverse[A](list: List[A]): A =
    if (list.size < 2) throw new NoSuchElementException
    else list.reverse.tail.head

}
