package med.voli.api.entities.dto;

import med.voli.api.entities.enuns.EspecialidadeEnum;

public record DadosCadastroMedico(String nome, String email, String crm, EspecialidadeEnum especialidade, DadosEndereco endereco) {
}
