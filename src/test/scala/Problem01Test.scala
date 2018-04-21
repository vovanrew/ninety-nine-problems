import org.scalatest.FlatSpec

class Problem01Test extends FlatSpec {

  val solution = new Problem01


  "Problem01.lastRecursive" should "return last element" in {
    val list = List(1,2,3,4,5)
    assert(solution.lastRecursive(list) == 5)
  }

  it should "return HEAD if list has size 1" in {
    val list = List(1)
    assert(solution.lastRecursive(list) == 1)
  }

  it should "throw NoSuchElementException if empty" in {
    val empty = List.empty[Int]
    assertThrows[NoSuchElementException] {
      solution.lastRecursive(empty)
    }
  }


  "Problem01.lastRecursiveMatch" should "return last element" in {
    val list = List(1,2,3,4,5)
    assert(solution.lastRecursiveMatch(list) == 5)
  }

  it should "return HEAD if list has size 1" in {
    val list = List(1)
    assert(solution.lastRecursiveMatch(list) == 1)
  }

  it should "throw NoSuchElementException if empty" in {
    val empty = List.empty[Int]
    assertThrows[NoSuchElementException] {
      solution.lastRecursiveMatch(empty)
    }
  }


  "Problem01.lastFold" should "return last element" in {
    val list = List(1,2,3,4,5)
    assert(solution.lastFold(list) == 5)
  }

  it should "return HEAD if list has size 1" in {
    val list = List(1)
    assert(solution.lastFold(list) == 1)
  }

  it should "throw NoSuchElementException if empty" in {
    val empty = List.empty[Int]
    assertThrows[NoSuchElementException] {
      solution.lastFold(empty)
    }
  }


  "Problem01.lastReverse" should "return last element" in {
    val list = List(1,2,3,4,5)
    assert(solution.lastReverse(list) == 5)
  }

  it should "return HEAD if list has size 1" in {
    val list = List(1)
    assert(solution.lastReverse(list) == 1)
  }

  it should "throw NoSuchElementException if empty" in {
    val empty = List.empty[Int]
    assertThrows[NoSuchElementException] {
      solution.lastReverse(empty)
    }
  }

}
