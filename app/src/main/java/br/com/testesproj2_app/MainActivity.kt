package br.com.testesproj2_app

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_tela_de_cadastro.*

class MainActivity : AppCompatActivity() {
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val channelID="projeto"
        val desc="notifications"

        val listView_regioes = findViewById<ListView>(R.id.listview_regioes)
        val nomesRegioes = arrayOf("Norte", "Nordeste", "Centro-Oeste", "Sudeste", "Sul")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomesRegioes)
            listView_regioes.adapter = adapter

            notificationManager= getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        listView_regioes.setOnItemClickListener { parent, view, i, id ->

            var item_clicado = parent.getItemAtPosition(i)
            val pendingIntent =
                PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("estados", item_clicado.toString())
            //intent.putExtra("dados_estados", estados)
            Toast.makeText(this, "Item selecionado" + nomesRegioes[i], Toast.LENGTH_LONG).show()
            notificationChannel =
                NotificationChannel(channelID, desc, NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.lightColor = Color.MAGENTA
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
                if (item_clicado != "Sul") {
                    builder = Notification.Builder(this)
                        .setContentTitle("Local mais seguro? Temos!")
                        .setContentText("O Sul possui a maior porcentagem de vacinação. Dá uma olhada ;)")
                        .setChannelId(channelID)
                        .setSmallIcon(R.drawable.ic_baseline_healing_24)
                        .setContentIntent(pendingIntent)
                    notificationManager.notify(1234, builder.build())
                }
            startActivity(intent)
        }

        setContentView(R.layout.activity_tela_de_cadastro)
        val sharedPreference = SharedPreference(this)

        btnCadastrar.setOnClickListener {
            val nome = findViewById(R.id.cadNome) as EditText
            sharedPreference.save("nome", cadNome.text.toString())

            val email = findViewById(R.id.cadEmail) as EditText
            sharedPreference.save("email", cadEmail.text.toString())

            val telefone = findViewById(R.id.cadTelefone) as EditText
            sharedPreference.save("telefone", cadTelefone.text.toString())
        }

//        btnMostrar.setOnClickListener {
//            mostrarNome.text = sharedPreference.getValue("nome")
//            mostrarEmail.text = sharedPreference.getValue("email")
//            mostrarTelefone.text = sharedPreference.getValue("telefone")
//        }
    }
}