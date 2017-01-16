package com.kvalitetnaskolatenisa.www.tennisquiztkrally;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * calculate points on submit button clicked
     */
    public void onSubmitCalculatePoints(View v) {
        int points = 0;
        /**
         * hide questions
         */
        LinearLayout linearLayoutQuestions = (LinearLayout) findViewById(R.id.layout_questions);
        linearLayoutQuestions.setVisibility(View.GONE);

        /**
         * question 1
         */
        RadioButton radioButtonQuestion1Answer2 = (RadioButton) findViewById(R.id.question1_answer2);
        if (radioButtonQuestion1Answer2.isChecked()) {
            points++;
        }
        /**
         * question 2
         */
        EditText editTextQestion2Answer = (EditText) findViewById(R.id.question2_answer_server);
        String stringAnswer = editTextQestion2Answer.getText().toString();
        boolean correct = "Server".equals(stringAnswer);
        if (correct) {
            points++;
        }
        /**
         * question 3
         */
        CheckBox checkBoxQuestion3Answer1 = (CheckBox) findViewById(R.id.question3_answer1);
        CheckBox checkBoxQuestion3Answer2 = (CheckBox) findViewById(R.id.question3_answer2);
        CheckBox checkBoxQuestion3Answer3 = (CheckBox) findViewById(R.id.question3_answer3);
        CheckBox checkBoxQuestion3Answer4 = (CheckBox) findViewById(R.id.question3_answer4);
        if (checkBoxQuestion3Answer1.isChecked() && checkBoxQuestion3Answer2.isChecked() &&
                checkBoxQuestion3Answer3.isChecked() && !(checkBoxQuestion3Answer4.isChecked())) {
            points++;
        }
        /**
         * question 4
         */
        RadioButton radioButtonQuestion4Answer2 = (RadioButton) findViewById(R.id.question4_answer2);
        if (radioButtonQuestion4Answer2.isChecked()) {
            points++;
        }
        /**
         * question 5
         */
        RadioButton radioButtonQuestion5Answer3 = (RadioButton) findViewById(R.id.question5_answer3);
        if (radioButtonQuestion5Answer3.isChecked()) {
            points++;
        }
        /**
         * question 6
         */
        EditText editTextQestion6Answer = (EditText) findViewById(R.id.question6_answer_number);
        stringAnswer = editTextQestion6Answer.getText().toString();
        correct = "2".equals(stringAnswer);
        if (correct) {
            points++;
        }
        /**
         * question 7
         */
        CheckBox checkBoxQuestion7Answer1 = (CheckBox) findViewById(R.id.question7_answer1);
        CheckBox checkBoxQuestion7Answer2 = (CheckBox) findViewById(R.id.question7_answer2_true);
        CheckBox checkBoxQuestion7Answer3 = (CheckBox) findViewById(R.id.question7_answer3);
        CheckBox checkBoxQuestion7Answer4 = (CheckBox) findViewById(R.id.question7_answer4);
        CheckBox checkBoxQuestion7Answer5 = (CheckBox) findViewById(R.id.question7_answer5_true);
        if (!(checkBoxQuestion7Answer1.isChecked()) && checkBoxQuestion7Answer2.isChecked() &&
                !(checkBoxQuestion7Answer3.isChecked()) && !(checkBoxQuestion7Answer4.isChecked())
                && checkBoxQuestion7Answer5.isChecked()) {
            points++;
        }
        /**
         * question 8
         */
        RadioButton radioButtonQuestion8Answer3 = (RadioButton) findViewById(R.id.question8_answer3);
        if (radioButtonQuestion8Answer3.isChecked()) {
            points++;
        }
        /**
         * question 9
         */
        RadioButton radioButtonQuestion9Answer4 = (RadioButton) findViewById(R.id.question9_answer4);
        if (radioButtonQuestion9Answer4.isChecked()) {
            points++;
        }
        /**
         * question 10
         */
        RadioButton radioButtonQuestion10Answer1 = (RadioButton) findViewById(R.id.question10_answer1);
        if (radioButtonQuestion10Answer1.isChecked()) {
            points++;
        }
        /**
         * show score text
         */
        TextView textViewScore = (TextView) findViewById(R.id.text_score);
        textViewScore.setVisibility(View.VISIBLE);
        textViewScore.setText("Your score is: " + points + " out of 10");

    }
}
