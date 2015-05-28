package org.luksze.spock

import spock.lang.Specification

import java.util.concurrent.atomic.AtomicInteger

class FixtureMethodTest extends Specification {

    def number = new AtomicInteger()
    static staticNumber = new AtomicInteger()

    def setupSpec() {
        println "before specification"
        staticNumber.incrementAndGet()
    }

    def setup() {
        println "before method"
        number.incrementAndGet()
    }

    def "first feature method"() {
        println "first test method"
        expect: number.incrementAndGet() == 2
        and: staticNumber.incrementAndGet() == 2
    }

    def "second feature method"() {
        println "second test method"
        expect: number.incrementAndGet() == 2
        and: staticNumber.incrementAndGet() == 3
    }

    def cleanup() {
        println "cleanup method"
    }

    def cleanupSpec() {
        println "after specification"
    }
}
