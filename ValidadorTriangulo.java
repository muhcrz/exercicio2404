import java.util.Scanner;

public class ValidadorTriangulo{
 public static void main(String[] args) {
    //Declaração de variáveis
    int a, b, c; //Lados de um triângulo

    //Criação e instância do objeto de entrada 
    Scanner entrada = new Scanner(System.in);

    //Apresentação
    System.out.println("\n\t\t\t -- Validador de Triangulo --\n");
    
    //Entrada
    System.out.print("Informe o lado a: ");
    a = entrada.nextInt();
    System.out.print("Informe o lado b: ");
    b = entrada.nextInt();
    System.out.print("Informe o lado c: ");
    c = entrada.nextInt();

    //Processamento 
    if ((a <(b+c)) && (b< (a+c)) && ( c < (a+b))){
        
        //É triângulo
        System.out.printf("\n%d, %d e %d formam triangulo!\n", a, b, c);

         //Verificador de triângulo
        
         if (a == b && b == c) {
            System.out.println("Tipo: Equilátero ");
        } else if (a == b || a == c || b == c) {
            System.out.println("Tipo: Isósceles");
        } else {
            System.out.println("Tipo: Escaleno ");
        }
    } else {
        // Não é triângulo
        System.out.printf("\n%d, %d e %d NÃO formam um triângulo!\n", a, b, c);
    
    }}}