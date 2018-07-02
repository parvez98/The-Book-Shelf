package edu.purdue.parvezs.thebookshelf;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context mContext;

    public BookAdapter(Context mContext, List<BookData> bookList) {
        this.mContext = mContext;
        this.bookList = bookList;
    }

    private List<BookData> bookList;

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        v = inflater.inflate(R.layout.card_view, parent, false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, final int position) {

        holder.textViewName.setText(bookList.get(position).getName());
        holder.textViewAuthor.setText(bookList.get(position).getAuthor());
        holder.imageView.setImageResource(bookList.get(position).getImage());

        //
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, BookActivity.class);

                intent.putExtra("Title", bookList.get(position).getName());
                intent.putExtra("Author", bookList.get(position).getAuthor());
                intent.putExtra("Description", bookList.get(position).getShortDesc());
                intent.putExtra("Image", bookList.get(position).getImage());
                intent.putExtra("slideImage", bookList.get(position).getSlideImage());
                mContext.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public static class BookViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName, textViewAuthor;
        ImageView imageView;
        CardView cardView;

        public BookViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView)itemView.findViewById(R.id.bookTitle);
            textViewAuthor = (TextView)itemView.findViewById(R.id.bookAuthor);
            imageView = (ImageView)itemView.findViewById(R.id.bookImage);
            cardView = (CardView)itemView.findViewById(R.id.cardView);
        }
    }

}
