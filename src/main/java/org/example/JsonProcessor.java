
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.example.DadosEntrada;
import org.example.DadosSaida;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JsonProcessor {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<DadosEntrada> list = new ArrayList<>();

        String stringListaObjetos = sc.nextLine();

        DadosEntrada[] listaObjetos = new Gson().fromJson(stringListaObjetos, DadosEntrada[].class);

        List<DadosSaida> novaLista = processarLista(List.of(listaObjetos));

        System.out.println("Lista Original: " + listaObjetos);
        System.out.println("Nova Lista: " + novaLista);



    }

    public static String processJsonList(String inputJson) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        List<DadosEntrada> listaDeEntrada = objectMapper.readValue(inputJson, objectMapper.getTypeFactory().constructCollectionType(List.class, DadosEntrada.class));

        String outputJson = objectMapper.writeValueAsString(listaDeEntrada);

        return outputJson;
    }

    public static List<DadosSaida> processarLista(List<DadosEntrada> listaOriginal) {
        List<DadosSaida> novaLista = new ArrayList<>();

        for (DadosEntrada elemento : listaOriginal) {
            novaLista.add(new DadosSaida(elemento.getUnitCost()));
        }
        return novaLista;
    }

}
