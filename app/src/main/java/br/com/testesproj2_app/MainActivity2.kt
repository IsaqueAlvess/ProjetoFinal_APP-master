package br.com.testesproj2_app

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val visualizar =findViewById<View>(R.id.listview_estados);
        val TempHolder = intent.getStringExtra("dados_regiao")



        /*val intent=intent
        //val todos_estados=intent.getStringExtra("dados_estados")
        val bundle: Bundle? = intent.extras
        val todos_estados =  bundle!!.getString("dados_estados")
        Toast.makeText(this, todos_estados, Toast.LENGTH_LONG).show()*/


    }

}