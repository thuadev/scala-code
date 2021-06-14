package chapter1

object MaxFunctional extends App {
  val list = List(1, 2, 3, 4, 5)

  /**
   * /: is deprecated, use foldLeft
   */
  println("Maximum is  " +
    (list(0) /: list) { (large, elem) =>
      if (elem > large) elem else large
    })

  (Integer.MIN_VALUE /: list
    ) { (large, elem) => {
    println(large, elem)
    if (elem > large) elem else large
  }
  }
  val a = 1
  println(list.foldLeft(list(0)) {
    Math.max
  })
}
