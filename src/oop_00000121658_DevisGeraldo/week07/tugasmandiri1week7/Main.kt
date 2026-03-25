package oop_00000121658_DevisGeraldo.week07.tugasmandiri1week7

fun main() {

    //Singleton test
    GameManager.startGame()
    GameManager.startGame()

    println("------")

    //Enum test
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    println("------")

    //Factory test
    val starterWeapon = Weapon.forgeStarterSword()
    println("Weapon: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")

    println("------")

    //Copy (immutability)
    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Upgraded Weapon Damage: ${upgradedItem.damage}")

    println("------")

    //Event simulation
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}