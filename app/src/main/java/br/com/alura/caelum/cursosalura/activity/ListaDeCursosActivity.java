package br.com.alura.caelum.cursosalura.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.caelum.cursosalura.R;
import model.Curso;
import model.EstadoAtual;

public class ListaDeCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_cursos);

        List<Curso> cursos = todosOsCursos();

        ListView listaDeCursos = (ListView) findViewById(R.id.lista);


        ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this, android.R.layout.simple_list_item_1, cursos);
        listaDeCursos.setAdapter(adapter);

    }

    private List<Curso> todosOsCursos() {

        List<Curso> cursos = new ArrayList<>();

        Curso curso1 = new Curso("Java");
        curso1.setDescricao("básico de Java");
        curso1.setEstado(EstadoAtual.FINALIZADO);

        Curso curso2 = new Curso("HTML e CSS");
        curso2.setDescricao("HTML 5 e suas novidades");
        curso2.setEstado(EstadoAtual.FAZENDO);

        Curso curso3 = new Curso("Android");
        curso3.setDescricao("boas práticas");
        curso3.setEstado(EstadoAtual.FINALIZADO);


        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        return cursos;
    }


}
