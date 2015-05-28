package org.luksze.spock

import spock.lang.Specification

class WhenThenExampleTest extends Specification {

    def "setup block example"() {
        setup:
        def stack = new Stack()
        def elem = "push me"
        assert stack.size() == 0

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

    def "exception condition example"() {
        setup:
        def stack = new Stack<String>()

        when:
        stack.pop()

        then:
        thrown(EmptyStackException)
    }

    def "multiple assertions example"() {
        expect: multipleAssertions("text")
    }

    void multipleAssertions(String text) {
        assert text.length() == 4
        assert text.toUpperCase() == "TEXT"
        assert text.charAt(0) == (char) 't'
    }
}
