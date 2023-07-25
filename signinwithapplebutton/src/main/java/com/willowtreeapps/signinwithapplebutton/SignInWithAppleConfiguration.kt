package com.willowtreeapps.signinwithapplebutton

data class SignInWithAppleConfiguration(
    val clientId: String,
    val redirectUri: String,
    val scope: String,
    val nonce: String,
    val state: String
) {

    class Builder {
        private lateinit var clientId: String
        private lateinit var redirectUri: String
        private lateinit var scope: String
        private lateinit var nonce: String
        private lateinit var state: String

        fun clientId(clientId: String) = apply {
            this.clientId = clientId
        }

        fun redirectUri(redirectUri: String) = apply {
            this.redirectUri = redirectUri
        }

        fun scope(scope: String) = apply {
            this.scope = scope
        }

        fun nonce(nonce: String) = apply {
            this.nonce = nonce
        }

        fun state(state: String) = apply {
            this.state = state
        }

        fun build() = SignInWithAppleConfiguration(clientId, redirectUri, scope, nonce, state)
    }
}
