package br.com.cadastro.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;

public class Principal {
	public static void main(String[] args) throws IOException {
		Principal p = new Principal();
		JogadorImpl jogImpl = new JogadorImpl();
		
		String enderecoDir = "C:\\temp\\in";
		
		String nomeArquivo = "jogadores.txt";
		
		List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo ));
		
		if(!jogImpl.verificaArquivoExiste(Paths.get(enderecoDir))) {
			System.out.println("Arquivo não encontrado");
		}else {
			jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
			jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
		}
	}
}
