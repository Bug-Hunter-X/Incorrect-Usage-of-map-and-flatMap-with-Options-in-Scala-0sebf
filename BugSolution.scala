```scala
import scala.util.Try

case class Result[T](value: Option[T], error: Option[String])

val result1: Result[Int] = Result(Some(10), None)
val result2: Result[Int] = Result(None, Some("Error!"))

// Solution: Use flatMap to correctly handle the error case.
val combinedResult1: Result[Int] = result1.flatMap(x => Result(Some(x * 2), None))
val combinedResult3: Result[Int] = result2.flatMap(x => Result(Some(x * 2), None)) // Correct solution

//Alternative Solution
val combinedResult4: Result[Int] = result2.map(x => x * 2).flatMap(x => Result(Some(x),None))

println(s"combinedResult1: $combinedResult1")
println(s"combinedResult3: $combinedResult3")
println(s"combinedResult4: $combinedResult4")
```