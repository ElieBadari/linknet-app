package com.example.linknet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginTabFragment extends Fragment {

    EditText username;
    EditText password;
    TextView frgtpass;
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        username = (EditText) root.findViewById(R.id.username);
        password = (EditText) root.findViewById(R.id.pass);
        btn = (Button) root.findViewById(R.id.login_button);
        frgtpass = (TextView) root.findViewById(R.id.frgt_pass);

        username.setTranslationX(800);
        password.setTranslationX(800);
        btn.setTranslationX(800);
        frgtpass.setTranslationX(800);

        username.setAlpha(0);
        password.setAlpha(0);
        btn.setAlpha(0);
        frgtpass.setAlpha(0);


        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        frgtpass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
}