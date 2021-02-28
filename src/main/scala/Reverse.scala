import scala.io.StdIn.readLine

object Reverse {

  //Method for reverse a value without using mutable value
  def reverse(value : String): Array[Char] ={
    //declared array used as a storing variable for the reverse value
    val result:Array[Char] = new Array[Char](value.length)
    var posOfValue = value.length // Using var variable only for iteration
    var posOfArray = 0            // Using var variable only for iteration
    while(posOfValue > 0){
      result(posOfArray) = value.charAt(posOfValue-1) /* "String.valueOf(value.charAt(posOfValue-1))" means take every character from the
                                                          value in reverse order and put in the array from front
                                                       */
      posOfArray = posOfArray + 1
      posOfValue = posOfValue - 1
    }
    result
  }
  def main(Args : Array[String]): Unit ={
    val value: String = readLine()
    val result:Array[Char] = reverse(value)
    for ( x <- result ) {
      print( x )
    }
  }


}
