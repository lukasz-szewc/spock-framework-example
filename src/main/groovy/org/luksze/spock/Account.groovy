package org.luksze.spock

class Account {
    int total = 0

    def increase(int increaseValue) {
        total += increaseValue
    }
}
