package com.gtunes

class Company {

    String name
    Integer numberOfEmployees
    BigDecimal salaryPaidYTD

    BigDecimal cash
    BigDecimal receivables
    BigDecimal capital
    BigDecimal netWorth

    BigDecimal getNetWorth() {
        cash + receivables + capital
    }

    static mapping = {
        netWorth formula : 'CASH + RECEIVABLES + CAPITAL'
    }

    static transients = ['salaryPaidYTD', 'netWorth']

    static constraints = {
    }
}
