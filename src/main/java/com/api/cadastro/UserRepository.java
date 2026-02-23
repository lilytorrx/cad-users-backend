package com.api.cadastro;

import com.api.cadastro.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface UserRepository extends MongoRepository<User, String> {
    @Override
    <S extends User> S insert(S entity);

    @Override
    <S extends User> List<S> insert(Iterable<S> entities);

    @Override
    <S extends User> List<S> findAll(Example<S> example);

    @Override
    <S extends User> List<S> findAll(Example<S> example, Sort sort);

    @Override
    <S extends User> List<S> saveAll(Iterable<S> entities);

    @Override
    List<User> findAll();

    @Override
    List<User> findAllById(Iterable<String> strings);

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(User entity);

    @Override
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    void deleteAll(Iterable<? extends User> entities);

    @Override
    void deleteAll();

    @Override
    List<User> findAll(Sort sort);

    @Override
    Page<User> findAll(Pageable pageable);

    @Override
    <S extends User> Optional<S> findOne(Example<S> example);

    @Override
    <S extends User> Page<S> findAll(Example<S> example, Pageable pageable);

    @Override
    <S extends User> long count(Example<S> example);

    @Override
    <S extends User> boolean exists(Example<S> example);

    @Override
    <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}