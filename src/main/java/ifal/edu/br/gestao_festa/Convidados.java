package ifal.edu.br.gestao_festa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}