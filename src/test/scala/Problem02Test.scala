import org.scalatest.FlatSpec

class Problem02Test extends FlatSpec{

  val solution = new Problem02


  "Problem02.penultimateRecursive" should "remove last but one element" in {
    val list = List(1,2,3,4,5)
    assertResult(4) {
      solution.penultimateRecursive(list)
    }
  }

  it should "throw NoSuchElementException if list has size 1" in {
    val list = List(1)
    assertThrows[NoSuchElementException] {
      solution.penultimateRecursive(list)
    }
  }

  it should "throw NoSuchElementException if list is empty" in {
    val empty = List.empty
    assertThrows[NoSuchElementException] {
      solution.penultimateRecursive(empty)
    }
  }


  "Problem02.penultimateOneRecursiveMatch" should "remove last but one element" in {
    val list = List(1,2,3,4,5)
    assert(solution.penultimateOneRecursiveMatch(list) == 4)
  }

  it should "throw NoSuchElementException if list has size 1" in {
    val list = List(1)
    assertThrows[NoSuchElementException] {
      solution.penultimateOneRecursiveMatch(list)
    }
  }

  it should "throw NoSuchElementException if list is empty" in {
    val empty = List.empty
    assertThrows[NoSuchElementException] {
      solution.penultimateOneRecursiveMatch(empty)
    }
  }


  "Problem02.penultimateReverse" should "remove last but one element" in {
    val list = List(1,2,3,4,5)
    assert(solution.penultimateReverse(list) == 4)
  }

  it should "throw NoSuchElementException if list has size 1" in {
    val list = List(1)
    assertThrows[NoSuchElementException] {
      solution.penultimateReverse(list)
    }
  }

  it should "throw NoSuchElementException if list is empty" in {
    val empty = List.empty
    assertThrows[NoSuchElementException] {
      solution.penultimateReverse(empty)
    }
  }

}
