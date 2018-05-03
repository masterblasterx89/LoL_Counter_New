package com.example.kruset.lol_counter_new;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    /**
     * Variables that get assigned.
     */
    float total_score_a = 1;
    float total_score_b = 1;
    float percentage_a = 0;
    float percentage_b = 0;
    String format_percentage_a = "";
    String format_percentage_b = "";

    int total_kills_a = 0;
    int total_td_a = 0;
    int total_baron_a = 0;

    int total_kills_b = 0;
    int total_td_b = 0;
    int total_baron_b = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * All methods that start with "increment_by_x" are what is calculating the values to display on
     * on counters and the percentage.
     */

    public void increment_by_kill_a(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_score_a = total_score_a + 1;
        total_kills_a = total_kills_a + 1;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        percentage_b = percentage_b_float * 100;
        int percent_a = (int) percentage_a;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForKillsA(total_kills_a);
    }

    public void increment_by_tower_a(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_td_a = total_td_a + 1;
        total_score_a = total_score_a + 10;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        percentage_b = percentage_b_float * 100;
        int percent_a = (int) percentage_a;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForTdA(total_td_a);
    }

    public void increment_by_baron_a(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_score_a = total_score_a + 5;
        total_baron_a = total_baron_a + 1;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        percentage_b = percentage_b_float * 100;
        int percent_a = (int) percentage_a;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForBaronA(total_baron_a);
    }

    public void increment_by_kill_b(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_score_b = total_score_b + 1;
        total_kills_b = total_kills_b + 1;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        int percent_a = (int) percentage_a;
        percentage_b = percentage_b_float * 100;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForKillsB(total_kills_b);

    }

    public void increment_by_tower_b(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_score_b = total_score_b + 10;
        total_td_b = total_td_b + 1;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        int percent_a = (int) percentage_a;
        percentage_b = percentage_b_float * 100;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForTdB(total_td_b);
    }

    public void increment_by_baron_b(View view) {
        float percentage_a_float;
        float percentage_b_float;
        total_baron_b = total_baron_b + 1;
        total_score_b = total_score_b + 5;
        percentage_a_float = total_score_a / (total_score_a + total_score_b);
        percentage_b_float = total_score_b / (total_score_b + total_score_a);
        percentage_a = percentage_a_float * 100;
        int percent_a = (int) percentage_a;
        percentage_b = percentage_b_float * 100;
        int percent_b = (int) percentage_b;
        displayForTeamA(percent_a + "%");
        displayForTeamB(percent_b + "%");
        displayForBaronB(total_baron_b);

    }

    /**
     * Resets all the counters.
     */
    public void reset_score(View view) {
        total_score_a = 0;
        total_score_b = 0;
        displayForTeamA(format_percentage_a);
        displayForTeamB(format_percentage_b);
        total_kills_a = 0;
        total_td_a = 0;
        total_baron_a = 0;
        total_kills_b = 0;
        total_td_b = 0;
        total_baron_b = 0;
        displayForKillsA(total_kills_a);
        displayForKillsB(total_kills_b);
        displayForTdA(total_td_b);
        displayForTdB(total_td_b);
        displayForBaronA(total_baron_a);
        displayForBaronB(total_baron_b);

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