package com.example.pedroraitzclientes.projeto.domain.repositorio;

import com.example.pedroraitzclientes.projeto.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Clientes extends JpaRepository<Cliente, Integer > {

    @Query(value = " select * from cliente c where c.id =:id ", nativeQuery = true)
    List<Cliente> encontrarPorId( @Param("id") Integer id );

    @Query(" delete from Cliente c where c.id =:id ")
    @Modifying
    void deleteById(Integer id);

    boolean existsById(Integer id);

    boolean existsByCpf(String cpf);

}
