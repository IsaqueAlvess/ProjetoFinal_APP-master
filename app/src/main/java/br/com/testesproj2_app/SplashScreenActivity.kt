package br.com.testesproj2_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //Essa funcionalidade serve apenas para exibir a tela de inicialização do app e redirecionamento para a activity cadastro_pessoa

        val handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, cadastro_pessoa::class.java)
            startActivity(intent)
            finish()

        }, 3000)
    }
}