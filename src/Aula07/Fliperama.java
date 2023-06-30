package Aula07;

public class Fliperama {
	    public static void main(String[] args) {
	        // Instanciando os objetos necessários para testar o programa
	        Card card1 = new Card(1);
	        Card card2 = new Card(2);
	        
	        Game game = new Game(3, 5); // Jogo requer 3 créditos e concede de 0 a 9 tíquetes
	        PrizeCategory[] prizeCategories = {
	            new PrizeCategory("Categoria 1", 10, 5), // Categoria 1 requer 10 tíquetes e possui 5 itens restantes
	            new PrizeCategory("Categoria 2", 5, 3),  // Categoria 2 requer 5 tíquetes e possui 3 itens restantes
	            new PrizeCategory("Categoria 3", 7, 0)   // Categoria 3 requer 7 tíquetes e não possui mais itens
	        };
	        Terminal terminal = new Terminal(prizeCategories);
	        
	        // Carregando créditos nos cartões
	        terminal.insertCard(card1);
	        terminal.addCredits(10); // Adicionando $10 -> 20 créditos
	        terminal.insertCard(card2);
	        terminal.addCredits(5);  // Adicionando $5 -> 10 créditos
	        
	        // Jogando um grupo de jogos usando os cartões
	        terminal.insertCard(card1);
	        game.playGame(card1);
	        terminal.insertCard(card2);
	        game.playGame(card2);
	        terminal.insertCard(card1);
	        game.playGame(card1);
	        
	        // Transferindo saldo de créditos e tíquetes do cartão 1 para o cartão 2
	        terminal.insertCard(card1);
	        terminal.transferCredits(card2, 8); // Transferindo 8 créditos
	        terminal.insertCard(card1);
	        terminal.transferCredits(card2, 10); // Tentativa de transferir 10 créditos com saldo insuficiente
  }
}
