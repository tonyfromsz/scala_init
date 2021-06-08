package com.tony.scala.ch05

object Scala05_FunctionHell {
    def main(args: Array[String]): Unit = {

        /*
        def f(): Unit = {
            println("function")

        }

        def f0() = {
            f _
        }

        f0()()
        */

        // TODO 函数柯里化
        def f3(i : Int)(j : Int): Int ={
            i * j
        }

        println(f3(3)(4))


        // TODO 闭包
        // 一个函数在实现逻辑时，讲外部的变量引入到函数的内容，改变了这个变量的生命周期，称之为闭包
        def f1(i : Int)={
            def f2(j : Int): Int = {
                i * j
            }

            f2 _
        }

        println(f1(2)(10))


        // 将函数座位参数传递给另一个函数，需要采用特殊的声明方式
        // () => {}

        def f4(f: ()=>Int): Int={
            f() + 10
        }

        def f5(): Int={
            5
        }
        println("f4")
        println(f4(f5))


        // 使用匿名函数改写
        def f6(f : ()=>Unit): Unit ={
            f()
        }
        println("f6")
        f6(()=>{println("func6")})

        println("f7")
        def f7(f : (Int)=>Unit): Unit={
            f(10)
        }
        f7( (i:Int)=>{println(i)})
        f7( (i)=>{println(i)})
        f7( (i)=>println(i) )
        f7( println(_) )
        f7( println )

    }

}
