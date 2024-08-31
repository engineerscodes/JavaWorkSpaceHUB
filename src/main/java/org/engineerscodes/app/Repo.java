package org.engineerscodes.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

public interface Repo extends JpaRepository<millions, Long> {

    @Query("select m from millions m")
    Stream<millions> findAllByStreaming();
}
