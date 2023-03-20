/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.campeonatofutebol;

/**
 *
 * @author allan
 */
public class InfoTime {
    public String nomeTime;
    public String corTime;
    public String tecnico;
    public int titulos;
    public Jogadores jogadorTime;

    public InfoTime (String nome, String cor, String tecn, int ttls, Jogadores jogador) {
        nomeTime = nome;
        corTime = cor;
        tecnico = tecn;
        titulos = ttls;
        jogadorTime = jogador;
    }
    
    public Jogadores getJogador () {
        return jogadorTime;
    }
    
}
