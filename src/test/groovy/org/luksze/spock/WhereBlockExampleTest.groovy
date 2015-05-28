package org.luksze.spock

import spock.lang.Specification

class WhereBlockExampleTest extends Specification {
    def "where block Example"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 1, -1]
        b << [6, 2, 33]
        c << [6, 2, 33]
    }
}
