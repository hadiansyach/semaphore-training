package com.ps420.semaphoreapps.model

import com.ps420.semaphoreapps.R

object FakeLearnDataSourceExperimental {


    // START
    fun getQuestions(): ArrayList<LearnDataExperimental> {
        val questionsList = ArrayList<LearnDataExperimental>()
        val QUESTION_TITLE = "Guess the symbol based on the photo above"

        val arrayOfQuestions = arrayOf(
            LearnDataExperimental(1,QUESTION_TITLE, R.drawable.sign_a, "Y", "A", "O", "A", 2),
            LearnDataExperimental(2,QUESTION_TITLE, R.drawable.sign_b, "P", "B", "O", "A", 2),
            LearnDataExperimental(3, QUESTION_TITLE, R.drawable.sign_c, "X", "T", "C", "C", 3),
            LearnDataExperimental(4, QUESTION_TITLE, R.drawable.sign_d, "B", "D", "M", "X",  2),
            LearnDataExperimental(5, QUESTION_TITLE, R.drawable.sign_e, "H", "T", "E", "O",  3),
            LearnDataExperimental(6, QUESTION_TITLE, R.drawable.sign_f, "Z", "F", "C", "G",  2),
            LearnDataExperimental(7, QUESTION_TITLE, R.drawable.sign_g, "O", "V", "E", "G", 4),
            LearnDataExperimental(8, QUESTION_TITLE, R.drawable.sign_h, "Q", "K", "G", "H", 4),
            LearnDataExperimental(9, QUESTION_TITLE, R.drawable.sign_i, "Q", "U", "I", "Z", 3),
            LearnDataExperimental(10, QUESTION_TITLE, R.drawable.sign_j, "J", "O", "M", "M", 1),
            LearnDataExperimental(11, QUESTION_TITLE, R.drawable.sign_k, "V", "S", "P", "K", 4),
            LearnDataExperimental(12, QUESTION_TITLE, R.drawable.sign_l, "C", "L", "D", "Q", 2),
            LearnDataExperimental(13, QUESTION_TITLE, R.drawable.sign_m, "K", "P", "M", "V", 3),
            LearnDataExperimental(14, QUESTION_TITLE, R.drawable.sign_n, "D", "U", "V", "N", 4),
            LearnDataExperimental(15, QUESTION_TITLE, R.drawable.sign_o, "O", "T", "E", "I", 1),
            LearnDataExperimental(16, QUESTION_TITLE, R.drawable.sign_p, "F", "P", "S", "H", 2),
            LearnDataExperimental(17, QUESTION_TITLE, R.drawable.sign_q, "Q", "C", "K", "P", 1),
            LearnDataExperimental(18, QUESTION_TITLE,R.drawable.sign_r, "S", "U", "G", "R", 4),
            LearnDataExperimental(19, QUESTION_TITLE, R.drawable.sign_s, "Q", "Z", "P", "S", 4),
            LearnDataExperimental(20, QUESTION_TITLE, R.drawable.sign_t,"T", "D", "B", "U", 1),
            LearnDataExperimental(21, QUESTION_TITLE, R.drawable.sign_u,"B", "D", "P", "U", 4),
            LearnDataExperimental(22, QUESTION_TITLE, R.drawable.sign_v, "H", "X", "V", "X", 3),
            LearnDataExperimental(23, QUESTION_TITLE, R.drawable.sign_w,"T", "I", "W", "M", 3),
            LearnDataExperimental(24, QUESTION_TITLE, R.drawable.sign_x,"X", "T", "O", "I", 1),
            LearnDataExperimental(25, QUESTION_TITLE, R.drawable.sign_y,"L", "Y", "M", "B", 2),
            LearnDataExperimental(26, QUESTION_TITLE, R.drawable.sign_z,"Z", "G", "N", "S", 1)
        )

        for (question in arrayOfQuestions) {
            questionsList.add(question)
        }

        return questionsList
    }

    fun getShuffledQuestions(): ArrayList<LearnDataExperimental> {
        val questionsList = getQuestions()
        questionsList.shuffle()

        val selectedQuestions = ArrayList(questionsList.subList(0, 10)) // change the length of questions
        return selectedQuestions
    }
}
