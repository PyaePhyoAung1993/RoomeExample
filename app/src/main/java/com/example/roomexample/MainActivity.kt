package com.example.roomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.roomexample.database.BookDatabase
import com.example.roomexample.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        //object
//        val db = Room.databaseBuilder(
//            applicationContext,BookDatabase::class.java,
//            "BookDB"
//        ).build()
//
//        Thread{
//            val book = Book(
//                1,
//                "Android Developement"
//            )
//            db.bookDao().saveBook(book)
//            db.bookDao().getAllBook().forEach {
//                Log.d("FetchDatabase","${it.bookId}")
//                Log.d("FetchDatabase","${it.bookName}")
//
//            }
//        }.start()
    }
}