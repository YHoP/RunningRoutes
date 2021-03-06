package com.example.yhop.runningroutes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yhop.runningroutes.R;
import com.example.yhop.runningroutes.models.User;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.txtUsername) EditText mTxtUsername;
    @Bind(R.id.txtPassword) EditText mTxtPassword;
    @Bind(R.id.btnSubmit) Button mBtnSubmit;
    @Bind(R.id.txtSubmit) TextView mTxtSubmit;
    @Bind(R.id.imgLogo) ImageView mImgLogo;
    @Bind(R.id.relativeLayout) RelativeLayout mRelativeLayout;

    Boolean signUpModeActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ButterKnife.bind(this);

        signUpModeActive = true;
        mTxtSubmit.setOnClickListener(this);
        mTxtSubmit.setOnClickListener(this);
        mImgLogo.setOnClickListener(this);
        mRelativeLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.txtSubmit){

            Log.i("Log In Activity", "Change Sign Up Mode");
            if(signUpModeActive){
                signUpModeActive = false;
                mTxtSubmit.setText(R.string.sign_up);
                mBtnSubmit.setText(R.string.login);
            } else {
                signUpModeActive = true;
                mBtnSubmit.setText(R.string.login);
                mTxtSubmit.setText(R.string.sign_up);
            }
        } else if (v.getId() == R.id.imgLogo || v.getId() == R.id.relativeLayout){
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromInputMethod(getCurrentFocus().getWindowToken(), 0);

        }

    }

    public void signUpOrLogin(View view) {
        String username = String.valueOf(mTxtUsername.getText());
        String password = String.valueOf(mTxtPassword.getText());
        if(signUpModeActive) {
            User user = new User(username, password);
            user.signUp();
            goToMainActivity();
        } else {
            User.login(username, password);
            goToMainActivity();
        }

    }

    public void goToMainActivity() {
        Intent intent = new Intent(LogInActivity.this, MainActivity.class);
        startActivity(intent);
    }

}
