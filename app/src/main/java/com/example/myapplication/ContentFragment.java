package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContentFragment extends Fragment {
    private View view;
    private TextView textView;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @SuppressLint("ResourceType")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.layout_food,container,false);
        if(view!=null){
            textView=view.findViewById(R.id.textView6);
        }
        setText(((Main3Activity) getActivity()).getFoodmenu()[0]);
        return view;
    }

    public void setText(String text){
        textView.setText(text);
    }
}
