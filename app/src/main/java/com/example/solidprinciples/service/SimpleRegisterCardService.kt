package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

/**
 * Please use either of
 * [CreditCardServiceImpl]
 * [DebitCardServiceImpl]
 * [WalletServiceImpl]
 * [VisaCardServiceImpl]
 * [MasterCardServiceImpl]
 */
@Deprecated("Violate Single Responsibility, Interface Segregation")
class SimpleRegisterCardService : RegisterCardService {
    override fun registerCreditCard(user: User) {
        println("Registering CreditCard")
    }

    override fun registerDebitCard(user: User) {
        println("Registering DebitCard")
    }

    override fun registerWallet(user: User) {
        println("Registering Wallet")
    }

    override fun registerVisaCard(user: User) {
        println("Registering VisaCard")
    }

    override fun registerMasterCard(user: User) {
        println("Registering MasterCard")
    }
}