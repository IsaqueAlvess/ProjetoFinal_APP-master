package br.com.testesproj2_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_pessoa.*


class cadastro_pessoa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_pessoa)


        //val sharedPreference = SharedPreference(this, )

        btnCadastrar.setOnClickListener {
            val sharedPreference = getSharedPreferences(
                "preferencias",
                Context.MODE_PRIVATE
            )

            val ed = sharedPreference.edit()
            val nome = findViewById(R.id.cadNome) as EditText
            //sharedPreference.save("nome", cadNome.text.toString())

            val email = findViewById(R.id.cadEmail) as EditText
            //sharedPreference.save("email", cadEmail.text.toString())

            val telefone = findViewById(R.id.cadTelefone) as EditText
            //sharedPreference.save("telefone", cadTelefone.text.toString())

            ed.putString("nome", nome.getText().toString())
            ed.putString("email", nome.getText().toString())
            ed.putString("telefone", nome.getText().toString())
            ed.apply()

            Toast.makeText(getBaseContext(), "Gravado com sucesso",
                Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("cadastro", btnCadastrar.toString())
            Toast.makeText(this, "Item selecionado" + nome, Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        /*btnMostrar.setOnClickListener {
           mostrarNome.text = sharedPreference.getValue("nome")
            mostrarEmail.text = sharedPreference.getValue("email")
            mostrarTelefone.text = sharedPreference.getValue("telefone")
        }*/
    }
}