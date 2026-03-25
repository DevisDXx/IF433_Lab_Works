package oop_00000121658_DevisGeraldo.week07.tugasmandiri1week7

sealed class BattleState {

    data class MonsterEncounter(val monsterName: String) : BattleState()

    data class LootDropped(val item: GameItem) : BattleState()

    data class GameOver(val reason: String) : BattleState()

    object SafeZone : BattleState()
}