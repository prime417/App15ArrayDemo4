package com.example.pankaj.app15arraydemo4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int fiveStarsReview = 0;
    int fourStarsReview = 0;
    int threeStarsReview = 0;
    int twoStarsReview = 0;
    int oneStarsreview = 0;
boolean oneTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtFiveStarsStudent = findViewById(R.id.txtFiveStarsStudent);
        final TextView txtFourStarsStudent = findViewById(R.id.txtFourStarsStudent);
        final TextView txtThreeStarsStudent = findViewById(R.id.txtThreeStarsStudent);
        final TextView txtTwoStarsStudent = findViewById(R.id.txtTwoStarsStudent);
        final TextView txtOneStarsStudent = findViewById(R.id.txtOneStarsStudent);

        RatingBar rtbFiveStarsStudent = findViewById(R.id.rtbFiveStarStudent);
        RatingBar rtbFourStarsStudent = findViewById(R.id.rtbFourStarsStudent);
        RatingBar rtbThreeStarsStudent = findViewById(R.id.rtbThreeStarsStudent);
        RatingBar rtbTwoStarsStudent = findViewById(R.id.rtbTwoStarsStudent);
        RatingBar rtbOneStarsStudent = findViewById(R.id.rtbOneStarsStudent);

        final Button btnResult = findViewById(R.id.btnResult);

       /* rtbFiveStarsStudent.setIsIndicator(true);
        rtbFourStarsStudent.setIsIndicator(true);
        rtbThreeStarsStudent.setIsIndicator(true);
        rtbTwoStarsStudent.setIsIndicator(true);
        rtbOneStarsStudent.setIsIndicator(true);
        */
        makeThisRatingBarIndicator(rtbFiveStarsStudent);
        makeThisRatingBarIndicator(rtbFourStarsStudent);
        makeThisRatingBarIndicator(rtbThreeStarsStudent);
        makeThisRatingBarIndicator(rtbTwoStarsStudent);
        makeThisRatingBarIndicator(rtbOneStarsStudent);


        final int[] ReviewStudent = {5, 3, 4, 2, 4, 5, 1, 3, 2, 5, 5, 3, 2, 3};



            btnResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (oneTime) {
                        for (int index = 0; index < ReviewStudent.length; index++) {

                            if (ReviewStudent[index] == 5) {

                                ++fiveStarsReview;
                            }
                            if (ReviewStudent[index] == 4) {
                                ++fourStarsReview;
                            }
                            if (ReviewStudent[index] == 3) {
                                ++threeStarsReview;
                            }
                            if (ReviewStudent[index] == 2) {
                                ++twoStarsReview;
                            }
                            if (ReviewStudent[index] == 1) {
                                ++oneStarsreview;
                            }
                        }
                        oneTime = false;

                    }
                    txtFiveStarsStudent.setText(fiveStarsReview + "");
                    txtFourStarsStudent.setText(fourStarsReview + "");
                    txtThreeStarsStudent.setText(threeStarsReview + "");
                    txtTwoStarsStudent.setText(twoStarsReview + "");
                    txtOneStarsStudent.setText(oneStarsreview + "");

                    if(oneTime == false){
                        Toast.makeText(getApplicationContext(),"Review is Summited", Toast.LENGTH_SHORT).show();
                    }
                    //btnResult.setVisibility(View.GONE);
                }
            });

        }


    public void makeThisRatingBarIndicator (RatingBar ratingBar){
        ratingBar.setIsIndicator(true);
    }
}
