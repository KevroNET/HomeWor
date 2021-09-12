package ru.gb.android.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.gb.android.lesson1.databinding.ActivityLoginBinding;
import ru.gb.android.lesson1.databinding.ActivityRegirtationBinding;
import ru.gb.android.lesson1.ui.login.LoginActivity;

public class RegistrationActivity extends AppCompatActivity {
    private ActivityRegirtationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_regirtation);

        binding = ActivityRegirtationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final Button offRegistrationButton = binding.offRegistrationButton;

        offRegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}