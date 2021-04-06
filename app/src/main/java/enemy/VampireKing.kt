package enemy

class VampireKing(name: String) : Vampire(name) {

    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}