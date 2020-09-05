package th.ac.su.cp.homework1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent i=getIntent();

        Button checkButton=findViewById(R.id.check);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.idNum);
                String numtext=  numberEditText.getText().toString();
                String num1="1111111111111";
                String num2="2222222222222";
                if(numtext.length()==13){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Page2.this);
                    dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    dialog.setPositiveButton("OK",null);
                if(numtext.equals(num1)||numtext.equals(num2)){
                    dialog.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    dialog.show();
                }
                else{
                    dialog.setMessage("คุณไม่มีสิทธิ์เลือกตั้ง");
                    dialog.show();
                }
                }
                else{
                    Toast t= Toast.makeText(Page2.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}