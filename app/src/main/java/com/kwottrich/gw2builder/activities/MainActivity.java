package com.kwottrich.gw2builder.activities;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.kwottrich.gw2builder.R;
import com.kwottrich.gw2builder.actions.JSONReader;
import com.kwottrich.gw2builder.data.skills.Skill;
import com.kwottrich.gw2builder.util.ThreadHelper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final String IMAGE_URL_A = "https://render.guildwars2.com/file/93910A51076B0B43AC4CCF741EF57678CBB2FD51/103479.png";
    private static final String IMAGE_URL_B = "https://render.guildwars2.com/file/0A4809D69EDAD4FC34F9D46A035096B2EA48D412/1029990.png";

    private Map<String, Bitmap> imageMap;

    private String currentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageMap = new HashMap<>();
        currentImage = IMAGE_URL_A;

        SQLiteDatabase mydatabase = openOrCreateDatabase("gw2b_db",MODE_PRIVATE,null);

        JSONReader j = new JSONReader();
        try {
            ThreadHelper.runOnThread(j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void applyWebPicture(final String url, final int viewId) {
        new Thread() {
            Bitmap skillImg;
            public void run() {
                // Download image
                if (imageMap.containsKey(url)) {
                    System.err.println("Image cached, using cached copy...");
                    skillImg = imageMap.get(url);
                } else {
                    System.err.println("Image not cached, downloading now...");
                    try {
                        InputStream imgStream = (InputStream) new URL(url).getContent();
                        skillImg = BitmapFactory.decodeStream(imgStream);
                        imageMap.put(url, skillImg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                skillImg = Bitmap.createScaledBitmap(skillImg, 100, 100, false);

                // UI Changes must happen on UI thread
                Runnable updateButton = new Runnable() {
                    @Override
                    public void run() {
                        ImageView i = (ImageView) findViewById(viewId);
                        i.setImageBitmap(skillImg);
                    }
                };
                runOnUiThread(updateButton);
            }
        }.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void swapImage(View view) {
        switch (currentImage) {
            case IMAGE_URL_A:
                currentImage = IMAGE_URL_B;
                break;
            case IMAGE_URL_B:
                currentImage = IMAGE_URL_A;
                break;
            default:
                break;
        }
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
