package example

import org.scalatest.{Matchers,FlatSpec}

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}

class FibonacciSpec extends FlatSpec with Matchers {
  "The Fibonacci object" should "compute the Fibonacci sequence" in {
    Fibonacci(0) shouldEqual 0
    Fibonacci(1) shouldEqual 1
    Fibonacci(2) shouldEqual 1
    Fibonacci(3) shouldEqual 2
    Fibonacci(4) shouldEqual 3
    Fibonacci(5) shouldEqual 5
    Fibonacci(6) shouldEqual 8
    Fibonacci(7) shouldEqual 13
  }
  it should "throw StackOverFlowError on negative numbers" in {
    a[IllegalArgumentException] should be thrownBy {
      Fibonacci(-1)
    }
  }
}
