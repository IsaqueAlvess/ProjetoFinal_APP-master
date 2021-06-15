package br.com.testesproj2_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_pessoa.*


class cadastro_pessoa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_pessoa)
        // Aqui está a validação dos dados de entrada
        fun validateInput(): Boolean{
            if (TextUtils.isEmpty(cadNome.getText())){
                cadNome.setError("Nome obrigatório")
                cadNome.requestFocus()
                return false
            }

            if (TextUtils.isEmpty(cadEmail.getText())){
                cadEmail.setError("Email obrigatório")
                cadEmail.requestFocus()
                return false
            }

            if (TextUtils.isEmpty(cadTelefone.getText())){
                cadTelefone.setError("telefone obrigatório")
                cadTelefone.requestFocus()
                return false
            }

            return true

        }
        fun validatee():Boolean{if(cadEmail.getText().contains("@") != true){
            cadEmail.setError("Email deve ter @")
            cadEmail.requestFocus()
            return false
        }
            return true
        }
            //Aqui é o botão cadastrar que coleta os dados digitados e armazena eles, após isso redirecionando para a mainActivity
            //onde está a apresentação da lista de regiões
            btnCadastrar.setOnClickListener {
                if(validateInput()) {
                if (validatee()) {
                    val sharedPreference = getSharedPreferences(
                        "preferencias",
                        MODE_PRIVATE
                    )
                    //recebimento de dados
                    val ed = sharedPreference.edit()
                    val nome = findViewById(R.id.cadNome) as EditText
                    val email = findViewById(R.id.cadEmail) as EditText
                    val telefone = cadTelefone.text.toString()

                    //armazenamento de dados
                    ed.putString("nome", nome.getText().toString())
                    ed.putString("email", email.getText().toString())
                    ed.putString("telefone", telefone.toLong().toString())
                    Toast.makeText(getBaseContext(), "Gravado com sucesso", Toast.LENGTH_SHORT)
                        .show()
                    //direcionamento para próxima tela
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("cadastro", btnCadastrar.toString())
                    startActivity(intent)
                }
            }
       }
    }
}