package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn,btn2,button;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn2=findViewById(R.id.button15);
        button=findViewById(R.id.button2);
        imageView=findViewById(R.id.imageView3);

        btn2.setOnClickListener(this);
        btn.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                imageView.setImageResource(android.R.drawable.presence_online);
                break;
            case R.id.button15:
                imageView.setImageResource(android.R.drawable.presence_offline);
                AlertDialog builder=new AlertDialog.Builder(this).setTitle("asd").show();
                break;
            case R.id.button2:
                Intent intent=new Intent(getApplication(),Main3Activity.class);
//                startActivityForResult(intent,1);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==1){
            Bundle bundle=new Bundle();
//            String st=data.getBundleExtra("data").getString("name")+data.getBundleExtra("data").getString("introduces");
            Animal animal= (Animal) data.getSerializableExtra("data");
            String st=animal.getIntroduces()+animal.getName();
            Toast.makeText(getApplicationContext(),"点击了"+st,Toast.LENGTH_LONG).show();
        }
    }
}
