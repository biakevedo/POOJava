public class Musica {

        // 1 Atributo

        public String titulo;
        public String artista;
        public int tempoDeDuracao;


        // 2 Construtor
        public Musica(String titulo, String artista, int tempoDeDuracao) {
                this.titulo = titulo;
                this.artista = artista;
                this.tempoDeDuracao = tempoDeDuracao;
        }

        // 3 Método para exibir a ficha técnica da música
        public void exibirFichaTecnica() {
                int minutos = tempoDeDuracao / 60; // Convertendo os segundos para minutos
                int segundos = tempoDeDuracao % 60; // Obtendo o restante dos segundos

                System.out.println("Ficha Técnica da Música:");
                System.out.println("Título: " + this.titulo);
                System.out.println("Artista: " + this.artista);
                System.out.println("Duração: " + minutos + " min " + segundos + " seg");


        }
}
