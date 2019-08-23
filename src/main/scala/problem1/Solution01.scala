package problem1

/**

(*) Find the last element of a list.
Example:

scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8

**/
class Solution01 {

  def lastRecursive[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else if (list.tail.isEmpty) list.head
    else lastRecursive(list.tail)

  def lastRecursiveMatch[A](list: List[A]): A = list match {
    case Nil =>
      throw new NoSuchElementException

    case head :: Nil =>
      head

    case head :: tail =>
      lastRecursiveMatch(tail)
  }

  def lastFold[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list.fold(list.head)((first, second) => second)

  def lastReverse[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list.reverse.head

  def lastReduce[A](list: List[A]): A =
    list.reduce((a, b) => b)
}
