package com.example.solidprinciples.service

import com.example.solidprinciples.model.User

/**
 * Please use either of
 * [CreditCardService]
 * [DebitCardService]
 * [WalletService]
 * [VisaCardService]
 * [MasterCardService]
 */
@Deprecated("Violate Single Responsibility, Interface Segregation")
interface RegisterCardService {
    fun registerCreditCard(user: User)
    fun registerDebitCard(user: User)
    fun registerWallet(user: User)
    fun registerVisaCard(user: User)
    fun registerMasterCard(user: User)
}