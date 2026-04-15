package oop_00000121658_DevisGeraldo.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("SMengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}