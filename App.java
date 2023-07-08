public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Alan", 31, 62, 1.61);
        System.out.println("Hello, World!");
        int idade = 31;
        System.out.println(idade);
        pessoa1.info();
        pessoa2.info();
    }
}
