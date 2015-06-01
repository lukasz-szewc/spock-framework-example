package org.luksze.spock

import spock.lang.Specification

class MockingTest extends Specification {

    def publisher = new Publisher()
    def firstMock = Mock(Subscriber)
    def secondMock = Mock(Subscriber)

    def setup() {
        publisher.subscribers.add(firstMock)
        publisher.subscribers.add(secondMock)
    }

    def "should send message to all subscribers, exactly once"() {
        when: publisher.publish("hello")

        then:
        1 * firstMock.consume("hello")
        1 * secondMock.consume("hello")
    }
}


