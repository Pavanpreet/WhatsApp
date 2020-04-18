package com.example.ca_whatsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class chat extends Fragment {

    View v;
    private RecyclerView chat_recyclerView;
    private List<chat_home> chat_list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_chat,container,false);

        chat_recyclerView = v.findViewById(R.id.chat_recyclerView);

        chat_adapter_home chatAdapterHome = new chat_adapter_home(getContext(),chat_list);
        chat_recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        chat_recyclerView.setAdapter(chatAdapterHome);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        chat_list = new ArrayList<>();

        chat_list.add(new chat_home("Pavan","2:06 PM","My Message",R.drawable.girl1));
        chat_list.add(new chat_home("Gurdeep","9:45AM","My Message",R.drawable.man1));
        chat_list.add(new chat_home("Jaspreet","3:45PM","My Message",R.drawable.girl2));
        chat_list.add(new chat_home("Herry","10:05AM","My Message",R.drawable.man2));
        chat_list.add(new chat_home("Ranjit","1:45PM","My Message",R.drawable.girl3));
        chat_list.add(new chat_home("Prince","9:00AM","My Message",R.drawable.man3));
        chat_list.add(new chat_home("Abhi","Yesterday","My Message",R.drawable.man4));
        chat_list.add(new chat_home("Shake","yesterday","My Message",R.drawable.man4));
        chat_list.add(new chat_home("TaranVir","12/04/2020","My Message",R.drawable.girl4));
        chat_list.add(new chat_home("Dilip","10/01/2020","My Message",R.drawable.man6));
    }
}