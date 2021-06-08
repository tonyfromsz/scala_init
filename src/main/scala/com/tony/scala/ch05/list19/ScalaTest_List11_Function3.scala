package com.tony.scala.ch05.list19

object ScalaTest_List11_Function3 {
    def main(args: Array[String]): Unit = {
        // 简化，规约
        // 将集合中的数据通过指定的计算规则进行合并，最终只有一个结果
        // reduce

        val list1 = List(1, 2, 3, 4, 5, 6)

        println(list1.reduce((x, y)=>{x-y}))
        println(list1.reduce(_-_))
        println(list1.reduceRight(_-_)) //1-(2_(3-(4-(5-6))))
        println(list1.reduceRight((x,y)=>{x-y}))
    }

}
