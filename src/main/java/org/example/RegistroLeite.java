package org.example;
import java.time.LocalDate;

import static org.example.Main.dtf;

public class RegistroLeite {
    private int quantidadeleite;
    private String data;
    private Boolean fora;

    public void setLeite(int leite) {
        this.quantidadeleite = leite;
    }
    public int getQuantidadeleite() {
        return quantidadeleite;
    }

    public void setData(LocalDate data) {
        LocalDate DataHoje = LocalDate.now();
        if (data.isAfter(DataHoje)) {
            throw new RuntimeException("Não é possível adicionar data futura");
        }
        else {
            this.data = data.format(dtf);
        }

    }
    public LocalDate getData() {
        return LocalDate.parse(data);
    }

    public void setFora(Boolean fora) {
        this.fora = fora;
    }
    public Boolean getFora() {
        return fora;
    }



}
