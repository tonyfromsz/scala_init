package com.tony.scala.ch05.list19

object ScalaTest_List05_Tuple {
    def main(args: Array[String]): Unit = {
        // Tuple : 元组， 将多个无关的数据当成一个整体来使用
        // 元组采用小括号的来封装数据

        // 元组中最大能放置的数据的个数为22
        // 函数的参数个数最多也只能有22个
        val tpl1 = (List(1, 2, 3, 4), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
        println(tpl1)

        // 当元组中只有两个元素的时候，称之为对偶，也称之为键值对
        val tpl2 = (1, "a")
        val tpl3 = (2, "b")
        val tpl4 = (3, "c")
        val map2 = Map(tpl2, tpl3, tpl4)
        println(map2)

        println("====0====")
        // 访问元组, 可以通过顺序号进行访问,从_1开始
        println(tpl1._1)
        println(tpl1._2)
        println(tpl1._3)

        println("====1====")

        // 通过索引的方式获取数据, 从0开始
        println(tpl1.productElement(0))
        println(tpl1.productElement(4))

        // 通过迭代器的方式遍历数据
        val iter = tpl1.productIterator
        while (iter.hasNext){
            println(iter.next())
        }


    }

}
