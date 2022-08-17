package com.example.noun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> students = new ArrayList<>();
    int cunStudent= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgephoto= findViewById(R.id.imageView);
        TextView textname= findViewById(R.id.textname);
        TextView textage= findViewById(R.id.textage);
        TextView textgrade= findViewById(R.id.textgrade);
        Button btn1= findViewById(R.id.stbutton);
        Intent Intent= new Intent();
        String textView1 = "textView";

        Student s1 = new Student("ahmed",16,R.drawable.i,11);
        Student s2 = new Student("levi",30,R.drawable.l,12);
        Student s3 = new Student("conan",17,R.drawable.d,11);
        Student s4 = new Student("minato",28,R.drawable.m,12);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        imgephoto.setImageResource(students.get(cunStudent).getStudentphoto());
        textname.setText(String.valueOf(students.get(cunStudent).getStudentname()));
        textage.setText(String.valueOf(students.get(cunStudent).getStudentage()));
        textgrade.setText(String.valueOf(students.get(cunStudent).getStudentGrade()));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                cunStudent++;
                if (cunStudent== students.size()){
                    cunStudent= 0;
                }


                imgephoto.setImageResource(students.get(cunStudent).getStudentphoto());
                textname.setText(students.get(cunStudent).getStudentname());
                textage.setText(String.valueOf(students.get(cunStudent).getStudentage()));
                textgrade.setText(String.valueOf(students.get(cunStudent).getStudentGrade()));

            }
        });







    }
}