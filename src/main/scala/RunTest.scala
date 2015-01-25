/**
 * Created by mikemakaroff on 1/24/15.
 */
object RunTest extends App{

 def abs(n: Int): Int =
   if (n< 0) -n
   else n
 def factorial(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc: Int): Int =
    if (n <= 0) acc
    else go (n-1, n*acc)
  go(n,1)
 }
 private def formatAbs(x: Int) = {
   val msg = "The absolute alue of %d is %d."
   msg.format(x, abs(x))
 }

 private def formatFactorial(n: Int) = {
  val msg = "The factorial of %d is %d."
  msg.format(n, factorial(n))
 }
 def formatResult(name: String, n: Int, f: Int => Int) = {
  val msg = "The %s of %d is %d."
  msg.format(name, n, f(n))
 }

 println(formatAbs(-40))
 println(formatFactorial(10))
 println(formatResult("absolute value",22,abs))
 println(formatResult("factorial",5,factorial))

}
