package com.mj.kotlinproject

/**
 * Created by lenovo on 2017/7/27.
 */

fun  main(){
    println("hello world!")
    println(Main(1,"数据"))

}

data  class Main(val id:Int,val name:String)


fun array(args: Array<out String>){
    args.map {println(it)}
}

fun arrayList(args: ArrayList<out String>){
    args.map {println(it)}
}

fun list(args: List<out String>){
    args.map {println(it)}
}
