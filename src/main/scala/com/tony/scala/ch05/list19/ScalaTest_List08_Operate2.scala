package com.tony.scala.ch05.list19

object ScalaTest_List08_Operate2 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)
        val list1 = List(4, 2, 6, 7, 8)

        // 获取集合的第一个数据（头）
        println("head")
        println(list.head)

        // 获取集合的除了第一个数据以外的所有数据（尾）
        println("tail")
        println( list.tail )

        // 获取集合的最后一个数据
        println("last")
        println(list.last)

        // 获取集合的初始数据
        println("init")
        println(list.init)

        // 反转
        println("reverse")
        println(list.reverse)

        // 取前几个数据
        println("take")
        println(list.take(2))
        println("takeRight")
        println(list.takeRight(2))


        // 去掉数据
        println("drop")
        println(list.drop(1))
        println("dropRight")
        println(list.dropRight(1))

        // 并集
        println("union")
        println(list.union(list1))

        // 交集
        println("intersect")
        println(list.intersect(list1))

        // 差集
        println("diff")
        println(list1.diff(list))

        // 拉链
        // 可以将两个集合中相同位置的数据绑定在一起，形成拉链效果，但是如果其中一个集合数据多，
        // 多出的数据无法实现拉链效果
        println("zip")
        println(list.zip(list1))
        val tpl1 = list.zip(list1)
        val map1 = Map((1, 2), (2, 3), (3, 4))
        println(map1)
        println()

        println("Sliding")

        // 滑窗
        // 将集合中的一部分数据作为整体来使用，这个整体称之窗口，其中的数据称之窗口数据
        // 窗口可以根据计算逻辑进行滑动
        // sliding(size, step)
        // val iterator: Iterator[List[Int]] = list.sliding(3)
        val iterator: Iterator[List[Int]] = list.sliding(3,5)
        while ( iterator.hasNext ) {
            println(iterator.next())
        }

        println("sliding1")
        val list2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        val iterator1:Iterator[List[Int]] = list2.sliding(3, 5)
        while (iterator1.hasNext){
            println(iterator1.next())
        }


    }
}
