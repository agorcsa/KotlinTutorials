package enemy

// superclass
// marked as "open" so that it can be inherited
open class Enemy(val name: String,
            var hitPoints: Int,
            var lives: Int) {

    // Kotlin doesn't allow function to be overwritten, unless they are marked with "open"
    open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage and has $hitPoints points left now.")
        } else {
            lives -= 1
            if(lives > 0) {
                println("$name lost a life")
            } else {
                println("No lives left. $name is dead!")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, HitPoints: $hitPoints, Lives: $lives"
    }
}