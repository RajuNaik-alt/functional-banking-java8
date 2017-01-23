package io.noorulhaq.functional.banking.domain.algebra;

import io.noorulhaq.functional.banking.domain.model.Account;
import javaslang.control.Option;
import javaslang.control.Try;

/**
 * Created by Noor on 1/14/17.
 */
public abstract class AccountRepository implements Repository<Account, String> {

    public abstract Try<Option<Account>> query(String no);

    public abstract Try<Account> store(Account account);

}
