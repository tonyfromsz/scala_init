package com.tony.scala.ch05.list19

object ScalaTest_List07_Operate {
    def main(args: Array[String]): Unit = {
        val list1 = List(1, 2, 3, 4, 5, 6)
        println(list1.length)
        println(list1.size)

        println("====0====")

        // 循环遍历
        for (elem <- list1) {
            println(elem)

        }

        // 循环遍历
        println("====1====")
        list1.foreach(println)

        // 迭代器
        val iter = list1.productIterator
        while (iter.hasNext){
            println(iter.next())
        }

        println(list1.contains(4))
        println(list1.contains(8))
    }
}
