# Incorrect Usage of map and flatMap with Options in Scala

This example showcases a subtle but common error when using `map` and `flatMap` with `Option` or similar monadic types in Scala. The problem arises from applying `map` even when an error is present, leading to potentially unexpected behavior.

The `Result` case class represents a computation that might either succeed with a value or fail with an error. Correct usage of `flatMap` ensures that the subsequent computation only proceeds if the previous one was successful.

## How to run the code

1. Save the provided `Bug.scala` and `BugSolution.scala` files.
2. Compile and run the code using a Scala compiler (e.g., `scalac Bug.scala` and `scala Bug`).

## Understanding the bug and solution

The `Bug.scala` file demonstrates the incorrect and correct ways to combine the `Result` instances using `map` and `flatMap`. `flatMap` is the appropriate approach when you want to short-circuit the operation on error conditions while `map` always applies irrespective of the result.