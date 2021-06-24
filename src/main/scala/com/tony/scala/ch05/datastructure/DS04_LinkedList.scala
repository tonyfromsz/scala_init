package com.tony.scala.ch05.datastructure
import scala.util.control.Breaks.breakable
import scala.util.control.Breaks.break


object DS04_LinkedList {
    def main(args: Array[String]): Unit = {
        val node1 = new HeroNode(1, "刘备", "玄德")
        val node2 = new HeroNode(2, "关羽", "云长")
        val node3 = new HeroNode(3, "张飞", "翼德")
        val node4 = new HeroNode(4, "赵云", "子龙")

        val shuLinkedList = new SingleLinkedList()
        shuLinkedList.add(node1)
        shuLinkedList.add(node2)
        shuLinkedList.add(node3)
        shuLinkedList.add(node4)

        shuLinkedList.list()
        val node5 = new HeroNode(4, "诸葛亮", "孔明")
        shuLinkedList.update(node5)
        shuLinkedList.list()




    }
}

class SingleLinkedList{
    val head = new HeroNode(-1, "", "")
    var tail = head

    def add(node: HeroNode): Unit ={
        tail.next = node
        tail = node

    }

    def list(): Unit ={
        if(isEmpty()){
            println("链表为空")
            return
        }
        var temp = head.next
        while (temp != null){
            printf("%d, %s, %s, \n", temp.no, temp.name, temp.nickName)
            temp = temp.next
        }
    }

    def update(node: HeroNode): Unit ={
        if (isEmpty()){
            println("链表为空")
            return
        }
        var temp = head.next
        var flag = false
        breakable{
            while (temp != null){
                if (node.no == temp.no){
                    flag = true
                    break()
                }

                temp = temp.next
            }
        }
        if (flag){
            temp.name = node.name
            temp.nickName = node.nickName

        }


    }

    def isEmpty():Boolean = {
        head == tail
    }
}


class HeroNode(hNo: Int, hName: String, hNickName: String){
    val no = hNo
    var name = hName
    var nickName = hNickName
    var next: HeroNode = _

}
