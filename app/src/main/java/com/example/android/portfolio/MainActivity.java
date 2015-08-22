package com.example.android.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyBtn = (Button)findViewById(R.id.spotify_button);
        Button scoresBtn = (Button)findViewById(R.id.scores_button);
        Button libraryBtn = (Button)findViewById(R.id.library_button);
        Button buildItBtn = (Button)findViewById(R.id.build_it_button);
        Button readerBtn = (Button)findViewById(R.id.reader_button);
        Button capstoneBtn = (Button)findViewById(R.id.capstone_button);
        final String[] projectName = {"Spotify Streamer", "Football Scores", "Library", "Build It",
                "XYZ Reader", "Capstone"};
        Button[] btnArray = {spotifyBtn, scoresBtn,libraryBtn,buildItBtn,readerBtn,capstoneBtn};
       /* for(int i=0;i<btnArray.length; i++) {
            this.makeClickable(btnArray[i], projectName[i]);

        }*/
    }

    public void showToast(View view){
        Button b = (Button)view;
        Toast toast = Toast.makeText(getApplicationContext(),
                "This Button will launch my " + b.getText().toString() + " Project", Toast.LENGTH_LONG);
        //This section of code was taken from http://www.mkyong.com/android/android-toast-example/
        //its purpose is to center the text contained in the toast message
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }
    /**
     * a method to set onclickListeners to the various buttons in the app
     * @param btn
     * @param projectName
     */
    public void makeClickable(Button btn, final String projectName){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "This Button will launch my " + projectName + " Project", Toast.LENGTH_LONG);
                //This section of code was taken from http://www.mkyong.com/android/android-toast-example/
                //its purpose is to center the text contained in the toast message
                TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
                if( v != null) v.setGravity(Gravity.CENTER);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}
