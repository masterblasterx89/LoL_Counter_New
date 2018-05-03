package com.example.kruset.lol_counter_new;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    /**
     * Variables that get assigned.
     */
    float totalScoreA = 1;
    float totalScoreB = 1;
    float percentageA = 0;
    float percentageB = 0;
    String formatPercentageA = "";
    String formatPercentageB = "";

    int totalKillsA = 0;
    int totalTdA = 0;
    int totalBaronA = 0;

    int totalKillsB = 0;
    int totalTdB = 0;
    int totalBaronB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * All methods that start with "increment_by_x" are what is calculating the values to display on
     * on counters and the percentage.
     */

    public void incrementByKillA(View view) {
        float percentageA_float;
        float percentageB_float;
        totalScoreA = totalScoreA + 1;
        totalKillsA = totalKillsA + 1;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        percentageB = percentageB_float * 100;
        int percent_a = (int) percentageA;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForKillsA(totalKillsA);
    }

    public void incrementByTowerA(View view) {
        float percentageA_float;
        float percentageB_float;
        totalTdA = totalTdA + 1;
        totalScoreA = totalScoreA + 10;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        percentageB = percentageB_float * 100;
        int percent_a = (int) percentageA;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForTdA(totalTdA);
    }

    public void incrementByBaronA(View view) {
        float percentageA_float;
        float percentageB_float;
        totalScoreA = totalScoreA + 5;
        totalBaronA = totalBaronA + 1;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        percentageB = percentageB_float * 100;
        int percent_a = (int) percentageA;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForBaronA(totalBaronA);
    }

    public void incrementByKillB(View view) {
        float percentageA_float;
        float percentageB_float;
        totalScoreB = totalScoreB + 1;
        totalKillsB = totalKillsB + 1;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        int percent_a = (int) percentageA;
        percentageB = percentageB_float * 100;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForKillsB(totalKillsB);

    }

    public void incrementByTowerB(View view) {
        float percentageA_float;
        float percentageB_float;
        totalScoreB = totalScoreB + 10;
        totalTdB = totalTdB + 1;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        int percent_a = (int) percentageA;
        percentageB = percentageB_float * 100;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForTdB(totalTdB);
    }

    public void incrementByBaronB(View view) {
        float percentageA_float;
        float percentageB_float;
        totalBaronB = totalBaronB + 1;
        totalScoreB = totalScoreB + 5;
        percentageA_float = totalScoreA / (totalScoreA + totalScoreB);
        percentageB_float = totalScoreB / (totalScoreB + totalScoreA);
        percentageA = percentageA_float * 100;
        int percent_a = (int) percentageA;
        percentageB = percentageB_float * 100;
        int percent_b = (int) percentageB;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForBaronB(totalBaronB);

    }

    /**
     * Resets all the counters.
     */
    public void resetScore(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(formatPercentageA);
        displayForTeamB(formatPercentageB);
        totalKillsA = 0;
        totalTdA = 0;
        totalBaronA = 0;
        totalKillsB = 0;
        totalTdB = 0;
        totalBaronB = 0;
        displayForKillsA(totalKillsA);
        displayForKillsB(totalKillsB);
        displayForTdA(totalTdB);
        displayForTdB(totalTdB);
        displayForBaronA(totalBaronA);
        displayForBaronB(totalBaronB);

    }


    /**
     * Grabbing the values of the variables and displaying it on the screen
     */

    public void displayForTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForKillsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kills_score_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTdA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.td_score_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBaronA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.baron_score_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForKillsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kills_score_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTdB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.td_score_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBaronB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.baron_score_b);
        scoreView.setText(String.valueOf(score));
    }


}