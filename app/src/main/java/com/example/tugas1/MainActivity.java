package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;

    TextView textView;

    RadioGroup radioGroup, rgMember;

    private TextView tvResult, tvMember;
   private RadioButton rbKayu, rbEbony, rbJati, rbNone, rbPerak, rbEmas;
   private Button btPesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup= findViewById(R.id.radioGroup);
        rgMember= findViewById(R.id.rgMember);
        textView= findViewById(R.id.tvJenis);

        tvResult= findViewById(R.id.tvResult);
        tvMember= findViewById(R.id.tvMember);

        rbKayu= findViewById(R.id.rbKayu);
        rbEbony= findViewById(R.id.rbEbony);
        rbJati= findViewById(R.id.rbJati);
        rbNone= findViewById(R.id.rbNone);
        rbPerak= findViewById(R.id.rbPerak);
        rbEmas= findViewById(R.id.rbEmas);

        btPesan= findViewById(R.id.btPesan);
        btPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                float kayu = Float.parseFloat(rbKayu.getText().toString());
                float ebony = Float.parseFloat(rbEbony.getText().toString());
                float jati = Float.parseFloat(rbJati.getText().toString());
                float none = Float.parseFloat(rbNone.getText().toString());
                float perak = Float.parseFloat(rbPerak.getText().toString());
                float emas = Float.parseFloat(rbEmas.getText().toString());

                if(kayu + none){
                    btPesan = "Rp.50,000,000";
                }


                radioButton= findViewById(radioId);


                tvResult.setText("Jenis Bahan: " + radioButton.getText());
                tvMember.setText("Membership: " + radioButton.getText());
            }
        });

    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton= findViewById(radioId);

        Toast.makeText(this,"Silahkan memilih Peti: " + radioButton.getText(),Toast.LENGTH_SHORT).show();


    }
}