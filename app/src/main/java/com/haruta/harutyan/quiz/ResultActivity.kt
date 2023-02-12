package com.haruta.harutyan.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haruta.harutyan.quiz.databinding.ActivityQuizBinding
import com.haruta.harutyan.quiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        val quizCount: Int = intent.getIntExtra("QuizCount",0)
        binding.quizCountText.text = "$quizCount 問中・・・"

        val  correctCount: Int = intent.getIntExtra("CorrectCount", 0)
        binding.correctCountText.text = correctCount.toString()

    }
}