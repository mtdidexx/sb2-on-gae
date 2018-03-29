package net.katrinka.cron

import spock.lang.Specification

class CronJobServiceTest extends Specification {
    def "it starts the integration when invoked"() {
        given:
        CronJobService cjs = new CronJobService()

        when:
        cjs.startIntegration()

        then:
        noExceptionThrown()
    }
}
