

object StringExample {
  def main(args: Array[String]): Unit = {
    var str1:String="hello world"
    var str2:String="venkat"
    println("char at position 5 in str1: "+ str1.charAt(5))
    println("compare the str1 with str2: "+ str1.compareTo(str2))
    println("compare the str1 with str2 by ignore the case: " + str1.compareToIgnoreCase(str2))
    println("concat the str1 with str2: "+ str1.concat(str2))
    println("content equals str1 and str2: "+ str1.contentEquals(str2))
    println("string ends with: "+str1.endsWith("ld"))
    println("bytes of string:"+(str1.getBytes).toString())
    println("canonical name: "+str1.intern())
    println("String matches: "+str1.matches("hello*"))
  }
}