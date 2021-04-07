enum class LootType{
    POTION,
    RING,
    ARMOUR
}
class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return "$name is $type and  it is worth $value"
    }
}