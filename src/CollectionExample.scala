import scala.collection.immutable.List
import scala.collection.mutable.TreeSet

class ListExample{
  val list1=List(1,2,3,5,6,7,8,9)
  val list2= 21::(22::(23::(24::Nil)))
  def display = {
   /*for(x<-list1){
      println(x)
    }
    for(x<-list2){
      println(x)
    }*/
    println(list2)
    /*var list3=list1:::list2
    
    for(x<-list3){
      println(x)
    }
    var list4=List.concat(list1,list2)
    println(list4)*/
    
    var list5=List.fill(10)(2)
    println(list5)
    
    var tabluating= List.tabulate(6)(n=>n*n)
    println(tabluating)
    
    var mul=List.tabulate(4, 5)(_*_)
    println(mul)
    
    println(list5.sum)
    
    println(list2.toSet)
    
  }
}

class SetExample{
  
  def display={
    
    var set1=Set(2,3,4,6,7)
    var set2=Set(5,7,8,9)
    println(set1.drop(2))
    println(set1.toList)
    set1.foreach { x => println(x) }
    
    var set3=set1++set2
    println(set3)
    
    var set4=set1.++(set2)
    println(set4)
    println(set1.contains(3))
    
    var treeSet=TreeSet(3,6,2,4,7,8)
    println(treeSet)
  }
  
}

class MapExample{
  def display = {
    var map=Map((2,"hello"),(4,"raghu"),(5,"ram"))
    println(map.keys)
    println(map.values)
    println(map.init)
    println(map.drop(2))
  }
}

class TupleExample{
  def display = {
    var t1 = (1, "Hello", 10.5)
    var t2 = new Tuple3(2,"world", 20.9)
    var t3 = new Tuple2("ven","kri")
    println(t1)
    t2.productIterator.foreach { x => println(x) }
    
    println(t1.toString())
    println(t3.swap)
  }
}

class OptionsExample{
  def display = {
    val map = Map(1 -> "hello",2 -> "world")
    println(show(map.get(3)))
    println(show(map.get(2)))
  }
  
  def show(x: Option[String]) = x match {
    case Some(x) =>  x.toString()
    case None => "?"
  }
}

class IteratorExample{
  def display = {
    
    val it = Iterator(1,4,7,4,8)
    while(it.hasNext)
      println(it.next())
    
      println(it.length)
  }
}

object CollectionExample {
  def main(args: Array[String]): Unit = {
    /*var obj=new ListExample
    obj.display*/
    
    //var obj=new SetExample
    
    //var obj=new MapExample
    
    //var obj=new TupleExample
    
    //var obj=new OptionsExample
    
    var obj = new IteratorExample
    obj.display
  }
  
}