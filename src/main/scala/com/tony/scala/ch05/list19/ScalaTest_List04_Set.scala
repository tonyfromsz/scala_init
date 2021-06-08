package com.tony.scala.ch05.list19

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ScalaTest_List04_Set {
    def main(args: Array[String]): Unit = {
        // Set 集合：无序，不可重复
        val set1: Set[Int] = Set(1, 2, 3, 4)

        set1.foreach(println)

        println("====0=====")

        // 可变Set集合
        val set2: mutable.Set[Int] = mutable.Set(5, 3, 2, 4)
        set2.foreach(println)

        println("====1=====")

        // 增加数据
        set2.add(6)
        set2.add(6)
        set2.add(7)
        set2.add(7)
        set2.foreach(println)

        println("====2=====")
        set2.remove(5)
        set2.foreach(println)




    }

}
