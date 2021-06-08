package com.tony.scala.ch05.list19

object ScalaTest_List01 {
    def main(args: Array[String]): Unit = {
        for( i <- Range(1, 10)){
            println(s"i: ${i}")
        }

        for( j <- 1.to(10)){
            println(s"j: ${j}")
        }

        for( z <- 1 to 10){
            println(s"z: ${z}")
        }
    }

}
