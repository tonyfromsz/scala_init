package com.tony.scala.ch05.datastructure

import scala.collection.mutable.ArrayBuffer

object DS01_SparseArrayDemo {
    def main(args: Array[String]): Unit = {
        val rows = 11
        val cols = 11
        val chessMap = Array.ofDim[Int](rows, cols)

        chessMap(1)(2) = 1
        chessMap(2)(3) = 2

        for(row <- chessMap){
            for(item <- row){
                printf("%d ", item)

            }
            println()

        }


        // 对原始数据进行压缩
        // 思路：
        // 1、创建一个ArrayBuffer，可以动态添加对象
        // 2、创建一个Node对象存储数据

        val sparseArray = ArrayBuffer[Node]()
        sparseArray.append(new Node(rows, cols, 0))
        // 如果有发现非0的的值，就把之放到sparseArray对象
        for(i <- 0 until chessMap.length){
            for (j <- 0 until chessMap(i).length){
                if(chessMap(i)(j) != 0) {
                    sparseArray.append(new Node(i, j, chessMap(i)(j)))
                }
            }
        }

        for (i <- 0 until sparseArray.length){
            val node = sparseArray(i)

            printf("%d %d %d", node.row, node.col, node.value)
            println()
        }

        val node = sparseArray(0)
        val newArray = Array.ofDim[Int](node.row, node.col)
        for (i <- 1 until sparseArray.length){
            val currentNode = sparseArray(i)
            newArray(currentNode.row)(currentNode.col) = currentNode.value
        }

        for (i <- 0 until newArray.length){
            for (j <- 0 until newArray(i).length){
                printf("%d ", newArray(i)(j))

            }
            println()
        }



    }

}



class Node(val row:Int, val col:Int, val value:Int){


}
