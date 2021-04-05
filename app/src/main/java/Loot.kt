enum class LootType{
    POTION,
    RING,
    ARMOUR
}
class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return """
            loot name: $name
            loot type: $type
            loot value: $value
        """
    }
}