Integração
Android + Firabse

1 - Na hora de criar o projeto 
copiar com.example.applistatarefas

2 - No firabase adicionar o com.example.applistatarefas nome pacote do android
    Apelido não precisa
    Certificado apenas se ira publicar na loja

3 - fazer download do arquivo gerado

4 - mudar a visualização do android studio de android para Project

5 - colar o arquivo que fez o dowload no arquivo app

6 - copiar a linha gerada Adicionar o SDK do Firebase

7 - editar build.gradle.kts Project colando a linha copiada no  SDK do Firebase

8 - no SDK do firabe copiar id("com.google.gms.google-services")

9 - editar build.gradle.kts Module no plugins colar a etapa 7

10 - editar build.gradle.kts Module e colar implementation(platform("com.google.firebase:firebase-bom:33.4.0"))

11 - adicionar no buil.gradle.kts module 
implementation("com.google.firebase:firebase-auth")    
implementation("com.google.firebase:firabase-firestore")

12 - adicionar
 buildFeatures{
        viewBinding = true
    }


13 - No android manifest adicionar
<uses-permission android:name="android.permission.INTERNET"></uses-permission>

14 - authentication -> selecionar os provedores de autenticação que você deseja incluir

15 -> ativar email e senha
