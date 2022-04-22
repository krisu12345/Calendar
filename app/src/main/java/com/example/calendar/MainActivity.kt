package com.example.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import com.example.calendar.databinding.ActivityMainBinding
import java.text.DateFormat
import java.util.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kalendarz.setMinDate(System.currentTimeMillis());



        binding.button.setOnClickListener(View.OnClickListener {
            val calendar = Calendar.getInstance()
            binding.kalendarz.date = calendar.timeInMillis
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            binding.textwyjazd.append(dateFormatter.format(calendar.time))
            val selectedDate:Long = binding.kalendarz.date
            calendar.timeInMillis = selectedDate

        })
    }

}