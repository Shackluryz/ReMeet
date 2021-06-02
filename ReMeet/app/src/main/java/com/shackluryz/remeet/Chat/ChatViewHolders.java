package com.shackluryz.remeet.Chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.shackluryz.remeet.R;

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public ChatViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    }
}
