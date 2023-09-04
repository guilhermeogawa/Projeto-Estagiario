import java.time.LocalDate;

import PROJETO_ESTAGIARIO.aula04.dominio.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario F1 = new Funcionario();

        F1.setCodigo(01);
        F1.setNome("Luizao");
        F1.setEmail("mail@mail.com");
        F1.setTelefone("67999999999");
        F1.setDataNascimento(LocalDate.of(1990,9,2));
        F1.setContaCorrente("9999999");
        F1.setUsuario("usuario");
        F1.setSenha("senha");




    }
}
