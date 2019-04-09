package net.snopser.bank.snopserbank.repository;

import net.snopser.bank.snopserbank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Виктор Фалькенберг (viktor.falkenberg@mediascope.net)
 */

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
