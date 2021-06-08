package com.tony.scala.ch05.list19

object ScalaTest_List12_Function4 {
    def main(args: Array[String]): Unit = {

        // 折叠
        // 将集合中的数据和集合之外的数据通过指定的计算规则进行合并，最终只有一个结果
        // fold

        val list1 = List(1, 2, 3, 4, 5, 6)

        println(list1.fold(10)(_ + _))

        println(list1.foldRight(30)(_ - _)) //
    }
}
