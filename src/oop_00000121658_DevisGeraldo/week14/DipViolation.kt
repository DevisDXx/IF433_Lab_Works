package oop_00000121658_DevisGeraldo.week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id = $id")
}