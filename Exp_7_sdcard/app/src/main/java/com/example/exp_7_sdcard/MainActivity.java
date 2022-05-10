package com.example.exp_7_sdcard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView file,student,cgpa;
    EditText filevalue,studentvalue,cgpavalue;
    Button read,write;
    String name,no;
    FileWriter fw;
    FileReader fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        file = (TextView) findViewById(R.id.file);
        student = (TextView) findViewById(R.id.Student);
        cgpa = (TextView) findViewById(R.id.cgpa);

        filevalue = (EditText) findViewById(R.id.filevalue);
        studentvalue = (EditText) findViewById(R.id.studentvalue);
        cgpavalue = (EditText) findViewById(R.id.cgpavalue);

        write = (Button) findViewById(R.id.write);
        read = (Button) findViewById(R.id.read);





        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = studentvalue.getText().toString();
                no = cgpa.getText().toString();

                try {
                    fw = new FileWriter("SdCard.txt");
                    //fw.write(name + "." + no );
                    fw.write("working" );

                    fw.close();

                }
                catch(Exception e){
                    e.printStackTrace();

                }



            }
        });
        /*
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    fr = new FileReader("com/example/exp_7_sdcard/SdCard");

                    Scanner s = new Scanner(fr);
                    String data ="";

                    while(s.hasNext())
                    {
                        data = s.next();
                    }

                    String[] datas = data.split(".");
                    studentvalue.setText(datas[0]);
                    cgpavalue.setText(datas[1]);



                    fw.close();

                }
                catch(Exception e){
                    e.printStackTrace();

                }



            }
        });*/











    }
}