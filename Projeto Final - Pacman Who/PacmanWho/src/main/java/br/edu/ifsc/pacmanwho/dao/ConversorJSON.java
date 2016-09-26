/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.dao;

import br.edu.ifsc.pacmanwho.jogador.Jogador;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class ConversorJSON {
    private static final Gson gson = new Gson();
    
    public static void javaToJason(List<Jogador> jogadores) throws IOException{
        String json = gson.toJson(jogadores);
        FileWriter writer = new FileWriter("json.json");
        writer.write(json);
        writer.flush();
    }
    
    public static List<Jogador> jsonToJava() throws FileNotFoundException, IOException {
        List<Jogador> resultado;
        BufferedReader br = new BufferedReader(new FileReader("json.json"));
        resultado = gson.fromJson(br, new TypeToken<List<Jogador>>() {
        }.getType());
        return resultado;
    }
    
}
