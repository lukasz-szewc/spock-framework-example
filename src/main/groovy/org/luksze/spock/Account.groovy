package org.luksze.spock

class Account {
    int total = 0

    Account() {
        this(0)
    }

    Account(initial) {
        total = initial
    }

    def increase(int increaseValue) {
        total += increaseValue
    }

    def decrease(int decreasedValue) {
        total = total - decreasedValue
    }
}
