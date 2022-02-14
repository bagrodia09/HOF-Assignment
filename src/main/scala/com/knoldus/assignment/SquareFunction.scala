package com.knoldus.assignment

class SquareFunction {
  def squareList(numberInList: List[Int]): List[Int] =
    numberInList match {
      case List() => numberInList
      case listHead :: listTail => (listHead * listHead) :: squareList(listTail)
    }
  def squareListWithMap(numberInList: List[Int]): List[Int] =
    numberInList map (listElement => listElement * listElement)
}
