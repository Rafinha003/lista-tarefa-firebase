package View

import Controller.AutenticationController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.applistatarefas.R
import com.example.applistatarefas.databinding.ActivityEsqueceuSenhaBinding

class EsqueceuSenhaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEsqueceuSenhaBinding
    private lateinit var ctrl : AutenticationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEsqueceuSenhaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val email = binding.txtEmail.text.toString()

            ctrl = AutenticationController()
            ctrl.esqueceuSenha(email) { sucesso, erro ->
                if (sucesso) {
                    Toast.makeText(this,"Um e-mail de redefinição de senha foi enviado para " +
                            "o seu endereço de e-mail.",
                        Toast.LENGTH_LONG).show()
                    finish()

                } else {
                    Toast.makeText(this,
                        "Falha ao enviar e-mail de redefinição de senha. " +
                                "Verifique se o endereço de e-mail é válido.",
                        Toast.LENGTH_LONG).show()
                }
            }

        }

    }

}