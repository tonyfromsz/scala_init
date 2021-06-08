package com.tony.scala.ch05.Object19

object ScalaTest_Object01 {

    /*
        java 面向对象
        package com.atguigu.xxxx

        import java.util.List;
        import static java.xxx.Test.*;

        public class User {

            private String name;

            public void test() {

            }
        }

        package : 1. 区分类： java.util.Date, java.sql.Date
                  2. 管理类：bean, util.
                        ControllerUser
                        ControlerDept
                        ServiceUser
                        ServiceDept
                  3. 包访问权限（X）

        import : 1. 导类
                 2. 静态导入

        class :
        interface :
        ++


        scala 面向对象

        package
        import
        没有interface
        属性
        方法
        */
    def main(args: Array[String]): Unit = {
        val user = new User
        println(user.toString)
    }

    class User{

    }

}
