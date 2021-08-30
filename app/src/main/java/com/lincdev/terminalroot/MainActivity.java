package com.lincdev.terminalroot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaDica(View view){

        String[] frases = {

                "Use o comando pwd para encontrar o caminho para o diretório atual (da pasta) em que você está.",//1

                "Para navegar pelo filesystem do Linux, use o comando cd. Ele requer ou um caminho completo ou o nome de um diretório, dependendo do diretório atual em que você estiver.",//2

                "O comando ls é usado para visualizar conteúdos em um diretório. Por padrão, esse comando vai mostrar os conteúdos apenas do diretório atual em que você estiver.",//3

                "O cat é um dos comandos Linux mais usados. Ele é usado para visualizar o conteúdo de um arquivo na saída padrão (sdout). Para executar esse comando, digite cat seguido pelo nome do arquivo e sua extensão. Por exemplo: cat file.text.",//4

                "Use o comando cp para copiar arquivo do diretório atual em que você estiver. Por exemplo, o comando cp scenery.jpg /home/username/Picturesvai criar uma cópia de scenery.jpg para o diretório Pictures.  ",//5

                "O usuário habitual do comando mv é mover arquivos, ainda que ele possa também ser usado para renomear arquivos.",//6

                "Use o comando mkdir para criar um novo diretório – como mkdir Music, que vai criar um novo diretório chamado Music.",//7

                "Se você precisa apagar (deletar) um diretório, use o comando rmdir. Porém, o rdmir só permite que você apague diretórios vazios (sem conteúdos).",//8

                "O comando rm é usado para apagar um diretório e todos os conteúdos que estiverem lá dentro. Se você só quer deletar o diretório – como uma alternativa ao rdmir – use rm -r.",//9

                "O comando touch permite criar novos arquivos em branco através de uma linha de comando. Como exemplo, digite touch /home/username/Documents/Web.html para criar um arquivo HTML chamado Web dentro do diretório Documents.",//10

                "Correspondente a SuperUser Do, o comando sudo permite que que você execute tarefas que exigem permissões root ou administrativas. Porém, não é muito aconselhável usá-lo diariamente porque pode ser que um erro aconteça se você fizer algo de errado.",//11

                "Use o comando df para obter uma resposta da quantidade de espaço de disco usado no seu sistema. Esse valor será mostrado em KBs. Se você ver os resultados em MBs, digite df -m.",//12

                "O comando chmod é outro comando essencial. Ele é usado para ler, escrever e executar permissões de arquivos e diretórios.",//13

                "No Linux, todos os arquivos são de propriedade de um usuário específico. O comando chown permite que você mude ou transfira a propriedade de um arquivo para um nome de usuário específico.",//14

                "O comando jobs vai mostrar todos os trabalhos junto com os seus status de desenvolvimento. Um job é basicamente um processo que é iniciado pelo shell.",//15

                "Se você tem um programa que não está respondendo bem, você pode finalizá-lo manualmente pelo comando kill. Ele vai mandar um certo sinal ao aplicativo com mau funcionamento e instruir que ele seja encerrado sozinho logo na sequência.",//16

                "Use o comando ping para verificar o status da conexão do seu servidor. Por exemplo, digitando ping google.com, o comando vai checar se você está ou não conectado ao Google e também medir o tempo de resposta.",//17

                "A linha de comandos do Linux é muito útil: você até mesmo pode baixar arquivos da internet com a ajuda do comando wget. Para fazer isso, simplesmente digite wget seguido pelo link de download do arquivo.",//18

                "O comando uname, que significa Unix Name, vai mostrar informações detalhadas sobre seu sistema Linux. Isso inclui o nome da máquina, do sistema operacional, do kernel e assim por diante.",//19

                "Quando você já estiver familiarizado com o Linux, vai perceber que você pode executar centenas de comandos todos os dias. Por exemplo, o comando history (histórico) é particularmente útil se você quer rever quais comandos já usou antes.",//20

                "Este comando é usado para mover alguns dados para um arquivo. Por exemplo, se você quiser adicionar o texto “Olá, meu nome é John” em um arquivo chamado name.txt, digite echo Olá, meu nome é John >> name.txt",//21

                "Use o comando zip para compactar seus arquivos em um arquivo zip e use o comando unzip para extrair arquivos descompactados de um arquivo zip.",//22

                "Se você quiser saber o nome do seu host/network (da sua rede), basta digitar hostname. E se adicionar -I ao final, exibirá o endereço IP da sua rede."//23

        };
        int fraseAleatoria = new Random().nextInt(22); //método que seleciona uma frase aletatória que será exibida na textView da parte inferior da tela.

        TextView dica = findViewById(R.id.textResultado);
        dica.setText(frases[ fraseAleatoria]);
    }


}
