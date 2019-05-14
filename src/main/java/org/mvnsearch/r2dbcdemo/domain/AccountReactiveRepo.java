package org.mvnsearch.r2dbcdemo.domain;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

/**
 * account reactive repository
 *
 * @author linux_china
 */
public interface AccountReactiveRepo extends ReactiveCrudRepository<Account, Integer> {

    @Query("SELECT * FROM account WHERE nick = :nick")
    Mono<Account> findByNick(String nick);
}
