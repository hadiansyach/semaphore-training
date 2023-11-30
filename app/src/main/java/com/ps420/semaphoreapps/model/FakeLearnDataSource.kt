package com.ps420.semaphoreapps.model

import com.ps420.semaphoreapps.R

object FakeLearnDataSource {

    private val fakeQuestionList = arrayListOf(
        LearnData(R.drawable.sign_a, "Y", "P", "O", "A", "A"),
        LearnData(R.drawable.sign_b, "P", "H", "O", "B", "B"),
        LearnData(R.drawable.sign_c, "X", "T", "V", "C", "C"),
        LearnData(R.drawable.sign_d, "B", "V", "M", "D", "D"),
        LearnData(R.drawable.sign_e, "H", "T", "X", "E", "E"),
        LearnData(R.drawable.sign_f, "Z", "G", "C", "F", "F"),
        LearnData(R.drawable.sign_g, "O", "V", "E", "G", "G"),
        LearnData(R.drawable.sign_h, "Q", "K", "G", "H", "H"),
        LearnData(R.drawable.sign_i, "Q", "U", "V", "I", "I"),
        LearnData(R.drawable.sign_j, "A", "O", "M", "J", "J"),
        LearnData(R.drawable.sign_k, "V", "S", "P", "K", "K"),
        LearnData(R.drawable.sign_l, "C", "N", "D", "L", "L"),
        LearnData(R.drawable.sign_m, "K", "P", "U", "M", "M"),
        LearnData(R.drawable.sign_n, "D", "U", "V", "N", "N"),
        LearnData(R.drawable.sign_o, "B", "T", "E", "O", "O"),
        LearnData(R.drawable.sign_p, "F", "I", "S", "P", "P"),
        LearnData(R.drawable.sign_q, "W", "C", "K", "Q", "Q"),
        LearnData(R.drawable.sign_r, "S", "U", "G", "R", "R"),
        LearnData(R.drawable.sign_s, "Q", "Z", "P", "S", "S"),
        LearnData(R.drawable.sign_t, "R", "D", "B", "T", "T"),
        LearnData(R.drawable.sign_u, "B", "D", "P", "U", "U"),
        LearnData(R.drawable.sign_v, "H", "X", "U", "V", "V"),
        LearnData(R.drawable.sign_w, "T", "I", "X", "W", "W"),
        LearnData(R.drawable.sign_x, "U", "T", "O", "X", "X"),
        LearnData(R.drawable.sign_y, "L", "A", "M", "Y", "Y"),
        LearnData(R.drawable.sign_z, "Q", "G", "N", "Z", "Z"),
    )

    private val selectedQuestions = fakeQuestionList.shuffled().take(3).toMutableList()

    fun getQuestions(): List<LearnData> {
        selectedQuestions.shuffle()
        return selectedQuestions.toList()
    }
}