package View

import Controller.AutenticationController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.applistatarefas.databinding.ActivityCadastrarBinding

class CadastrarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastrarBinding
    private lateinit var ctrl : AutenticationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalvar.setOnClickListener {
            val email = binding.txtEmail.text.toString()
            val senha = binding.txtSenha.text.toString()
            ctrl = AutenticationController()
            ctrl.criarUsuario(email, senha) { sucesso, erro ->
                if (sucesso) {
                    Toast.makeText(this, "Usuário criado com sucesso",
                        Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(this, "Erro ao criar usuário: " +
                            erro.toString(), Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}