package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.example.Verificador.verificador;

public class SomaFinal {
    public static void soma() throws IOException {
        String conteudo = verificador();
        if (conteudo != null) {
            int total = 0;
            int resposta = Terminal.lerint("Realizar soma \n 1 - Anual \n 2 - Mensal");
                    if (resposta == 1) {
                        String data = Terminal.lertexto("Informe o ano:");
                        JsonArray array = JsonParser.parseString(conteudo).getAsJsonArray();
                        for (JsonElement jsonElement : array) {
                            JsonObject obj = jsonElement.getAsJsonObject();
                            String dataarray = obj.get("data").getAsString();
                            if (dataarray.contains(data)) {
                                int quantidade = obj.get("quantidadeleite").getAsInt();
                                total += quantidade;
                            }

                        }
                        if (total == 0) {
                            Terminal.erro("Não há resgistro para o ano informado!");
                        }else {
                            Terminal.mensagem("total: " + total);
                        }
                    }
                    else if (resposta == 2) {
                        String data = Terminal.lertexto("Informe o mês e o ano:");
                        JsonArray array = JsonParser.parseString(conteudo).getAsJsonArray();
                        for (JsonElement jsonElement : array) {
                            JsonObject obj = jsonElement.getAsJsonObject();
                            String dataarray = obj.get("data").getAsString();
                            if (dataarray.substring(3,10).equals(data)) {
                                int quantidade = obj.get("quantidadeleite").getAsInt();
                                total += quantidade;
                            }


                        }
                        if (total == 0) {
                            Terminal.erro("Não há registro para o mês informado!");
                        }else {
                            Terminal.mensagem("total: " + total);
                        }
                        }
                    else {
                        Terminal.erro("Digite apenas \"1\" ou \"2\"!");
                    }
        }
        else {
            Terminal.erro("Não há registros.");
        }
    }

}
