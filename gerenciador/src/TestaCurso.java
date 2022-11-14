import java.util.ArrayList;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21)); com o unmodifiableList, é retornado uma lista que não pode ser modificada

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelanddo Coleções", 22));


        System.out.println(javaColecoes.getAulas());


        // A ArrayList, como diz o nome, internamente usa uma array para guardar os elementos. Ela consegue fazer umas operações de maneira muito eficiente, como invocar o método get(indice). Se você precisa pegar o décimo quinto elemento, ele te devolve isso bem rápido. Onde uma ArrayList é lenta? Quando você for, por exemplo, inserir um novo elemento na primeira posição. Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. Se há muitos elementos, isso vai demorar... chamamos isso em computação de consumo de tempo linear.
        // Já a LinkedList possui uma grande vantagem aqui. Ela utiliza a estrutura de dados chamada lista ligada. Ela é muito rápida para adicionar e remover elementos na cabeça da lista, isso é, na primeira posição. Mas ela é lenta se você precisar acessar um determinado elemento, pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo.
    }
}
