 package com.shackluryz.remeet.Chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.shackluryz.remeet.Matches.MatchesActivity;
import com.shackluryz.remeet.Matches.MatchesAdapter;
import com.shackluryz.remeet.Matches.MatchesObject;
import com.shackluryz.remeet.R;

import java.util.ArrayList;
import java.util.List;

 public class ChatActivity extends AppCompatActivity {

     private RecyclerView mRecyclerView;
     private RecyclerView.Adapter mChatAdapter;
     private RecyclerView.LayoutManager mChatLayoutMananger;
     private String currentUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        currentUserID = FirebaseAuth.getInstance().getCurrentUser().getUid();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        mChatLayoutMananger = new LinearLayoutManager(ChatActivity.this);
        mRecyclerView.setLayoutManager(mChatLayoutMananger);
        mChatAdapter = new ChatAdapter(getDataSetChat(), ChatActivity.this);
        mRecyclerView.setAdapter(mChatAdapter);
    }

     private ArrayList<ChatObject> resultsChat = new ArrayList<ChatObject>();
     private List<ChatObject> getDataSetChat() {
         return resultsChat;
     }
}