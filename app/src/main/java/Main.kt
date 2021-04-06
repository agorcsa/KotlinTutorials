import enemy.Enemy
import enemy.Troll
import enemy.Vampire
import enemy.VampireKing

fun main() {

    // in Kotlin the Base class for all other classes is Any

    val enemy = Enemy("Test enemy.Enemy", 50, 3)
    enemy.takeDamage(60)
    println(enemy)

    val uglyTroll = Troll("Ugly enemy.Troll")
    println(uglyTroll)

    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.takeDamage(40)
    println(dracula)
}


