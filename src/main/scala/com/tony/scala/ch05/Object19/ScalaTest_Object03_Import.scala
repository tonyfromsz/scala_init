package com.tony.scala.ch05.Object19

import scala.beans.BeanProperty

object ScalaTest_Object3_Import {
    def main(args: Array[String]): Unit = {
        val user1 = new User3()
        user1.name = "admin"
        val bool = user1.login(username = user1.getName, pwd = "a")


    }
}


class User3{
    @BeanProperty
    var name:String = _
    @BeanProperty
    var age:Int = _
    @BeanProperty
    var email:Any = null

    def login(username: String, pwd: String ):Boolean ={
        if (username =="admin" && pwd =="admin"){
            println("login success!")
            return true

        }else{
            println("fail!")
            return false

        }
    }
}