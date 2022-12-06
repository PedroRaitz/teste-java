package com.example.pedroraitzclientespedido.projeto.service;

import com.example.pedroraitzclientespedido.projeto.domain.entity.Pedido;
import com.example.pedroraitzclientespedido.projeto.domain.repositorio.Clientes;
import jakarta.transaction.Transactional;

public class impl {
    private final Pedido repository;
    private final Clientes clientesRepository;


    @Override
    @Transactional
    public Pedido salvar( PedidoDTO dto ) {
        Integer idCliente = dto.getCliente();
        Cliente cliente = clientesRepository
                .findById(idCliente)
                .orElseThrow(() -> new RegraNegocioException("Código de cliente inválido."));

        Pedido pedido = new Pedido();
        pedido.setTotal(dto.getTotal());
        pedido.setDataPedido(LocalDate.now());
        pedido.setCliente(cliente);

    }

}
