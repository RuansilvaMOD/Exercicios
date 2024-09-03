import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entities.Faturamento;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Exercicio3 {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("src/main/resources/Json/dados.json")) {

            List<Faturamento> faturamentos = gson.fromJson(reader, new TypeToken<List<Faturamento>>() {}.getType());

            Faturamento maior = faturamentos.get(0);
            Faturamento menor = faturamentos.get(0);
            int nMedia = 0;
            float media = 0;

            for(Faturamento faturamento : faturamentos){

                if(faturamento.getValor() > 0){
                    nMedia++;
                    media += faturamento.getValor();
                }

                if(faturamento.getValor() > maior.getValor()){
                    maior = faturamento;
                }
                if(faturamento.getValor() < menor.getValor()){
                    menor = faturamento;
                }

            }

            media /= nMedia;
            int acimaMedia = 0;

            for(Faturamento faturamento : faturamentos){
                if (faturamento.getValor() > media) {
                    acimaMedia++;
                }
            }

            System.out.println("O menor faturamento foi de R$" + menor.getValor() + " no dia " + menor.getDia());
            System.out.println("O maior faturamento foi de R$" + maior.getValor() + " no dia " + maior.getDia());
            System.out.println("Número de faturamentos acima da media de R$" + media + " é de " + acimaMedia);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}