package com.yanasmirnova.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends ActionBarActivity {
    // Member variables
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactBtn);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                // Update the fact label with a new fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
