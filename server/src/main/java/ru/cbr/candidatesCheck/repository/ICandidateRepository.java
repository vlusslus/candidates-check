package ru.cbr.candidatesCheck.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.cbr.candidatesCheck.domen.Candidate;

public interface ICandidateRepository implements JpaRepository<Candidate,Long>{
}
