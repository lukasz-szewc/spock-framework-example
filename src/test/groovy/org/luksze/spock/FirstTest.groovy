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
}
