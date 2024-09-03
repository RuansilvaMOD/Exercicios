import java.util.HashMap;
import java.util.Map;

public class Exercicio4 {

    public static void main(String[] args) {
        HashMap<String, Double> distribuidora = new HashMap<>();
        distribuidora.put("SP", 67836.43);
        distribuidora.put("RJ", 36678.66);
        distribuidora.put("MG", 29229.88);
        distribuidora.put("ES", 27165.48);
        distribuidora.put("Outros", 19849.53);

        Double valorTotal = 0.0;

        for(Double valor : distribuidora.values()){
            valorTotal += valor;
        }

        System.out.println("Valor Total: " + valorTotal);

        for (Map.Entry<String, Double> entry : distribuidora.entrySet()) {
            String estado = entry.getKey();
            Double valor = entry.getValue();

            System.out.println(estado + " - " + String.format("%.2f", ((valor/valorTotal) * 100)) + "%");
        }

    }
}
