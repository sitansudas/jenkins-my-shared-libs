def call(emailId){
    emailext(
            subject: "Build Failed",
            body: "Badd news! Your build was unsuccessful and failed.",
            to: "${emailId}"
        )
}
