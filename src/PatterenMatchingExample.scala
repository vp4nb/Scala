

object PatterenMatchingExample {
  def main(args: Array[String]): Unit = {
    println(matchText(5))
  }
  def matchText(x:Int):String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "any number"
  }
}