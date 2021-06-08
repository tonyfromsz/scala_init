package com.tony.scala.ch05.list19

import scala.collection.mutable

object ScalaTest_List05_Map {
    def main(args: Array[String]): Unit = {
        // Set
        // Map 集合 ,存储K-V对
        // 默认创建不可变Map集合
        // Scala中K-V对声明方式为 ：K -> V

        val map1 = Map(1->"a", 2->"b", 3->"c")
        map1.foreach(println)

        println("====0====")

        val map2 = mutable.Map(1->"a", 2->"b", 3->"c", 4->"d")

        // map集合中+号运算会产生新的Map集合，如果需要使用同一个集合，那么使用+=运算符
        map2 += (5->"e")
        println(map2)

        println("====1====")

        // 删除数据
        map2 -= (4)
        println(map2.mkString(","))

        println("====2====")

        // 修改数据
        map2.update(2, "g")

        // 查询数据
        for (elem <- map2.keysIterator) {
            println(elem)
        }
        for (elem <- map2.valuesIterator) {
            println(elem)
        }

        println("====3====")

        // 查询指定key的数据
        println(map2.get(1).get)
        println(map2.get(1))

        // 为了防止Map获取数据获取不到，出现异常，会返回特殊类型（Option）的对象(Some, None)
        // 如果查询到指定的key，返回特殊的对象Some(value)

        // 如果查询不到指定的key，返回特殊的对象None
        println(map2.getOrElse(6, 0))

        // 如果查询不到指定的key，会发生异常
        // println(map2(6))

        println(map2.getOrElse(7, -1))
        println("====4====")


        map2.foreach( ( o )=>{ println(o._1+"="+o._2) } )





    }

}
