def call(emailId){
   success {
        emailext(
            subject: "Build Successful",
            body: "Good news! Your build was successful.",
            to: "${emailId}"
        )
    }

    failure {
        emailext(
            subject: "Build Failed",
            body: "Bad news! Your build has failed.",
            to: "${emailId}"
        )
    }
}
