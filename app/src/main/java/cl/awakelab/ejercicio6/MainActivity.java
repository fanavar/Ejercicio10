package cl.awakelab.ejercicio6;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cl.awakelab.ejercicio6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.textName.getText().toString();
                String lastName = binding.textLastName.getText().toString();
                String mail = binding.textMail.getText().toString();
                String pass = binding.textPass.getText().toString();


                if(name.isEmpty() || lastName.isEmpty() || mail.isEmpty()
                        || pass.isEmpty()   ){
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!mail.contains("@")){
                    Toast.makeText(getBaseContext(), "campo correo invalido ", Toast.LENGTH_SHORT).show();
                    return;
                }


                String text = "Usuario: " + name + "" + lastName + " Email: " + mail + " Contraseña: " + pass;

                Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();
            }
        });


    }
}