package com.tony.scala.ch05.Object19

package Test1{
    package Test2{
        class User1{

        }
    }
}

package Test2{
    import com.tony.scala.ch05.Object19.Test1.Test2.User1
    class User2{
        val user2 = new User1()
        println("user2")
    }
}

object ScalaTest_Object02 {
    def main(args: Array[String]): Unit = {
//        import com.tony.scala.ch05.Object19.Test3.User2
//        val user = new User2()
//        println(user)
    }

}
