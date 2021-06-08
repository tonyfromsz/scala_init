package com.tony.scala.ch05.list19

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object ScalaTest_List03_List {
    def main(args: Array[String]): Unit = {
        // Seq

        val list1 = List[Int](1, 2, 3, 4)
        val list2 = List[Int](5, 6, 7, 8)

        // 增加数据元素
        // 如果运算符采用冒号结尾，那么调用顺序从后往前
        val ints1: List[Int] = list1 :+ 5
        // nts1.foreach(println)
        // 如果运算符采用冒号结尾，那么调用顺序从后往前
        val ints2 = list1.::(5)
        val ints3 = 5 +: list1
        ints2.foreach(println)
        println("====0====")
        ints3.foreach(println)

        println("====1====")
        // 合并集合
        val list3: List[Int] = list1.++(list2)
        list3.foreach(println)

        println("====2====")
        val list4: List[Any] = list1::list2
        //
        list4.foreach(println)
        println(s"length: ${list4.length}")
        println(list4.mkString(","))

        println("====3====")
        // 扁平化
        val list5: List[Int] = list1:::list2
        // val list5: List[Any] = list1:::list2
        list5.foreach(println)
        println(s"length: ${list5.length}")
        println(list5.mkString(","))

        println("====4====")
        val list6: List[Int] = list1.updated(1, 4)
        list6.foreach(println)
        println(s"length: ${list6.length}")

        println("====5====")
        // 空集合
        val emptyList1 = List()
        val emptyList2 = Nil
        val list7: List[Any] = 1::2::3::List(4, 5)::Nil
        val list8: List[Any] = 1::2::3 +: List(4, 5)::Nil
        list7.foreach(println)
        println(s"length: ${list7.length}")

        println("====6====")
        // val list8: List[Any] = 1::2::3 +: List(4, 5)::Nil
        // list8.foreach(println)
        // println(s"length: ${list8.length}")
        println("====7====")


        // 可变List集合
        val listBuffer: ListBuffer[Int] = new ListBuffer[Int]()

        // 增加数据
        listBuffer.append(1, 2, 3, 4, 5)
        listBuffer.insert(0, 7, 8, 9, 0)
//        listBuffer.updated()
        listBuffer.foreach(println)

        println("====8====")

        println("====9====")






    }

}
