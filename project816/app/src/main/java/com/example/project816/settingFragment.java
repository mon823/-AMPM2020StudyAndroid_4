package com.example.project816;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class settingFragment extends AppCompatActivity {

    private TextView tv_nickName;
    private ImageView iv_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_setting);

        //MainActivity로 부터 정보(닉네임, 프로필사진) 전달받음.
        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName");
        String photoUrl= intent.getStringExtra("photoUrl");

        //닉네임 세팅
        tv_nickName = findViewById(R.id.tv_nickName);
        tv_nickName.setText(nickName);

        //프로필 사진 세팅
        iv_profile = findViewById(R.id.iv_profile);
        Glide.with(this).load(photoUrl).into(iv_profile);

    }

}