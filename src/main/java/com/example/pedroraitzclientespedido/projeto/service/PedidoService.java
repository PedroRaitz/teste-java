package com.example.pedroraitzclientespedido.projeto.service;

import com.example.pedroraitzclientespedido.projeto.domain.entity.Pedido;
import com.example.pedroraitzclientespedido.projeto.rest.controller.dto.PedidoDto;

import java.util.Optional;

public class PedidoService {

    Pedido salvar(PedidoDto dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);

}
