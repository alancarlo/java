import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private double altura;

    public Pessoa(){
      
        setNome(
            JOptionPane.showInputDialog(
                null, "Insira o nome")
                .toString()
        );
        setIdade(Integer.parseInt(
            JOptionPane.showInputDialog(null, "Insira a idade")
            
        ));
            setPeso(Float.parseFloat(
                JOptionPane.showInputDialog(null ,"Insira o peso")
                
            ));
            setAltura(Float.parseFloat(
                JOptionPane.showInputDialog( null,"Insira a altura")
                )
            );

    }

    public Pessoa(String name, int idade,
    float peso, double altura){
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }
    public String getName(){
        return this.nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void info(){
        JOptionPane.showMessageDialog(null,
        "Nome:"+ getNome()+
        "Idade: "+ getNome()+
        "Altura: "+ getAltura()+
        "Peso: "+ getPeso()
        );
        
    }
}
