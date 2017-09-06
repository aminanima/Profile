package com.example.amina.profile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ImageView profileImage;
    private TextView Number;
    private TextView Email;
    private TextView Address;
    private TextView Name;
    private TextView Lastname;
    private RadioGroup my_rbGroup;
    private RadioButton my_rb1;
    private RadioButton my_rb2;
    private RadioButton my_rb3;
    private Profile profile1;
    private Profile profile2;
    private Profile profile3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupProfiles();
        my_rbGroup.check(my_rb1.getId());
    }

    private void setupProfiles() {
        profile1 = new Profile("Amina", "Smagulova","77076112859","aminas@gmail.com","some address");
        profile2 = new Profile("Mira", "Maxutova","77076112810","mira@gmail.com","some address2");
        profile3 = new Profile("Aru", "Gabdulgaziz","77753900582","aru@gmail.com","some address3");
    }

    private void bindViews() {
        profileImage = (ImageView) findViewById(R.id.img_view);
        Number = (TextView)findViewById(R.id.number);
        Email = (TextView)findViewById(R.id.email);
        Address = (TextView)findViewById(R.id.address);
        Name = (TextView)findViewById(R.id.name);
        Lastname = (TextView)findViewById(R.id.lastname);
        my_rbGroup = (RadioGroup)findViewById(R.id.rb_group);
        my_rb1 = (RadioButton)findViewById(R.id.rb_1);
        my_rb2 = (RadioButton)findViewById(R.id.rb_2);
        my_rb3 = (RadioButton)findViewById(R.id.rb_3);
        my_rb1.setOnCheckedChangeListener(this);
        my_rb2.setOnCheckedChangeListener(this);
        my_rb3.setOnCheckedChangeListener(this);

    }

    private void loadProfile(Profile p){
        Name.setText(p.getName());
        Lastname.setText(p.getSurname());
        Number.setText(p.getNumber());
        Email.setText(p.getEmail());
        Address.setText(p.getAddress());
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            switch (compoundButton.getId()){
                case R.id.rb_1:
                    loadProfile(profile1);
                    break;
                case R.id.rb_2:
                    loadProfile(profile2);
                    break;
                case R.id.rb_3:
                    loadProfile(profile3);
                    break;
            }
        }
    }
}