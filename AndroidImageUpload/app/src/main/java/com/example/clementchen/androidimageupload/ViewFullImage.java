package com.example.clementchen.androidimageupload;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

public class ViewFullImage extends Activity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_full_image);
        Intent intent = getIntent();
        int i = intent.getIntExtra(ImageListView.BITMAP_ID,0);

        imageView = (ImageView) findViewById(R.id.imageViewFull);
        imageView.setImageBitmap(GetAllImages.bitmaps[i]);
    }
}
