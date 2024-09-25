package org.engineerscodes.app;

import lombok.extern.slf4j.Slf4j;
import org.engineerscodes.app.jpa.Repo;
import org.engineerscodes.app.jpa.millions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@Slf4j
public class MillionsService {

    @Autowired
    private Repo repo;

    @Autowired
    @Qualifier("db2EntityManagerFactory")
    R2dbcEntityOperations R2dbcEntityOperations;


    public Flux<millions> processStreaming() {
        //List<millions> millionsList = repo.findAll();
        //millionsList.parallelStream().forEach(System.out::println);
        return R2dbcEntityOperations.select(millions.class).matching(Query.query(Criteria.empty())
                .sort(Sort.by("id").ascending()).limit(1_000_000)).all();
    }
}
