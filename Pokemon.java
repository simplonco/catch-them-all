//package mapremiereclasse;

public class Pokemon{
	String nom; //stocke le nom du pokemon
	int pv; //stocke les points de vie
	int niveau; //stocke le niveau

	private static int totalPokemon = 0; //propri�t� de la classe


	//constructeur par d�faut
	public Pokemon() {
		//System.out.println("Cr�ation d'un pok�mon par d�faut");
		nom = "Inconnu";
		pv = 0;

		totalPokemon++; // on incr�mente la propri�t� de classe
	}


	//constructeur AVEC PARAMETRES :
	public Pokemon(String nom, int niveau, int pv) {
		//System.out.println("Cr�ation d'un pok�mon avec param�tres");
		this.nom = nom;
		this.niveau = niveau;
		this.pv = pv;

		totalPokemon++; // on incr�mente la propri�t� de classe
	}



	//m�thode qui affiche les param�tres
	public void decrisToi(){
		System.out.println("Je m'appelle " + this.nom);
		System.out.println("j'ai " + this.pv + " points de vie");
	}

	//M�thode qui compare les pv de deux pokemons et renvoie un String
	public String trouverMax(int b){
		if (this.pv > b)
			return "Je suis plus fort que ";
		else if (this.pv == b)
			return "Je suis du même niveau que ";
		else
			return "Je suis moins fort que ";
	}



	public static void main(String[] args){

		//cr�ation des objets
		Pokemon anonyme = new Pokemon(); // un pokemon par d�faut
		Pokemon marisson = new Pokemon("Marisson", 0, 60); //marisson
		Pokemon feunnec = new Pokemon("Feunnec", 0, 60); //feunnec
		Pokemon grenousse = new Pokemon("Grenousse",0, 60); // grenousse

		//afficher le nombre d'instances de la classe pokemon
		System.out.println("Nombre d'objets créés= " + Pokemon.totalPokemon + "\n");

		//1.afficher le nom et niveau de l'objet par d�faut
		anonyme.decrisToi();

		//afficher chaque objet � l'aide de la m�thode decrisToi()
		// et comparer les pv des pokemon entre eux en utilisant la m�thode d�finie
		marisson.decrisToi();
		System.out.println(marisson.trouverMax(grenousse.pv) + grenousse.nom); //TODO trouver le moyen d'int�grer l'affichage du nom directement dans la m�thode
		System.out.println(marisson.trouverMax(feunnec.pv) + feunnec.nom + "\n");

		feunnec.decrisToi();
		System.out.println(feunnec.trouverMax(grenousse.pv) + grenousse.nom);
		System.out.println(feunnec.trouverMax(marisson.pv) + marisson.nom + "\n");

		grenousse.decrisToi();
		System.out.println(grenousse.trouverMax(marisson.pv) + marisson.nom);
		System.out.println(grenousse.trouverMax(feunnec.pv)+ feunnec.nom + "\n");



	};

}
