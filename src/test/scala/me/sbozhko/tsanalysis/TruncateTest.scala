package me.sbozhko.tsanalysis

import org.scalatest.FunSuite

class TruncateTest extends FunSuite {

  test("List with zero") {
    val actual = Truncate.leftTruncate(0)
    assert(actual === List(0))
  }

  test("Negative value") {
    val thrown = intercept[IllegalArgumentException] {
      Truncate.leftTruncate(-1)
    }
    assert(thrown.getMessage === "Negative 'num'. 'num' should be >= 0.")
  }

  test("List with 1") {
    val actual = Truncate.leftTruncate(1)
    assert(actual === List(1))
  }

  test("Two digits number") {
    val actual = Truncate.leftTruncate(10)
    assert(actual === List(10, 0))
  }

  test("Large number") {
    val actual = Truncate.leftTruncate(378352948)
    assert(actual === List(378352948, 78352948, 8352948, 352948, 52948, 2948, 948, 48, 8))
  }

}
