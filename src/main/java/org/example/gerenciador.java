package org.example;
import java.io.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.google.gson.*;

public class gerenciador {
    int quantidadeleite;
    String data;
    Boolean fora;

    public gerenciador(int leite, LocalDate data, boolean fora) {
        this.quantidadeleite = leite;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedData = data.format(dtf);
        this.data = formattedData;
        this.fora = fora;

    }


}

