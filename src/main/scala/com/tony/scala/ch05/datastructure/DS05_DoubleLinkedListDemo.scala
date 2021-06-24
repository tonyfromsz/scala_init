package com.tony.scala.ch05.datastructure

object DS05_DoubleLinkedListDemo {
    def main(args: Array[String]): Unit = {
        val node1 = new HeroNode2(1, "刘备", "玄德")
        val node2 = new HeroNode2(2, "关羽", "云长")
        val node3 = new HeroNode2(3, "张飞", "翼德")
        val node4 = new HeroNode2(4, "诸葛亮", "孔明")
        val node5 = new HeroNode2(5, "赵云", "子龙")

        val dll = new DoubleLinkedList()
        dll.add(node1)
        dll.add(node2)
        dll.add(node3)
        dll.add(node4)
        dll.add(node5)

        dll.list()

    }
}

class DoubleLinkedList{
    val head = new HeroNode2(-1, "", "")

    def add(heroNode: HeroNode2): Unit ={

        var temp = head
        while (temp.next != null){
            temp = temp.next
        }
        temp.next = heroNode
        heroNode.pre = temp
    }

    def list(): Unit ={
        var temp = head.next
        while (temp != null){
            printf("%d:,  %s, %s\n", temp.no, temp.name, temp.nickName)
            temp = temp.next
        }
    }
}


class HeroNode2(hNo: Int, hName: String, hNickName: String){
    val no = hNo
    var name = hName
    var nickName = hNickName
    var next: HeroNode2 = null // 指向后一个节点
    var pre: HeroNode2 = null // 指向前一个节点

}