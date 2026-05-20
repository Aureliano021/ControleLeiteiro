package org.example;
import java.io.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.google.gson.*;

public class gerenciador {
    int quantidadeleite;
    LocalDate data;
    Boolean fora;

    public gerenciador(int leite, LocalDate data, boolean fora) {
        this.quantidadeleite = leite;
        this.data = data;
        this.fora = fora;
    }


}

