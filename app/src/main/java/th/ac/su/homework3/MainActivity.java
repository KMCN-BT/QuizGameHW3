package th.ac.su.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.homework3.modal.WordItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // สร้าง Layout manager
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        // สร้าง Adapter object
        MyAdapter adapter = new MyAdapter();

        // เข้าถึง  RecyclerView ใน layout
        RecyclerView rv = findViewById(R.id.List);
        rv.setLayoutManager(lm); // กำหนด layout manager ให้กับ RecyclerView
        rv.setAdapter(adapter); // กำหนด adapter ให้กับ RecyclerView
    }
}
class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private WordItem[] items = {
            new WordItem(R.drawable.azalea, "AZALEA","ดอกกุหลาบพันปี"),
            new WordItem(R.drawable.butterflypea, "BUTTERFLY PEA","ดอกอัญชัน"),
            new WordItem(R.drawable.cannalily, "CANNA LILY","ดอกพุทธรักษา"),
            new WordItem(R.drawable.champaka, "CHAMPAKA","ดอกจำปา"),
            new WordItem(R.drawable.ixora, "IXORA","ดอกเข็ม"),
            new WordItem(R.drawable.lavender, "LAVENDER","ดอกลาเวนเดอร์"),
            new WordItem(R.drawable.orchid, "ORCHID","ดอกกล้วยไม้"),
            new WordItem(R.drawable.rose, "ROSE","ดอกกุหลาบ"),
            new WordItem(R.drawable.sunflower, "SUNFLOWER","ดอกทานตะวัน"),
            new WordItem(R.drawable.tulip, "TULIP","ดอกทิวลิป"),
    };
    MyAdapter() {
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.word_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].word);
        holder.wordTextView2.setText(items[position].word2);
    }
    @Override
    public int getItemCount() {
        return items.length;
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView wordTextView;
        TextView wordTextView2;
        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextView2 = itemView.findViewById(R.id.word_text_view2);
        }
    }
}