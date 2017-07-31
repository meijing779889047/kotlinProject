# Kolin的基本使用

##  1.函数声明

* 1.首先创建一个kotlin的class文件，创建之后以.kt为后缀。

![](http://i.imgur.com/ibVf5XM.png)

* 2.声明方法

			fun  main(args:Array<out String>){
			    println("hello world!")
			    println(Main(1,"数据"))
			}

说明：
<br> 1.方法不一定要在类中声明。
<br> 2.在Kotlin中fun 用于标识main是一个方法
<br> 3.arags：表示参数  Array<out String> :表示参数类型，这个跟java是相反的，表示的字符串类型的参数。
<br>4. out 等价于  args instacne String

* 3.类的创建


        data  class Main(val id:Int,val name:String)

说明：
<br> 1.类可以用data来修饰
<br> 2. val 声明id，name是一个实例（对象）  Int,String 是标识它具体的数据类型，等价于  private int id;

* 初始化实例
					
	     val  main= Main(1,"数据")

说明：
<br> 1.数据类型用
<br> 2. 无需再使用new关键字
<br> 3. 数据不可传空。传空编译不通过



## 数组（Array）

#### 定义
*  Array类代表数组
*  []可用于访问数组元素，[]被进行了操作符重载，调用的是Array类的get和set方法



##### 数组的创建
* 采用系统提供方法创建基本类型的数组

            val byteArray:ByteArray=    byteArrayOf(1,2,3)
            val shoertArray:ShortArray=  shortArrayOf(10,11,12)
            val intArray:IntArray=     intArrayOf(110,111,112)
            val longArray:LongArray=    longArrayOf(1110,1111,1112)
            val floatArray:FloatArray=   floatArrayOf(1.0f,1.2f)
            val doubleArray:DoubleArray=   doubleArrayOf(1.0,1.11)
            val chatArray:CharArray=     charArrayOf('1','a','b')
            val doubbleArray:BooleanArray=  booleanArrayOf(true,false,true)



说明：
<br>  1.var:对象声明。表示他是一个对象（属性）
<br>  2. :IntArray   :DoubleArray  声明对象的类型
<br>  3.采用该方式创建数组时通过[i]只可进行数据的访问，不可进行修改

* 采用ArrayOf创建数组   俗称装箱操作

	            var string_array:Array<String> = arrayOf("How", "Are", "You")
	            var byte_array:Array<Int> = arrayOf(0, 1,2)
	            var short_array:Array<Short> = arrayOf(0, 1,2)
	            var int_array:Array<Int> = arrayOf(0, 1,2)
	            var long_array:Array<Long> = arrayOf(0, 1,2)
	            var float_array: Array<Float> = arrayOf(0.1f,1.2f,2.4f)
	            var double_array:Array<Double> = arrayOf(0.1, 1.2)
	            var boolean_array:Array<Boolean> = arrayOf(true,false,true)
	            var char_array:Array<Char> = arrayOf('1','a','b')


说明：
<br> 1. var:对象声明。表示他是一个对象（属性）
<br> 2. :Array<Int>   :Array<Double>  声明对象的类型
<br> 3. 采用该方式创建数组时通过[i]只可进行数据的访问，不可进行修改
<br>  4. 可创建String类型的数组
 


* 采用arrayOfNulls()创建空数组  俗称定长数组

            var byteArray=     arrayOfNulls<Byte>(5)
            var shortArray=     arrayOfNulls<Short>(5)
            var intArray=     arrayOfNulls<Int>(5)
            var longArray=     arrayOfNulls<Long>(5)
            var floatArray=     arrayOfNulls<Float>(5)
            var doubleArray=     arrayOfNulls<Double>(5)
            var booleanArray=     arrayOfNulls<Boolean>(5)
            var stringArray=     arrayOfNulls<String>(5)


            //采用lambda
			val asc = Array(5, {i -> (i * i).toString() }) //和Python很像 这结果是生成 0 1 2 3 4 的平方数组

引用数据元素依旧是 asc[i] 和JAVA一样

说明：
<br> 1. var:对象声明。表示他是一个对象（属性）
<br> 2.该方式是创建了指定数组大小的空数组。
<br> 3.可以通过[i]对数组元素进行修改和访问。

    intArray[0]=1
    intArray[1]=2
    intArray[2]=3

    printIn(intArray[1])


* 采用emptyArray创建空数组  俗称空数组

            var byteArray= emptyArray<Byte>()
            var intArray= emptyArray<Int>()
            var shortArray= emptyArray<Short>()
            var longArray= emptyArray<Long>()
            var floatArray= emptyArray<Float>()
            var doubleArray= emptyArray<Double>()
            var charArray= emptyArray<Char>()
            var booleanArray= emptyArray<Boolean>()
            var stringArray= emptyArray<String>()



* 数组的遍历

			  var intArray= arrayOfNulls<Int>(5)
			            intArray[0]=100
			            intArray[1]=200
			            intArray[2]=300
			
			            for (i in intArray) {
			                println(i)
			            }


*  数组下标的遍历

			              var intArray= arrayOfNulls<Int>(5)
						            intArray[0]=100
						            intArray[1]=200
						            intArray[2]=300
						
						     for (j in intArray.indices) {
                                 println(j)
            }



*  和 java 不一样，arrays 在 kotlin 中是不可变的。这意味这 kotlin 不允许我们把 Array<String> 转为 Array<Any> ,这样就阻止了可能的运行时错误