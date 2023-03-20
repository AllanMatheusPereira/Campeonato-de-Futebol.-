/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.campeonatofutebol;

/**
 *
 * @author allan
 */
public class CampeonatoFutebol {

    public static void main(String[] args) {
        Jogadores jogador1 = new Jogadores("Vampeta", 10, "Atacante", "Corinthians", 30);
        Jogadores jogador2 = new Jogadores("Neymar", 10, "Atacante", "PSG", 27);
        Jogadores jogador3 = new Jogadores("Rogério Ceni ", 1, "Goleiro", "São-Paulo", 42);
        Jogadores jogador4 = new Jogadores("Ronaldo", 9, "Atacante", "Corinthians", 35);
        Jogadores jogador5 = new Jogadores("Messi", 33, "Ponta-Direita", "PSG", 32);
        
        InfoTime time1 = new InfoTime("PSG", "Azul", "Jerundio", 15, jogador5);
        if (time1.getJogador() != null) {
            System.out.println("Integrante do: " + time1.nomeTime);
        }
        
        InfoTime time2 = new InfoTime("Corinthians", "Preto/Branco", "Dunga", 4, jogador2);
        if (time2.getJogador() != null) {
            System.out.println("Integrante do: " + time2.nomeTime);
        }
        
        System.out.println("Jogo de hoje é entre " + time1.nomeTime + " com o uniforme " + time1.corTime +  " vs " + time2.nomeTime + " de uniforme " + time2.corTime);
    }
}