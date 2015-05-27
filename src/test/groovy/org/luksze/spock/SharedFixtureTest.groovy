package org.luksze.spock

import spock.lang.Shared
import spock.lang.Specification

class SharedFixtureTest extends Specification {
    @Shared def account = new Account(100)

    def "shared account can increase value"() {
        when: account.increase(1)
        then: account.total == 101
    }

    def "account size is greater than 100"() {
        expect: account.total > 100
    }
}
