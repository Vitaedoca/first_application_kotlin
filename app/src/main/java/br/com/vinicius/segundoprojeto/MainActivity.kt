package br.com.vinicius.segundoprojeto

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_SHORT).show();
    }





}