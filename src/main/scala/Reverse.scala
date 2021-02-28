import scala.annotation.tailrec

object Reverse {

  //Method for reverse a list without using mutable value
  @tailrec
  def reverse(old_list: List[Int], new_list:List[Int] ):List[Int] = {
    if(old_list.isEmpty) new_list // if the old list is empty then return the new one
    else {
      reverse(old_list.tail , old_list.head :: new_list) /* Here I use the recursion to implement the reverse function on the list
                                                            In list :: use to append the element from head we called it cons
                                                            so, I take the tail of the list AND head from the old list (given) add it to the new list(result) i.e
                                                            => old(1,2,3,4)  new()
                                                            => old(2,3,4)  new(1)
                                                            => old(3,4)  new(2,1)
                                                            => old(4)  new(3,2,1)
                                                            => old() new(4,3,2,1)
                                                          */
    }
  }

  def main(Args : Array[String]): Unit ={
    val list1:List[Int] = List(1,2,56,45,8)
    val list2:List[Int] = List(1,2,32)
    val list3:List[Int] = List(1,2,32,54548,5,8,2,5)
    val list4:List[Int] = List(1,2,3,4,5,6,7)
    val list5:List[Int] = List(1,2,367,6,4,3)
    val list6:List[Int] = List(1,2,4,8,7,6)
    println(reverse(list1,Nil)) // call reverse function and send parameter as given list and Nil for empty list
    println(reverse(list2,Nil))
    println(reverse(list3,Nil))
    println(reverse(list4,Nil))
    println(reverse(list5,Nil))
    println(reverse(list6,Nil))


  }


}
