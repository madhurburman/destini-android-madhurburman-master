package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
                                                           //this app's code is not same as quiz app
    // TODO: Steps 4 & 8 - Declare member variables here
    Button mtopbotton;
    Button mbottombuttun;
    TextView mstoryTExtView;
    int mindex=1;                               // variable to see at what step of story our user is



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mtopbotton = findViewById(R.id.buttonTop);
        mbottombuttun = findViewById(R.id.buttonBottom);
        mstoryTExtView = findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

mtopbotton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(mindex==1 || mindex==2){                      // checking the values of index to see at what step we are at  NOTE= we are using or statement since the T2_ANS have same outcome as T1_ANS
                mstoryTExtView.setText(R.string.T3_Story);
                mtopbotton.setText(R.string.T3_Ans1);
                mbottombuttun.setText(R.string.T3_Ans2);
                mindex=3;                             //updateing the index value for the next step
        }
        else if (mindex==3){                          //if second time top button iis pressed
            mstoryTExtView.setText(R.string.T6_End);
            mtopbotton.setVisibility(View.GONE);
            mbottombuttun.setVisibility(View.GONE);
        }
    }
});
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
  mbottombuttun.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          if(mindex==1) {
              mstoryTExtView.setText(R.string.T2_Story);
              mtopbotton.setText(R.string.T2_Ans1);
              mbottombuttun.setText(R.string.T2_Ans2);
              mindex = 2;
          }
          else if(mindex==2){                             //second time it is pressed
              mstoryTExtView.setText(R.string.T4_End);
              mtopbotton.setVisibility(View.GONE);
              mbottombuttun.setVisibility(View.GONE);
          }
          else if (mindex==3){                          //third time it is pressed
              mstoryTExtView.setText(R.string.T5_End);
              mtopbotton.setVisibility(View.GONE);
              mbottombuttun.setVisibility(View.GONE);
          }
      }
  });                             //see the story tree what shoud be the values of index vaiable

    }
}