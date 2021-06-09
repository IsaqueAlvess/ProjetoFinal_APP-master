package br.com.testesproj2_app

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.content.Intent
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var lista_estados=intent.getStringExtra("estados")
        val lista_estatal=findViewById<ListView>(R.id.listview_estados2)



        if (lista_estados.toString()=="Norte"){

            val Nestados = arrayOf ("Tocantins", "Pará", "Amapá", "Roraima", "Amazonas", "Acre", "Rondônia")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Nestados)
            lista_estatal.adapter = adapter

        }else if (lista_estados.toString()=="Nordeste"){

            val Nestados = arrayOf ("Alagoas", "Bahia", "Ceará", "Maranhão", "Paraíba", "Pernambuco", "Piauí", "Rio Grande do Norte", "Sergipe")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Nestados)
            lista_estatal.adapter = adapter
        }else if (lista_estados.toString()=="Centro-Oeste"){

            val Nestados= arrayOf("Goiás"," Mato Grosso", "Mato Grosso do Sul", "Distrito Federal")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Nestados)
            lista_estatal.adapter = adapter

        }else if (lista_estados.toString()=="Sudeste"){
            val Nestados= arrayOf("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espírito Santo")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Nestados)
            lista_estatal.adapter = adapter

        }else if (lista_estados.toString()=="Sul"){

            val Nestados= arrayOf("Paraná", "Santa Catarina", "Rio Grande do Sul")
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Nestados)
            lista_estatal.adapter = adapter

        }

        lista_estatal.setOnItemClickListener { parent, view, i, id ->
            Toast.makeText(this, "Item selecionado" + lista_estatal[i], Toast.LENGTH_LONG).show()
        }
    }
}