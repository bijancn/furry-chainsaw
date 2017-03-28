package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}

object Fibonacci extends (Int => Int) with App {
  def apply(n: Int): Int = {
    n match {
      case _ if n < 0 => throw new IllegalArgumentException("Undefined")
      case 0 => 0
      case 1 => 1
      case _ => Fibonacci(n-1) + Fibonacci(n-2)
    }
  }
}
