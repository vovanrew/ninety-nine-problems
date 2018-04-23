class Problem03 {

  def nthRecursive[A](n: Int, list: List[A]): A = {
    if (list.isEmpty || n > list.size || n < 0) throw new IndexOutOfBoundsException
    else if (n == 0) list.head
    else nthRecursive(n - 1, list.tail)
  }

}
