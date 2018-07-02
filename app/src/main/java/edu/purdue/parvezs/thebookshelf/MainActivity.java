package edu.purdue.parvezs.thebookshelf;

import android.os.RemoteCallbackList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<BookData> bookDataList;
    private RecyclerView view;
    private BookAdapter bookadapter;
    private int[] cmbynSlide = {R.drawable.cmbynone, R.drawable.cmbyntwo, R.drawable.cmbynthree, R.drawable.cmbynfour, R.drawable.cmbynfive };
    private int[] reasonsSlide = {R.drawable.reasonsone, R.drawable.reasonseight, R.drawable.reasonsseven, R.drawable.reasonsfour, R.drawable.reasonsfive};
    private int[] everythingSlide = {R.drawable.everythingone, R.drawable.everythingtwo, R.drawable.everythingthree, R.drawable.everythingfour, R.drawable.everythingfive};
    private int[] harrySlide = {R.drawable.harryone, R.drawable.harrytwo, R.drawable.harrythree, R.drawable.harryfour, R.drawable.harryfive};
    private int[] simonSlide = {R.drawable.simonfive, R.drawable.simontwo, R.drawable.simonthree, R.drawable.simonfour, R.drawable.simonone};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookDataList = new ArrayList<>();
        bookDataList.add(new BookData("Call Me By Your Name", "Andre Aciman", "Love Story", "Gay Love Story between Elio and Oliver", R.drawable.cmbyn, cmbynSlide));
        bookDataList.add(new BookData("13 Reasons Why", "Jay Asher", "Teenage", "Hannak Baker commits suicide but leaves behind 13 tapes that contain the reasons of her death", R.drawable.reasons, reasonsSlide));
        bookDataList.add(new BookData("Everything Everything", "Nicola Yoon", "Love Story", "Maddie has never left her house, but she is ready to take the risk for the new neighour Olly", R.drawable.everything, everythingSlide));
        bookDataList.add(new BookData("Harry Potter and The Cursed Child", "J.K. Rowling", "Magic", "Years have passed since the demise of Voldemort. Will he come back through Harry's son's help?Years have passed since the demise of Voldemort. Will he come back through Harry's son's help?Years have passed since the demise of Voldemort. Will he come back through Harry's son's help?Years have passed since the demise of Voldemort. Will he come back through Harry's son's help?Years have passed since the demise of Voldemort. Will he come back through Harry's son's help?", R.drawable.harry, harrySlide));
        bookDataList.add(new BookData("Simon vs A Agenda Homo Sapiens", "Becky Albertalli", "Love Story", "Simon, a high school junior, who struggles to come out", R.drawable.simon, simonSlide));

        view = (RecyclerView)findViewById(R.id.recyclerView);
        bookadapter = new BookAdapter(this, bookDataList);
        view.setLayoutManager(new GridLayoutManager(this, 2));
        view.setAdapter(bookadapter);
    }
}
