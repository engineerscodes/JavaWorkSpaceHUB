package org.engineerscodes.app;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.stream.Stream;

@Service
public class MillionsService {

    private final Repo repo;

    public MillionsService(Repo repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public void processStreaming() {
       /* try (Stream<millions> stream = repo.findAllByStreaming()) {
            stream.forEach(million -> {
                System.out.println(million);
                if(million.getId()%200000==0){System.out.println("GCCC");System.gc();}
            });
        }*/
        repo.findAll();
    }
}
