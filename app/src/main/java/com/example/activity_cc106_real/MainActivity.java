package com.example.activity_cc106_real;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

/*    TextView tv;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /*       tv = findViewById(R.id.tv1);
        StrictMode.enableDefaults();*/

 /*       try {
            URL url = new URL("http://192.168.100.155/myapplication/connect.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            Toast.makeText(getApplicationContext(), "PHP MYSQL CONNECT...", Toast.LENGTH_LONG).show();
            Log.e("pass 1", "Connection Success");
            tv.setText("Connected Successfully....");

            reader.close();
            inputStream.close();
        } catch (Exception e) {
            Log.e("Fail 1", e.toString());
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
        }*/
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
