package com.ps420.semaphoreapps.model

import com.ps420.semaphoreapps.R

object ChallangeDataSource {

    private val fakeQuestionList = arrayListOf(
        ChallangeData(R.drawable.sign_a, "Y", "P", "O", "A", "A"),
        ChallangeData(R.drawable.sign_b, "P", "H", "O", "B", "B"),
        ChallangeData(R.drawable.sign_c, "X", "T", "V", "C", "C"),
        ChallangeData(R.drawable.sign_d, "B", "V", "M", "D", "D"),
        ChallangeData(R.drawable.sign_e, "H", "T", "X", "E", "E"),
        ChallangeData(R.drawable.sign_f, "Z", "G", "C", "F", "F"),
        ChallangeData(R.drawable.sign_g, "O", "V", "E", "G", "G"),
        ChallangeData(R.drawable.sign_h, "Q", "K", "G", "H", "H"),
        ChallangeData(R.drawable.sign_i, "Q", "U", "V", "I", "I"),
        ChallangeData(R.drawable.sign_j, "A", "O", "M", "J", "J"),
        ChallangeData(R.drawable.sign_k, "V", "S", "P", "K", "K"),
        ChallangeData(R.drawable.sign_l, "C", "N", "D", "L", "L"),
        ChallangeData(R.drawable.sign_m, "K", "P", "U", "M", "M"),
        ChallangeData(R.drawable.sign_n, "D", "U", "V", "N", "N"),
        ChallangeData(R.drawable.sign_o, "B", "T", "E", "O", "O"),
        ChallangeData(R.drawable.sign_p, "F", "I", "S", "P", "P"),
        ChallangeData(R.drawable.sign_q, "W", "C", "K", "Q", "Q"),
        ChallangeData(R.drawable.sign_r, "S", "U", "G", "R", "R"),
        ChallangeData(R.drawable.sign_s, "Q", "Z", "P", "S", "S"),
        ChallangeData(R.drawable.sign_t, "R", "D", "B", "T", "T"),
        ChallangeData(R.drawable.sign_u, "B", "D", "P", "U", "U"),
        ChallangeData(R.drawable.sign_v, "H", "X", "U", "V", "V"),
        ChallangeData(R.drawable.sign_w, "T", "I", "X", "W", "W"),
        ChallangeData(R.drawable.sign_x, "U", "T", "O", "X", "X"),
        ChallangeData(R.drawable.sign_y, "L", "A", "M", "Y", "Y"),
        ChallangeData(R.drawable.sign_z, "Q", "G", "N", "Z", "Z"),
    )

    private val selectedQuestions = fakeQuestionList.shuffled().take(10).toMutableList()

    fun getQuestions(): List<ChallangeData> {
        selectedQuestions.shuffle()
        return selectedQuestions.toList()
    }
}