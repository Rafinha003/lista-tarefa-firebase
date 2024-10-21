package com.example.applistatarefas

import Controller.AutenticationController
import View.CadastrarActivity
import View.EsqueceuSenhaActivity
import View.TarefasActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.applistatarefas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ctrl: AutenticationController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val email = binding.txtEmail.text.toString()
            val senha = binding.txtSenha.text.toString()

            ctrl = AutenticationController()
            ctrl.login(email, senha) { sucesso, erro ->
                if (sucesso) {
                    Toast.makeText(this, "O usuário autenticado com sucesso", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(this, TarefasActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Usuário não existe", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.txtCadastrar.setOnClickListener {
            val it = Intent(this, CadastrarActivity::class.java)
            startActivity(it)
        }

        binding.txtEsqueceuSenha.setOnClickListener {
            val it = Intent(this, EsqueceuSenhaActivity::class.java)
            startActivity(it)
        }
    }
}
