import scala.io.StdIn

object Scala02_operator {
//  def main(args: Array[String]): Unit = {
////    var i = 1
////    println(i)
//
//    var r1 : Integer = 10 / 3
//    println(r1)
//
//    for(i <- 1 to 10){
//      println(s"i = ${i}")
//    }
//  }


  def main(args: Array[String]): Unit = {
//    var i = 1
//    i += 1
//    println(i)
//
//    for( i <- 0 until 20){
//      println(s"i = ${i}")
//    }

//    var i = for (i <- 1 to 10) yield i*2
//    println(i)
//    acc_add()
    six_add()

  }

  def acc_add(): Unit = {
    var total = 0
    var count = 0
    for(i <- 1 to 100){
      if(i%9==0){
        count += 1
        total += i

      }
    }
    println(s"count: ${count}")
    println(s"total: ${total}")
  }

  def six_add(): Unit={
    println("请输入")
    var num = StdIn.readInt()
    for(i <- 0 to num){
      println(s"${i} + ${num-i} = ${num}")

    }
  }
}
