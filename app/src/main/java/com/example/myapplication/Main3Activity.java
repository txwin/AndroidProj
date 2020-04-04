package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    private FragmentTransaction fragmentTransaction;
    private String[] foodtext={"1","2","3"};
    private String[] foodmenu={"水煮肉片","鱼香肉丝","酸菜鱼"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ContentFragment contentFragment=new ContentFragment();
        MenuFrgment menuFrgment=new MenuFrgment();
        fragmentTransaction=getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.menu,menuFrgment);
        fragmentTransaction.replace(R.id.food,contentFragment);
        fragmentTransaction.commit();
    }

    public String[] getFoodtext() {
        return foodtext;
    }

    public String[] getFoodmenu() {
        return foodmenu;
    }
}
