package com.kleploytech.vidyalekha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.kleploytech.vidyalekha.data.rdata;
import com.kleploytech.vidyalekha.databinding.ActivityInsertRecodBinding;

public class insert_recod extends AppCompatActivity {
    ActivityInsertRecodBinding binding;
    private FirebaseDatabase mDatabase;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityInsertRecodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mDatabase = FirebaseDatabase.getInstance();
        myRef= mDatabase.getReference("student");

        binding.bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=binding.snamef.getText().toString();
                String reg=binding.sregf.getText().toString();
                String sem=binding.ssemf.getText().toString();
                String email=binding.semailf.getText().toString();
                String depa=binding.depf.getText().toString();
                String phone=binding.sphonef.getText().toString();


                rdata data=new rdata(name,sem,reg,depa,email,phone);
                myRef.child(reg).setValue(data);

                binding.snamef.setText("");
                binding.sregf.setText("");
                binding.sphonef.setText("");
                binding.semailf.setText("");
                binding.ssemf.setText("");
                binding.depf.setText("");


                Toast.makeText(insert_recod.this, "Recods are inserted", Toast.LENGTH_SHORT).show();


            }
        });

        






    }
}