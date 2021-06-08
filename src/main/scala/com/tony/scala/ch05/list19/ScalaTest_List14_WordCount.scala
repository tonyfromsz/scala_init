package com.tony.scala.ch05.list19

object ScalaTest_List14_WordCount {
    def main(args: Array[String]): Unit = {

        val lineList = List(("Hello Scala World", 4), ("Hello World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

        val flatMaps:List[(String, Int)] = lineList.flatMap(t => {
            val line:String = t._1
            val words = line.split(" ")
            words.map(w=>(w, t._2))
        })
        println(flatMaps)

        // 单词分组
        val groudList: Map[String, List[(String, Int)]] = flatMaps.groupBy(t=>t._1)
        println(groudList)
        // Map(
        //  Hbase -> List((Hbase,1)),
        //  Scala -> List((Scala,4)),
        //  Hello -> List((Hello,4), (Hello,4), (Hello,3), (Hello,2), (Hello,1)),
        //  Hadoop -> List((Hadoop,2)),
        //  World -> List((World,4), (World,4), (World,3))
        //  )

        // 加和
        // val stringToIntList = groudList.map(t => {(t._1, t._2.map(tt => tt._2).sum)})
        val stringToIntList = groudList.mapValues(datas => {datas.map(tt => tt._2).sum})
        println(stringToIntList)

        // 排序
        val sortList = stringToIntList.toList.sortWith((left, right) => left._2 > right._2)
        println(sortList)

        val resultList = sortList.take(3)
        println(resultList)



    }

}
