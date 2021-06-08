package com.tony.scala.ch05.list19

object ScalaTest_List10_Function2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(1,2,3,4)
        val lists1 = List(List(1,2),List(3,4), List(5, 6))
        // List(2,4,6,8)

        // 过滤 filter
        // 通过指定函数的返回结果决定集合中每一个数据是否保留:true保留，false丢弃
        println("filter")
        println(list1.filter(x=>true))
        println(list1.filter(x=>{x%2==0}))
        println(list1.filter(_%2==0))
        println("====0====")

        // 映射/转换 map
        // 将集合的每一条数据进行转换，映射到新的集合中
        println("map")
        println(list1.map(x=>{x*2}))
        println(list1.map(_*2))
        println(list1.map(i => (i, i*2)))

        println("====1====")
        // println(map(list1.map(i => (i, i*2))))
        println(list1(1))
        println(list1.map(i => (i, i*2)))

        println("====2=====")

        // 扁平化
        println(lists1)
        println(lists1.flatten)
        println(lists1.flatten.map(_*2))
        // 扁平化-转换
        println(lists1.flatMap(_.map(_*2)))
        println(lists1.flatMap(list=>list.map(_*2)))

        println("====3====")
        val wordList = List("Hello Scala", "Hello Spark", "Hello Hadoop")
        println(wordList.flatMap(_.split(" ")))

        // 分组
        // 通过指定的规则进行分组,规则函数的返回结果作为分组的key,将分组后的数据封装为集合作为value

    }

}
