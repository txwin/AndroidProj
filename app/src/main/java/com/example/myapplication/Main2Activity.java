package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Animal animal=new Animal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recy);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new HomeAdapter());
    }

    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHodler>{


        @NonNull
        @Override
        public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            final MyViewHodler myViewHodler;
            myViewHodler=new MyViewHodler(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false));
            myViewHodler.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent();

                    animal.setIntroduces(getResources().getStringArray(R.array.introduces)[myViewHodler.getAdapterPosition()]);
                    animal.setName(getResources().getStringArray(R.array.name)[myViewHodler.getAdapterPosition()]);
                    intent.putExtra("data",animal);
//                    Bundle bundle=new Bundle();
//                    bundle.putString("name",getResources().getStringArray(R.array.name)[myViewHodler.getAdapterPosition()]);
//                    bundle.putString("introduces",getResources().getStringArray(R.array.introduces)[myViewHodler.getAdapterPosition()]);
//                    intent.putExtra("data",bundle);
//                    intent.putExtra("data","点击了"+getResources().getStringArray(R.array.name)[myViewHodler.getAdapterPosition()]);
                    setResult(1,intent);
                    finish();
//                    Toast.makeText(getApplicationContext(),"点击了"+getResources().getStringArray(R.array.name)[myViewHodler.getAdapterPosition()],Toast.LENGTH_LONG).show();
                }
            });
            return myViewHodler;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {
            holder.iv.setImageResource(R.mipmap.ic_launcher);
            holder.textView.setText(getResources().getStringArray(R.array.name)[position]);
            holder.textView1.setText(getResources().getStringArray(R.array.introduces)[position]);

        }

        @Override
        public int getItemCount() {
            return getResources().getStringArray(R.array.name).length;
        }


        public class MyViewHodler extends RecyclerView.ViewHolder {
            ImageView iv;
            TextView textView, textView1;
            public MyViewHodler(@NonNull View itemView) {
                super(itemView);
                iv=itemView.findViewById(R.id.imageView);
                textView=itemView.findViewById(R.id.textView);
                textView1=itemView.findViewById(R.id.textView2);
            }
        }
    }
}
