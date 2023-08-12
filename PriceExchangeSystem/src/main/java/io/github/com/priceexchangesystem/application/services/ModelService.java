package io.github.com.priceexchangesystem.application.services;

import java.util.List;
import java.util.Optional;

//Aprendendo a abstrair coisas que se repetem no codigo de forma geral. aqui eu estou criando um service generico que pode ser usado
//por outras classes que usam metodos genericos

public interface ModelService<T> {

    List<T> getAll();

    Optional<T> getById(Long id);

    T save(T body);

    T put(Long id, T body);

    void delete(Long id);
}
