package com.ps420.semaphoreapps.view.challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.databinding.ActivityChallangeBinding
import com.ps420.semaphoreapps.model.ChallangeDataSource
import com.ps420.semaphoreapps.model.ChallangeData
import java.util.Locale
import java.util.concurrent.TimeUnit

class ChallengeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChallangeBinding
    private lateinit var questionsList: List<ChallangeData>
    private var index: Int = 0
    private lateinit var questionModel: ChallangeData
    private var correctAnswerCount:Int = 0
    private var wrongAnswerCount:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChallangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        questionsList = ChallangeDataSource.getQuestions()

        questionModel = questionsList[index]

        setAllQuestions()
        countdown()
    }

    private fun setAllQuestions() {
        binding.apply {
            imgSignQuestion.setImageResource(questionModel.imageDrawable)
            btnOption1.text = questionModel.option1
            btnOption2.text = questionModel.option2
            btnOption3.text = questionModel.option3
            btnOption4.text = questionModel.option4
        }
    }

    private fun countdown() {
            var duration: Long = TimeUnit.SECONDS.toMillis(15)


            object : CountDownTimer(duration, 1000) {
                override fun onTick(millisUntilFinished: Long) {

                    var sDuration: String = String.format(
                        Locale.ENGLISH,
                        "%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)
                        )
                    )

                    binding.tvCountdownTimer.text = sDuration

                }

                override fun onFinish() {
                    index++
                    if (index < questionsList.size) {
                        questionModel = questionsList[index]
                        setAllQuestions()
                        resetBackground()
                        enableButton()
                        countdown()

                    } else {
                        gameResult()
                    }
                }
            }.start()
    }

    private fun resetBackground() {
        binding.apply {
            btnOption1.background = getDrawable(R.drawable.option_bg)
            btnOption2.background = getDrawable(R.drawable.option_bg)
            btnOption3.background = getDrawable(R.drawable.option_bg)
            btnOption4.background = getDrawable(R.drawable.option_bg)
        }
    }

    private fun enableButton() {
        binding.apply {
            btnOption1.isClickable = true
            btnOption2.isClickable = true
            btnOption3.isClickable = true
            btnOption4.isClickable = true
        }
    }

    private fun disableButton() {
        binding.apply {
            btnOption1.isClickable = false
            btnOption2.isClickable = false
            btnOption3.isClickable = false
            btnOption4.isClickable = false
        }
    }

    private fun correctAns(option: Button) {
        option.background = getDrawable(R.drawable.right_bg)
        correctAnswerCount++
    }

    private fun wrongAns(option: Button) {
        option.background = getDrawable(R.drawable.wrong_bg)
        wrongAnswerCount++
    }

    private fun gameResult() {
        var intent = Intent(this, ResultActivity::class.java)

        intent.putExtra(CORRECT_VALUE, correctAnswerCount.toString())
        intent.putExtra(TOTAL, questionsList.size.toString())

        startActivity(intent)
    }


    fun option1Clicked(view: View) {
        disableButton()
        val btnOption1 = binding.btnOption1
        if (questionModel.option1 == questionModel.correctOption) {
            btnOption1.background = resources.getDrawable(R.drawable.right_bg)
            correctAns(btnOption1)
        } else {
            wrongAns(btnOption1)
        }
    }

    fun option2Clicked(view: View) {
        disableButton()
        val btnOption2 = binding.btnOption2
        if (questionModel.option2 == questionModel.correctOption) {
            btnOption2.background = resources.getDrawable(R.drawable.right_bg)
            correctAns(btnOption2)
        } else {
            wrongAns(btnOption2)
        }
    }
    fun option3Clicked(view: View) {
        disableButton()
        val btnOption3 = binding.btnOption3
        if (questionModel.option3 == questionModel.correctOption) {
            btnOption3.background = resources.getDrawable(R.drawable.right_bg)
            correctAns(btnOption3)
        } else {
            wrongAns(btnOption3)
        }
    }
    fun option4Clicked(view: View) {
        disableButton()
        val btnOption4 = binding.btnOption4
        if (questionModel.option4 == questionModel.correctOption) {
            btnOption4.background = resources.getDrawable(R.drawable.right_bg)
            correctAns(btnOption4)
        } else {
            wrongAns(btnOption4)
        }
    }

    companion object {
        const val CORRECT_VALUE = "correct_value"
        const val TOTAL = "total"
    }

}