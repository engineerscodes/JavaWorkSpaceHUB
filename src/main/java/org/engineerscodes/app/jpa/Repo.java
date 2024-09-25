package org.engineerscodes.app.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface Repo extends JpaRepository<millions, Long> {

    @Query("select m from millions m")
    Stream<millions> findAllByStreaming();
}
