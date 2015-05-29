package org.luksze.spock

import spock.lang.Specification
import spock.lang.Unroll

class WhereBlockExampleTest extends Specification {

    @Unroll
    def "where block Example"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 1, -1]
        b << [6, 2, 33]
        c << [6, 2, 33]
    }

    @Unroll
    def "maximum of two numbers #a #b #c"() {
        expect: Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        4 | 5 | 5
        9 | 1 | 9
    }

    void setup() {
        println 'setup'
    }
}
