package cl.awakelab.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textLastName;
        EditText textMail;
        EditText textPass;

        textName = findViewById(R.id.textName);
        textLastName = findViewById(R.id.textLastName);
        textMail = findViewById(R.id.textMail);
        textPass = findViewById(R.id.textPass);

        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                String lastName = textLastName.getText().toString();
                String mail = textMail.getText().toString();
                String pass = textPass.getText().toString();


                if(textName.getText().toString().isEmpty() || textLastName.getText().toString().isEmpty() || textMail.getText().toString().isEmpty()
                        || textPass.getText().toString().isEmpty()   ){
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!textMail.getText().toString().contains("@")){
                    Toast.makeText(getBaseContext(), "campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }


                String text = "Usuario: " + name + "" + lastName + " Email: " + mail + " Contraseña: " + pass;

                Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();
            }
        });


    }
}