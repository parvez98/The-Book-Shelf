package edu.purdue.parvezs.thebookshelf;

import android.content.Intent;
import android.media.MediaMetadata;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class BookActivity extends AppCompatActivity {

    private TextView textViewTitle, textViewAuthor, textViewDesc;
    private ImageView imageView;
    private ViewFlipper viewFlipper;
    private int[] slideImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        textViewTitle = (TextView)findViewById(R.id.title);
        textViewAuthor = (TextView)findViewById(R.id.author);
        textViewDesc = (TextView)findViewById(R.id.desc);
        imageView = (ImageView) findViewById(R.id.image);
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);

        //receive data
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String author = intent.getExtras().getString("Author");
        String desc = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Image");
        slideImage = intent.getExtras().getIntArray("slideImage");

        for (int i = 0; i < slideImage.length; i++){
            flipImage(slideImage[i]);
        }

        //values
        textViewTitle.setText(title);
        textViewAuthor.setText(author);
        textViewDesc.setText(desc);
        imageView.setImageResource(image);

    }

    public void flipImage(int slides){
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(slides);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);


        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }
}
