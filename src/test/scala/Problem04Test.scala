import org.scalatest.FlatSpec

class Problem04Test extends FlatSpec {

  val solution = new Problem04

  "Problem04.lengthRecursive" should "return the number of elements of a list" in {

    val input1 = List(1,2,3)
    assertResult(3) {
      solution.lengthRecursive(input1)
    }

    val input2 = List(1)
    assertResult(1) {
      solution.lengthRecursive(input2)
    }

    val input3 = List.empty
    assertResult(0) {
      solution.lengthRecursive(input3)
    }
  }


  "Problem04.lengthCount" should "return the number of elements of a list" in {

    val input1 = List(1,2,3)
    assertResult(3) {
      solution.lengthCount(input1)
    }

    val input2 = List(1)
    assertResult(1) {
      solution.lengthCount(input2)
    }

    val input3 = List.empty
    assertResult(0) {
      solution.lengthCount(input3)
    }
  }

}
