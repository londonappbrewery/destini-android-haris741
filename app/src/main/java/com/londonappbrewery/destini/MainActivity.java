package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

        Button mtopButton;
        Button mBottomButton;
        TextView mTextView;
        Story [] mStory= new Story[]{
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
                new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
                new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
        };
        int questionNumber=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mtopButton= (Button) findViewById(R.id.buttonTop);
            mBottomButton=(Button) findViewById(R.id.buttonBottom);
            mTextView=(TextView) findViewById(R.id.storyTextView);
            mTextView.setText(mStory[0].getStoryText());
            mtopButton.setText(mStory[0].getButton1());
            mBottomButton.setText(mStory[0].getButton2());


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mtopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonPressed(1);
                }
            });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    buttonPressed(2);
            }
        });

    }
    private void buttonPressed(int x)
    {
        if(x==1)
        {
            if(questionNumber==0)
            {
                questionNumber=2;
                setTexts();

            }
            else if(questionNumber==1)
            {
                questionNumber=2;
                setTexts();
            }
            else if(questionNumber==2)
            {
                mTextView.setText(R.string.T6_End);
                mtopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
            }
        }
        if(x==2)
        {
            if(questionNumber==0)
            {
                questionNumber=1;
                setTexts();
            }
            else if(questionNumber==1)
            {
                mTextView.setText(R.string.T4_End);
                mtopButton.setText("");
                mBottomButton.setText("");
            }
            else if(questionNumber==2)
            {
                mTextView.setText(R.string.T5_End);

                mBottomButton.setVisibility(View.GONE);
                mtopButton.setVisibility(View.GONE);
            }
        }
    }
    private void setTexts()
    {
        mTextView.setText(mStory[questionNumber].getStoryText());
        mtopButton.setText(mStory[questionNumber].getButton1());
        mBottomButton.setText(mStory[questionNumber].getButton2());
    }
}
