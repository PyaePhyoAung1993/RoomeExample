package com.example.roomexample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomexample.dao.BookDao
import com.example.roomexample.model.Book


@Database(entities = [(Book::class)],version = 1)
abstract class BookDatabase : RoomDatabase(){

    abstract fun bookDao() : BookDao


}