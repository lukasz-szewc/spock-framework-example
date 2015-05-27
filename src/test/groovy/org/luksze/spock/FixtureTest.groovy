package org.luksze.spock

import spock.lang.Specification

class FixtureTest extends Specification {

    def account = new Account(100)

    def 'new object should contain initial value 100'() {
        expect: account.total == 100
    }

    def 'test fixture can change it state in test scope only'() {
        when: account.increase(40)
        then: account.total == 140
    }

    def 'even if one test modify fixture, new test will have fresh value'() {
        expect: account.total == 100
    }
}
