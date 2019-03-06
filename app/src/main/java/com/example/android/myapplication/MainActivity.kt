package com.example.android.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // fait le lien entre la classe MainActivity et l'interface graphique activity_main
        setContentView(R.layout.activity_main)

        // récuperer la toolbar  (android.support.v7)
        var toolbar = findViewById<Toolbar>(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    // ajouter le menu dans la toolbar
    // surcharge onCreateOptionsMenu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_main, menu)
        return true;
    }
    // on gère les différents appui sur le menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_favorite -> {
                val intent = Intent(this, GreenActivity::class.java);
                startActivity(intent);
                return true;
            }
            R.id.action_delete -> {
                Toast.makeText(this, "Supprimer", Toast.LENGTH_SHORT).show();
                return true;
            }
            else -> return super.onOptionsItemSelected(item);
        }
    }

}
