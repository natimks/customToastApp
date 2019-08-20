package br.edu.ifsc.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("teste","on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado,   (ViewGroup)  findViewById(R.id.toast_personalizado_layout));

        TextView text = (TextView) layout.findViewById(R.id.textView2);
        text.setText("This is a custom toast");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        Log.i("teste","on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("teste","on pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("teste","on restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("teste","on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("teste","on destroy");
    }

}
