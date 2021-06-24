package com.tony.scala.ch05.datastructure
import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break

object DS06_CircleLinkedListDemo {
    def main(args: Array[String]): Unit = {
        val boy0 = new Boy(0)
        val boy1 = new Boy(1)
        val boy2 = new Boy(2)

        val joseph = new CircleLinkedList()
//        joseph.list()
        joseph.addBoy(boy0)
        joseph.addBoy(boy1)
        joseph.addBoy(boy2)

        joseph.list()

    }
}

class CircleLinkedList{
    var first:Boy = _
    var helper:Boy = _
    var curBoy:Boy = _

    def addBoy(boy: Boy): Unit ={

        if (isEmpty()){
            printf("环形链表为空！准备添加%d \n", boy.no)
            first = boy
            curBoy = boy
            first.next = first
            printf("%d添加成功！\n", first.no)
            println(curBoy.no)
        }else{
            curBoy.next = boy
            boy.next = first
            curBoy = boy
            printf("%d添加成功！\n", curBoy.no)
        }
    }

    def list(): Unit ={
        var thisBoy: Boy = first
        if(isEmpty()){
            printf("空链表")
            return
        }
        breakable {
            while (true) {
                printf("第%d个kid\n", thisBoy.no)
                if (thisBoy.next == first) {
                    break()
                }
                thisBoy = thisBoy.next
            }
        }
    }

    def isEmpty(): Boolean ={
        first == null
    }

}


class Boy(boyNo: Int){
    val no: Int = boyNo
    var next: Boy = null
}
