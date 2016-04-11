import scala.util.control.Breaks

class Point(xc: Int, yc: Int) {
  val x: Int = xc
  val y: Int = yc
  def move(dx: Int, dy: Int): Point =
    new Point(x + dx, y + dy)
}
class ColorPoint(u: Int, v: Int, c: String) extends Point(u, v) {
  private[ColorPoint] var a:Int =30
  println(a)
  val color: String = c
  def compareWith(pt: ColorPoint): Boolean =
    (pt.x == x) && (pt.y == y) && (pt.color == color)
  override def move(dx: Int, dy: Int): ColorPoint =
    new ColorPoint(x + dy, y + dy, color)
}

object HelloWorld{
  def main(args: Array[String]): Unit = {
    var _name:String ="val"
    var + =10
    println('name)
    
    val (val1:Int,val2:String) = (10,"hello")
    println(val1)
    println(val2)
    
    var cp:ColorPoint = new ColorPoint(10,20,"red")
    println(cp)
    println(cp.move(5, 5))
    
    println("x="+cp.x)
    println("y="+cp.y)
    println("color="+cp.color)
    
    
    for(a<- 1 until 10){
      println("values are:"+a)
    }
    
   var li=List(1,2,3,4,5)
   for(i<-li){
     println("list:"+i)
   }
    
   var loop = new Breaks
   loop.breakable{
   for(a <- 1 until 10){
     println("values: " + a)
     if(a==5)
       loop.break
   }
   }
   printString("hello","variable","trtrt")
   
  }
  def printString(args :String*):Unit={
    for(arg<-args){
      println(arg)
    }
  }
  
}