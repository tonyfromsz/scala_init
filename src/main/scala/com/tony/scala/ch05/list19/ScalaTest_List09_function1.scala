package com.tony.scala.ch05.list19

object ScalaTest_List09_function1 {
    def main(args: Array[String]): Unit = {

        val list1 = List(1, 2, 3, 4, 5, 6, 7, 8)
        val list2 = List("a5", "b4", "c3", "d2", "e1")

        // 求和，求积，最大值最小值
        println(list1.sum)
        println(list1.product)
        println(list1.max)
        println(list1.min)

        println("====0====")
        // 排序
        println(list1.sortBy(x=>x))
        println(list1.sortBy(x=>{-x}))

        println(list2.sortBy(x=>{x.charAt(1)}))




    }

}
