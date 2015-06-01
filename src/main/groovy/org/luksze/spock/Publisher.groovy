package org.luksze.spock

class Publisher {
    List<Subscriber> subscribers = new ArrayList<>()

    def publish(String message) {
        for (Subscriber each : subscribers) {
            each.consume(message)
        }
    }
}
