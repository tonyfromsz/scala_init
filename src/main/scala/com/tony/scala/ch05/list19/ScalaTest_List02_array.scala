package com.tony.scala.ch05.list19

import scala.collection.mutable.ArrayBuffer

object ScalaTest_List02_array {
    def main(args: Array[String]): Unit = {
//         java 不可变数组对象
//        int[] arr = new int[10];
//        arr[0] = 1;
//        for (int i=0, i <10, i++){
//            arr[i] = i;
//            System.out.println(arr[i])
//        }

        // scala数组对象
        val arr = new Array[Int](10)

        for(i <- Range(0, 10)){
            // 赋值, 使用小括号增加索引进行定位修改
            arr(i) = i
            println(s"arr(${i}): ${arr(i)}")

            // 长度
            println(s"arr length: ${arr.length}")
        }
        // 遍历
        for( j <- arr){
            println(j)
        }

        // 集合变字符串
        //println(arr.mkString(""))

//        def printlnx(i : Int): Unit={
//            println(s"i = ${i}")
//        }
//        arr.foreach(printlnx)
//
//        arr.foreach((i:Int)=>{println(i)})
//        println("========0=========")
//        arr.foreach((i:Int)=>println(i))
//        println("========1=========")
//        arr.foreach((i)=>println(i))
//        println("========2=========")
//        arr.foreach(i=>println(i))
//        println("========3=========")
//        arr.foreach(println(_))
//        println("========4=========")
//        arr.foreach(println)

        val ints: Array[Int] = arr:+3
        println(ints.mkString(","))

        val ints1: Array[Int] = 2+:arr
        println(ints.mkString("_"))

        val buffer_arr = new ArrayBuffer[Int]()
        // 可变集合转变成不可变集合
        val arr2: Array[Int] = buffer_arr.toArray

        val buffer1: ArrayBuffer[Int] = ArrayBuffer[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        buffer1.append(11)
        buffer1.append(12)
        buffer1.append(14)

        buffer1.remove(12)

        buffer1.foreach(println)
        println(buffer1.length)





    }

}
