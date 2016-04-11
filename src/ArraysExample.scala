import Array._
import java.io.IOException

object ArraysExample {
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,5,6)
    for(x<-arr;i<- 1 to 3){
      println(x)
    }
    println(arr.min)
    
    var mymatrix = ofDim[Int](2,3)
    try{
    for(i<-0 to 1; j<- 0 to 2){
      mymatrix(i)(j)=i+j
    }
    for(i<-0 to 2; j<- 0 to 2){
      print(mymatrix(i)(j)+ " ")
      if(j==2) println()
    }
    }
    catch{
      case ex:IOException => {
        println("Exception occur")
      }
      case ex:ArrayIndexOutOfBoundsException => {
        println(" index out of bound")
      }
    }
  }
}