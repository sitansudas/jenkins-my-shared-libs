def call(emailId){
    emailext(
            subject: "Build Successful",
            body: "Good news! Your build was successful.",
            to: "${emailId}"
        )
}
