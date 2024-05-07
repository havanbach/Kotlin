package com.example.kotlin.Lab2

fun main(){
    //khai báo và sử dụng mảng
    val arrx = intArrayOf(1,2,3,4)
    println(arrx.asList())

    println("Các phần tử trong mảng x: ")
    //Cách 1
    for (i in arrx){
        println(i)
    }
    arrx[0] = 5
    arrx[1] =7
    arrx[arrx.size -1] = 8
    //Cách 2
    for (x in arrx.indices){
        println("Phần tử thứ $x trong mảng x: ${arrx[x]}")
    }

    //Danh Sách
    var  listx = arrx.asList().toMutableList()
    listx.add(6)
    println("listx: $listx")

    val listy = mutableListOf(3,4,5);
    listy.add(0,1)
    listy.removeAt(listy.size -1)
    println("listy: $listy");

    println("Nhập mã sinh viên: ")
    var s = readLine()
    if (s != null){
        println(getMssv(s))
    }
}

private val MAP_DSSV : Map<String, String> = mutableMapOf("PH30898" to "Hà Văn Bách","PH30897" to "Phạm Văn Hiệp ngu","PH21141" to "Nguyễn Công Phương")

//cú pháp when trong Kotlin(thay thế switch case)
fun getMssv(masv:String): String?{
    when(masv){
        "PH30898" -> {
            return MAP_DSSV.get(masv)
        }
        "PH30897" -> {
            return MAP_DSSV.get(masv)
        }
        "PH21141" ->{
            return MAP_DSSV.get(masv)
        }
    }
    return "không có mã sinh viên này"
}
class Bai2 {
}