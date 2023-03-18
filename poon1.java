public class Aluno {
    String nome;
    Int notas;

   public Aluno(String nome, Int notas) {
       this.nome = nome;
       this.notas = notas;
   }

   public double calcularMedia() {
       double somaNotas = 0;
       for (double nota : notas.values()) {
           somaNotas += nota;
       }
       return somaNotas / notas.size();
   }

   public String getNome() {
       return nome;
   
   }

   public Int getNotas() {
       return notas;
   }

   public void setNotas(notas) {
       this.notas = notas;
   System.out.println(notas)
        }
}