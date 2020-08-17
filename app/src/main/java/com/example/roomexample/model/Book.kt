package com.example.roomexample.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Book(

    @PrimaryKey
    @ColumnInfo(name = "id")
    var bookId : Int,

    @ColumnInfo(name = "book_name")
    var bookName : String

)

//different syntax and same purpose
//@Entity
//class Book{
//
//    @PrimaryKey
//    @ColumnInfo(name = "id")
//    var bookId : Int = 0
//
//    @ColumnInfo(name = "book_name")
//    var bookName : String = ""
//
//}