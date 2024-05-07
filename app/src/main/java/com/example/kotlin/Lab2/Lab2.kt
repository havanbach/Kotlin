package com.example.kotlin.Lab2

fun main(){
    val xe1 = xeHoi("Xe 1",1500f)
    val  xe2 = xeHoi("Xe 2",2000f,2023)
    xe1.tenXe += " Honda"
    println(xe1.hienthithongtinxe())
    println(xe2.hienthithongtinxe())

    val tenSv :String? = "Hà Văn Bách"
    getMssv2(tenSv!!)
}

fun getMssv2(tenSv:String) {
    if (tenSv == null) {
        println("Tên sinh viên không được null")
    } else {
        println("Tên sinh viên là : $tenSv")
    }
}
class xeHoi(var tenXe: String,var giaXe : Float){
    var namSX : Int? = 0
    constructor( tenXe:String,  giaXe:Float, namSX: Int?) : this(tenXe,giaXe){
        if (namSX!= null)
        this.namSX = namSX
    }
    fun hienthithongtinxe():String{
        if (namSX == 0){
            return "Tên xe: $tenXe, Giá xe: $giaXe"
        }else{
            return "Tên xe: $tenXe, Giá xe: $giaXe,Năm sản xuất: $namSX"
        }
    }
}
class Lab2 {
}