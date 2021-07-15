package com.example.recyclerview;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Bradly cooper", "156121651", "https://www.biography.com/.image/t_share/MTE1ODA0OTcxNTEyODU4MTI1/bradley-cooper-547062-1-402.jpg"));
        contacts.add(new Contact("Saoirse Ronan", "5654646", "https://www.nova.ie/wp-content/uploads/2017/12/Ronan-1.png"));
        adapter.setContacts(contacts);
    }
}