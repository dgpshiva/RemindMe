package com.example.remindme;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;



public class NewExerciseSchedule extends ActionBarActivity
{
    private RelativeLayout addExerciseSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exercise_schedule);
        addExerciseSchedule = (RelativeLayout) findViewById(R.id.newExerciseSchedule);
        //EditText newInput_scheduleName = new EditText(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_exercise_schedule, menu);
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

    public void addNewExerciseSchedule(View view)
    {
        final LayoutParams lparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        final EditText newInput_scheduleName = new EditText(this);
        newInput_scheduleName.setLayoutParams(lparams);
        newInput_scheduleName.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        newInput_scheduleName.setTop(28);
        newInput_scheduleName.setLeft(27);
        newInput_scheduleName.setHint("Exercise 2");
        addExerciseSchedule.addView(newInput_scheduleName);
    }
}
