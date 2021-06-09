package br.com.testesproj2_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView_regioes = findViewById<ListView>(R.id.listview_regioes)
        val listViewestados=findViewById<View>(R.id.listview_estados)
        val nomesRegioes = arrayOf("Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul")
        val estados= arrayOf("Tocantins, Pará, Amapá, Roraima, Amazonas, Acre, Rondônia ","Alagoas, Bahia, Ceará, Maranhão, Paraíba, Pernambuco, Piauí, Rio Grande do Norte, Sergipe","Goiás," +
                "Mato Grosso, Mato Grosso do Sul, Distrito Federal","São Paulo, Rio de Janeiro, Minas Gerais, Espírito Santo", "Paraná, Santa Catarina, Rio Grande do Sul" )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomesRegioes)
            listView_regioes.adapter = adapter



        listView_regioes.setOnItemClickListener { parent, view, i, id ->
            var item_clicado=parent.getItemAtPosition(i)
            val intent =Intent(this, MainActivity2::class.java)
            intent.putExtra("estados", item_clicado.toString())
            //intent.putExtra("dados_estados", estados)
            Toast.makeText(this, "Item selecionado" + nomesRegioes[i], Toast.LENGTH_LONG).show()
            startActivity(intent)
        }
    }
}