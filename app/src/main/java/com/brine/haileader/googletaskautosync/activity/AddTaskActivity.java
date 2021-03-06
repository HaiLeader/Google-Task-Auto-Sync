package com.brine.haileader.googletaskautosync.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.brine.haileader.googletaskautosync.R;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        Button saveButton = (Button) findViewById(R.id.add_task_save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bundle bundle = buildTaskBundle();
                if (bundle != null) {
                    Intent mIntent = new Intent();
                    mIntent.putExtras(bundle);
                    setResult(RESULT_OK, mIntent);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(
            MenuItem item) {
        boolean result;
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                result = true;
                break;
            default:
                result = super.onOptionsItemSelected(item);
        }
        return result;
    }

    private Bundle buildTaskBundle() {
        Bundle bundle = null;
        EditText titleEditText = (EditText) findViewById(R.id.add_task_title);
        String title = titleEditText.getText().toString();

        if ( (title.length() > 0) ) {


            bundle = new Bundle();
            bundle.putString("title", title);
        }
        return bundle;
    }
}
