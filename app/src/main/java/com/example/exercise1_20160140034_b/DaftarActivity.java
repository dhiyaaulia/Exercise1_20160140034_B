package com.example.exercise1_20160140034_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() ||
                edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Seluruh Data Wajib Diisi!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    Snackbar.make(view,"Password dan Repassword harus sama!", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}