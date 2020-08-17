package com.example.roomexample.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roomexample.model.Book

@Dao
interface BookDao{

    @Query(value = "Select * from Book")
    fun getAllBook() : List<Book>

    @Insert
    fun saveBook(book: Book)
}