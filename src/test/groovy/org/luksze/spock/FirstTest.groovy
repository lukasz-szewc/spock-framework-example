package org.luksze.spock

import spock.lang.Specification

class FirstTest extends Specification {
    def "let's try this!"() {
        expect:
        Math.max(1, 2) == 2
    }

    def "second test"() {
        expect: 1 + 1 == 2
    }

    def "given when then example test"() {
        given:
        def account = new Account()

        when:
        account.increase(100)

        then:
        account.total == 100
    }
}
