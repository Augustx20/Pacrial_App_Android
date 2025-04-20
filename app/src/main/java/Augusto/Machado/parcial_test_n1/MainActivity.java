package Augusto.Machado.parcial_test_n1;

import static Augusto.Machado.parcial_test_n1.R.id.test;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_activity);
        Button login_Button = findViewById(R.id.button_login);

        login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user;
                String pass;
                TextView login_user_text = findViewById(R.id.login_user_text);
                user = String.valueOf(login_user_text.getText());

                TextView login_pass_text = findViewById(R.id.login_password_text);
                pass = String.valueOf(login_pass_text.getText());
                if (user.equals("user") && (pass.equals("user"))){
                    setContentView(R.layout.activity_main);
                    updateMessage();
                    return;
                }


            }
        });
    }

    public void updateMessage(){
        Log.i("test-message","Incio de sesion con exito!!!!");
    }
}