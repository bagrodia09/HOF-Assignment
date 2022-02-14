package com.knoldus.assignment

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

class SquareFunctionTest extends AnyFlatSpec {
  class SquareFunctionTest extends AnyFunSuite {
    val functionObj = new SquareFunction
    val numberInList = List(1,3,5,7,4)
    "test" should "square the each element of list(2,3,4,5)" in {
      val providedList = List(2,4,6,8)
      val expectedList = List(4,16,36,64)
      assert(functionObj.squareList(providedList) == expectedList)
    }
    "test" should "return the Empty list as our input list is empty" in {
      val providedList = List()
      assert(functionObj.squareList(providedList) == List())
    }
    "test" should "check that both equivalent functions should return same result" in {
      assert(functionObj.squareList(numberInList) == functionObj.squareListWithMap(numberInList))
    }
  }
}
