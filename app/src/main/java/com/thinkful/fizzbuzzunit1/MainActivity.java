package com.thinkful.fizzbuzzunit1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {

    TextView textView;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doButton(View view){
        // Implement the function of the button here
        // Use numberOfValues, and create a string array of both the numbers and words,
        // replacing the appropriate numbers with the words fizz or buzz

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.fizzText);
        textView.setText("" + "\n");

        int numberOfValues = Integer.parseInt(editText.getText().toString());
        //This reads the input from the user. Use this for your for loop.


        //--------------
        // Declare Strings Variables Here
        //--------------

        //--------------
        // Create the for loop and conditional statements here
        //--------------

        //for ( )
        //{
        //
        //
        //
        //  textView.append(valueString + "\n"); // display in the textView
        //}

        // Extra Credit!
        //use a while loop to count the number of Buzz words in the values Array, then display it in the console.




        //--------------

    }
}
