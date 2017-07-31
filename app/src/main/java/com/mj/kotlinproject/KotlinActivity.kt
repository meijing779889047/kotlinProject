package com.mj.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    private val  TAG="KotlinActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
//        val btn=findViewById(R.id.tv_data)  as  TextView
        tv_data.setOnClickListener{ view ->
            Toast.makeText(this,"item"+ view.alpha,Toast.LENGTH_LONG).show()

            //数组

            var intArray= arrayOfNulls<Int>(5)
            intArray[0]=100
            intArray[1]=200
            intArray[2]=300

            for (i in intArray) {
                println(i)
            }

            for (j in intArray.indices) {
                println(j)
            }

            Log.i("mm","数组的长度："+intArray[1]+"第二个数据的值："+intArray[1])


//            main();
//              //创建kotlin类的实例
//             val user=User(1,"33")
//             Log.i("mm",user.toString())



        }
    }




//    val byteArray:ByteArray=    byteArrayOf(1,2,3)
//    val shoertArray:ShortArray=  shortArrayOf(10,11,12)
//    val intArray:IntArray=     intArrayOf(110,111,112)
//    val longArray:LongArray=    longArrayOf(1110,1111,1112)
//    val floatArray:FloatArray=   floatArrayOf(1.0f,1.2f)
//    val doubleArray:DoubleArray=   doubleArrayOf(1.0,1.11)
//    val chatArray:CharArray=     charArrayOf('1','a','b')
//    val doubbleArray:BooleanArray=  booleanArrayOf(true,false,true)

//    var string_array:Array<String> = arrayOf("How", "Are", "You")
//    var byte_array:Array<Int> = arrayOf(0, 1,2)
//    var short_array:Array<Short> = arrayOf(0, 1,2)
//    var int_array:Array<Int> = arrayOf(0, 1,2)
//    var long_array:Array<Long> = arrayOf(0, 1,2)
//    var float_array: Array<Float> = arrayOf(0.1f,1.2f,2.4f)
//    var double_array:Array<Double> = arrayOf(0.1, 1.2)
//    var boolean_array:Array<Boolean> = arrayOf(true,false,true)
//    var char_array:Array<Char> = arrayOf('1','a','b')


//    val byteArray=     arrayOfNulls<Byte>(5)
//    val shortArray=     arrayOfNulls<Short>(5)
//    val intArray=     arrayOfNulls<Int>(5)
//    val longArray=     arrayOfNulls<Long>(5)
//    val floatArray=     arrayOfNulls<Float>(5)
//    val doubleArray=     arrayOfNulls<Double>(5)
//    val booleanArray=     arrayOfNulls<Boolean>(5)
//    val stringArray=     arrayOfNulls<String>(5)
}
