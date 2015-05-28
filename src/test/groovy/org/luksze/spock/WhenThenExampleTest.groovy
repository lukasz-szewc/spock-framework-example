package org.luksze.spock

import spock.lang.Specification

class WhenThenExampleTest extends Specification {

    def "setup block example"() {
        setup:
        def stack = new Stack()
        def elem = "push me"

        when:
        stack.push(elem)

        then:
        stack.size() == 1
        stack.peek() == elem
    }

    def "multiple when then example"() {
        setup:
        def stack = new Stack()

        when:
        stack.push("element")

        then:
        stack.size() == 1

        when:
        stack.push("other element")

        then:
        stack.size() == 2
        stack.peek() == "other element"
    }
}
