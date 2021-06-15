package br.com.testesproj2_app

import android.content.Context
import android.content.SharedPreferences

class SharedPreference {
    fun save(s: String, toString: String) {

    }
//Essa classe está salvando os dados no sharedPreference
    class SharedPreference (context: Context) {

        private val PREFERENCE_NAME = "PROJETODESBRAVANDOOBRASIL"
        val shared_preference: SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

        fun save(key_name:String, valor:String){
            val editor: SharedPreferences.Editor = shared_preference.edit()
            editor.putString(key_name, valor)
            editor.commit()
        }

        fun getValue(key_name: String):String? {
            return shared_preference.getString(key_name, null)
        }
    }
}