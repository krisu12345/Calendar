package com.example.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import com.example.calendar.databinding.ActivityMainBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kalendarz.setMinDate(System.currentTimeMillis());

        //binding.seekBar.setOnSeekBarChangeListener(object: MainActivity)
        //binding.seekBar.progress = 1
        //binding.seekBar.progress = binding.seekBar.progress/10


            val calendar = Calendar.getInstance()

        binding.kalendarz.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // set the calendar date as calendar view selected date
            calendar.set(year,month,dayOfMonth)

            // set this date as calendar view selected dat//e
            binding.kalendarz.date = calendar.timeInMillis

            // button click listener
            binding.button.setOnClickListener {
                // get calendar view selected date
                val selectedDate:Long = binding.kalendarz.date

                // set the calendar date as calendar view selected date
                calendar.timeInMillis = selectedDate

                // format the calendar view selected date
                val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
                binding.textwyjazd.text = "Selected date\n"
                binding.textwyjazd.append(dateFormatter.format(calendar.time))
            }

        binding.button2.setOnClickListener {
            // get calendar view selected date
            val selectedDate:Long = binding.kalendarz.date

            // set the calendar date as calendar view selected date
            calendar.timeInMillis = selectedDate

            // format the calendar view selected date
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            binding.textsrodek.text = "Selected date\n"
            binding.textsrodek.append(dateFormatter.format(calendar.time))
        }

        binding.button3.setOnClickListener {
            // get calendar view selected date
            val selectedDate:Long = binding.kalendarz.date

            // set the calendar date as calendar view selected date
            calendar.timeInMillis = selectedDate

            // format the calendar view selected date
            val dateFormatter = DateFormat.getDateInstance(DateFormat.MEDIUM)
            binding.textpowrot.text = "Selected date\n"
            binding.textpowrot.append(dateFormatter.format(calendar.time))
        }


        }
    }}