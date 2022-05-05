package com.example.linknet;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignupTabFragment extends Fragment {
    EditText username2;
    EditText password2;
    EditText email;
    Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment,container,false);
        username2 = (EditText) root.findViewById(R.id.username2);
        password2 = (EditText) root.findViewById(R.id.pass2);
        btn2 = (Button) root.findViewById(R.id.signup_button);
        email = (EditText) root.findViewById(R.id.email);

        username2.setTranslationY(800);
        password2.setTranslationY(800);
        btn2.setTranslationY(800);
        email.setTranslationY(800);

        username2.setAlpha(0);
        password2.setAlpha(0);
        btn2.setAlpha(0);
        email.setAlpha(0);


        username2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(800).start();
        btn2.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(800).start();
        return root;
    }

}