package net.katrinka.web

import spock.lang.Specification

class SayHelloServiceTest extends Specification {
    def "it says hello"() {
        given:
        SayHelloService service = new SayHelloService()

        when:
        String response = service.sayHello()

        then:
        assert response.length() > 0
        assert response.toUpperCase().contains("SUCKA")
    }
}
