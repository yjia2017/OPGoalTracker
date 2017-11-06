package ca.ualberta.cs.opgoaltracker.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import ca.ualberta.cs.opgoaltracker.R;

public class HabitAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit_add);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater myMenuInflater = getMenuInflater();
//        myMenuInflater.inflate(R.menu.my_menu,menu);
//        return true ;
//    }

}
