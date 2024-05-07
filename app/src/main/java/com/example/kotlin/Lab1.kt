package com.example.kotlin

fun main(){
    println("Lab1 - PH30898");
    //Khai báo biến : cách 1 dùng val, var
    val a = 1;
    val b = 2;
    val c = a +b;
    println("Tổng 2 số $a và $b là: $c");

    //Khai báo biến - ra kiểu dữ liệu
    val sothunhat : Int = 4
    val sothuhai : Float = 2f

    val mess : String  = "Tích 2 số $sothunhat và $sothuhai là : ${sothunhat * sothuhai}"
    println(mess);

    val soA = 4f;
    val  soB = 3f;

    println("Thương 2 số $soA và $soB là : ${phepChia(soA,soB)}")
}
fun phepChia( soA : Float, soB : Float): Float{
    if (soB == 0f){
        return 0f
    }
    val thuong = soA/soB;    return thuong;
}

class Lab1 {
}