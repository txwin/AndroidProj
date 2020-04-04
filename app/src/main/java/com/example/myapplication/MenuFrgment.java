package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MenuFrgment extends Fragment {
    private View view;
    private TextView textView3,textView4,textView5;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.layout_menu,container,false);
        if(view!=null){
            textView3=view.findViewById(R.id.textView3);
            textView4=view.findViewById(R.id.textView4);
            textView5=view.findViewById(R.id.textView5);
        }
        textView3.setText(((Main3Activity) getActivity()).getFoodmenu()[0]);
        textView4.setText(((Main3Activity) getActivity()).getFoodmenu()[1]);
        textView5.setText(((Main3Activity) getActivity()).getFoodmenu()[2]);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentFragment contentFragment=(ContentFragment) ((Main3Activity)getActivity()).getSupportFragmentManager().findFragmentById(R.id.food);
                contentFragment.setText( ((Main3Activity)getActivity()).getFoodtext()[0]);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentFragment contentFragment=(ContentFragment) ((Main3Activity)getActivity()).getSupportFragmentManager().findFragmentById(R.id.food);
                contentFragment.setText( ((Main3Activity)getActivity()).getFoodtext()[1]);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentFragment contentFragment=(ContentFragment) ((Main3Activity)getActivity()).getSupportFragmentManager().findFragmentById(R.id.food);
                contentFragment.setText( ((Main3Activity)getActivity()).getFoodtext()[2]);
            }
        });
        return view;
    }
}
