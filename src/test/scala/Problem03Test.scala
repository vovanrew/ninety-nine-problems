import org.scalatest.FlatSpec

class Problem03Test extends FlatSpec {

  val solution = new Problem03

  "Problem03.nthRecursive" should "return nth element of a list" in {
    val input = List(1,2,3,4,5)

    assertResult(2) {
      solution.nthRecursive(3, input)
    }
  }

  it should "throw IndexOutOfBoundsException if first argument is negative" in {

    val input = List(1)

    assertThrows[IndexOutOfBoundsException] {
      solution.nthRecursive(-1, input)
    }

  }

  it should "throw IndexOutOfBoundsException if first argument is greater that list size" in {

    val input = List(1)

    assertThrows[IndexOutOfBoundsException] {
      solution.nthRecursive(2, input)
    }
  }

  it should "throw IndexOutOfBoundsException if list is empty" in {
    val input = List.empty

    assertThrows[IndexOutOfBoundsException] {
      solution.nthRecursive(0, input)
    }
  }

}
