package ABCintro.test;

import java.util.Scanner;

public class cpf {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int somaX = 0;
            int somaY = 0;
            String cpf = "";
            int vx = 0;
            int vy = 0;


            while(true){
                System.out.print("Digite seu CPF: ");
                cpf = leitor.nextLine();
                cpf = cpf.replaceAll("\\D", "");

                if(cpf.length() != 11){
                    System.out.println("<------------->");
                    System.out.println("CPF inválido!!!");
                    System.out.println("Tente Novamente");
                    System.out.println("<------------->");
                }else{
                    break;
                }
            }

            // TESTANDO VERIFICADOR X

            for (int i = 0, peso = 10; i < 9; i++, peso--) {
                int numero = cpf.charAt(i) - '0';
                somaX += (numero * peso);
            }

            if(somaX % 11 < 2){
                vx = 0;
            }else{
                vx = (11 - (somaX % 11));
            }

            int x = cpf.charAt(9) - '0';
            if(x == vx){
                System.out.println("<--- Digito verificador X válido --->");
            }else{
                System.out.println("<--- Digito verificador X inválido --->");
                System.out.println("       <--- Tente novamente! --->      ");
                return;
            }

            // TESTANDO VERIFICADOR Y

            for(int i = 0, peso = 11; i < 9; i++, peso--){
                int numero  = cpf.charAt(i) - '0';
                somaY += (numero * peso);
            }

            somaY += vx * 2;

            if(somaY % 11 < 2){
                vy = 0;
            }else{
                vy = (11 - (somaY % 11));
            }

            int y = cpf.charAt(10) - '0';
            if( y == vy){
                System.out.println("<--- Digito verificador Y válido --->");
            }else{
                System.out.println("<--- Digito verificador Y inválido --->");
                System.out.println("       <--- Tente novamente! --->      ");
                return;
            }


            char digito = cpf.charAt(8);

            switch(digito){
                case '0' : System.out.print("CPF da região: Rio Grande do Sul");break;
                case '1' : System.out.print("CPF da região: Distrito Federal, Goiáis, Mato Grosso, Mato Grosso do Sul e Tocantins");break;
                case '2' : System.out.print("CPF da região: Amazonas, Pará, Roraima, Amapá, Acre e Rondônia");break;
                case '3' : System.out.print("CPF da região: Ceará, Maranhão e Piauí");break;
                case '4' : System.out.print("CPF da região: Paraíba, Pernambuco, Alagoas e Rio Grande do Norte");break;
                case '5' : System.out.print("CPF da região: Bahia e Sergipe");break;
                case '6' : System.out.print("CPF da região: Minas Gerais");break;
                case '7' : System.out.print("CPF da região: Rio de Janeiro e Espírito Santo");break;
                case '8' : System.out.print("CPF da região: São Paulo");break;
                case '9' : System.out.print("CPF da região: Paraná e Santa Catarina");break;
            }
        }
    }
}
