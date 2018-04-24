class Problem04 {

  def lengthRecursive[A](list: List[A]): Long =
    if (list.isEmpty) 0
    else lengthHelper[A](0, list)

  private def lengthHelper[A](acc: Long, list: List[A]): Long =
    if (list.isEmpty) acc
    else lengthHelper(acc + 1, list.tail)


  def lengthCount[A](list: List[A]): Long = list.count(_ => true)

}
